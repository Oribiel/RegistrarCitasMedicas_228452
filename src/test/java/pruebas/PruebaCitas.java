package pruebas;

import Modelo.*;
import Control.*;
import Vista.IVista;


public class PruebaCitas {
    private static int comprobaciones;
    private static class VistaPrueba implements IVista {
        int avisos;
        IModelo recibido;
        @Override
        public void update(IModelo consulta) {
            avisos++;
            recibido = consulta;
        }
    }
    private static void verificar(boolean condicion, String mensaje) {
        if (!condicion) { throw new AssertionError(mensaje); }
        comprobaciones++;
    }
    public static void main(String[] args) {
        RegistroCitas dominio = new RegistroCitas();
        ModeloCitas modelo = new ModeloCitas(dominio);
        ControlCitas control = new ControlCitas(modelo);
        VistaPrueba vista = new VistaPrueba();
        modelo.attach(vista);
        modelo.attach(vista);
        modelo.notificar();
        verificar(vista.avisos == 1, "No duplicar observador");
        verificar(vista.recibido == modelo, "update recibe el mismo modelo como IModelo");
        control.buscarPaciente("12345678901");
        verificar(modelo.getPaciente().getNombre().equals("Ana López Pérez"), "Buscar por NSS");
        verificar(vista.avisos == 2, "Notificar al buscar");
        Medico medico = modelo.getMedicos().get(0);
        control.seleccionarMedico(medico);
        verificar(modelo.getMedicoSeleccionado() == medico, "Seleccionar médico");
        verificar(modelo.getHorariosDisponibles().size() == 2, "Consultar horarios del médico");
        Horario horario = modelo.getHorariosDisponibles().get(0);
        control.apartarCita(horario);
        Cita cita = modelo.getCita();
        verificar(cita != null && cita.getPaciente() == modelo.getPaciente(), "Registrar para el paciente");
        verificar(cita.getMedico() == medico && cita.getHorario() == horario, "Conservar médico y horario");
        verificar(horario.isOcupado(), "Ocupar horario reservado");
        verificar(modelo.getHorariosDisponibles().size() == 1, "No ofrecer horario ocupado");
        verificar(vista.avisos == 4, "Notificar cada acción del flujo básico");
        control.buscarPaciente("10987654321");
        verificar(modelo.getCita() == null && modelo.getMedicoSeleccionado() == null, "Limpiar selección anterior");
        control.seleccionarMedico(medico);
        control.apartarCita(horario);
        verificar(modelo.getCita() == null && modelo.getAviso().contains("no está disponible"), "Rechazar doble reserva");
        Medico otro = modelo.getMedicos().get(1);
        Horario deOtro = dominio.getHorariosDisponibles(otro).get(0);
        control.apartarCita(deOtro);
        verificar(modelo.getCita() == null && !deOtro.isOcupado(), "Rechazar horario de otro médico");
        control.buscarPaciente("000");
        verificar(modelo.getPaciente() == null && modelo.getAviso().contains("No se encontró"), "NSS inexistente");
        control.apartarCita(null);
        verificar(modelo.getCita() == null, "No reservar sin datos");
        int antes = vista.avisos;
        modelo.detach(vista);
        control.buscarPaciente("12345678901");
        verificar(vista.avisos == antes, "detach elimina observador");
        System.out.println("Correcto: " + comprobaciones + " comprobaciones de dominio, MVC y Observer.");
    }
}
