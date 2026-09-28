package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ori
 */
public class RegistroCitas {
    private List<Paciente> pacientes = new ArrayList<Paciente>();
    private List<Medico> medicos = new ArrayList<Medico>();
    private List<Horario> horarios = new ArrayList<Horario>();
    private List<Cita> citas = new ArrayList<Cita>();

    public RegistroCitas() {
        crearDatosEjemplo();
    }

    private void crearDatosEjemplo() {
        pacientes.add(new Paciente("12345678901", "Oribiel Beltran", 23));
        pacientes.add(new Paciente("10987654321", "Gilberto Borrego", 31));
        Medico uno = new Medico(1, "Dr. House", "Medicina general", "101",
                "Lunes", "09:00 a 10:00");
        Medico dos = new Medico(2, "Dr. Strange", "Dermatología", "202",
                "Martes", "10:00 a 11:00");
        medicos.add(uno);
        medicos.add(dos);
        horarios.add(new Horario(uno, "Lunes", "05/10/2026", "09:00"));
        horarios.add(new Horario(uno, "Lunes", "05/10/2026", "09:30"));
        horarios.add(new Horario(dos, "Martes", "06/10/2026", "10:00"));
        horarios.add(new Horario(dos, "Martes", "06/10/2026", "10:30"));
    }

    public Paciente buscarPaciente(String nss) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNss().equals(nss)) {
                return paciente;
            }
        }
        return null;
    }

    public List<Medico> getMedicos() {
        return new ArrayList<Medico>(medicos);
    }

    public List<Horario> getHorariosDisponibles(Medico medico) {
        List<Horario> disponibles = new ArrayList<Horario>();
        if (medico != null) {
            for (Horario horario : horarios) {
                if (horario.getMedico().getId() == medico.getId() && !horario.isOcupado()) {
                    disponibles.add(horario);
                }
            }
        }
        return disponibles;
    }

    public Cita registrarCita(Paciente paciente, Medico medico, Horario horario) {
        if (!pacientes.contains(paciente) || !medicos.contains(medico)
                || !horarios.contains(horario)) {
            throw new IllegalArgumentException("Seleccione paciente, medico y horario validos.");
        }
        if (horario.getMedico().getId() != medico.getId() || horario.isOcupado()) {
            throw new IllegalArgumentException("Ese horario no esta disponible para el medico.");
        }
        Cita cita = new Cita(paciente, medico, horario);
        citas.add(cita);
        horario.ocupar();
        return cita;
    }
}
