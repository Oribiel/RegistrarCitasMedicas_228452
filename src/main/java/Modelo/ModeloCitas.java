package Modelo;

import Modelo.Cita;
import Vista.IVista;
import Modelo.Horario;
import Modelo.Medico;
import Modelo.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ori
 */
public class ModeloCitas implements IModelo {
    private RegistroCitas registro;
    private Paciente paciente;
    private Medico medicoSeleccionado;
    private Cita cita;
    private String aviso = "Ingrese el NSS del paciente.";
    private List<IVista> observadores = new ArrayList<IVista>();

    public ModeloCitas(RegistroCitas registro) {
        this.registro = registro;
    }

    public void attach(IVista vista) {
        if (vista != null && !observadores.contains(vista)) {
            observadores.add(vista);
        }
    }
    public void detach(IVista vista) {
        observadores.remove(vista);
    }
    public void notificar() {
        for (IVista vista : observadores) {
            vista.update(this);
        }
    }

    public void buscarPaciente(String nss) {
        paciente = registro.buscarPaciente(nss.trim());
        medicoSeleccionado = null;
        cita = null;
        if (paciente == null) {
            aviso = "No se encontro un paciente con ese NSS.";
        } else {
            aviso = "Seleccione un medico de la lista.";
        }
        notificar();
    }

    public void seleccionarMedico(Medico medico) {
        if (paciente == null) {
            aviso = "Primero busque un paciente.";
        } else {
            medicoSeleccionado = medico;
            cita = null;
            aviso = "Seleccione fecha y hora; después presione Apartar cita.";
        }
        notificar();
    }

    public void apartarCita(Horario horario) {
        if (paciente == null || medicoSeleccionado == null || horario == null) {
            aviso = "Seleccione paciente, medico y horario.";
        } else {
            try {
                cita = registro.registrarCita(paciente, medicoSeleccionado, horario);
                aviso = "Cita registrada correctamente.";
            } catch (IllegalArgumentException ex) {
                aviso = ex.getMessage();
            }
        }
        notificar();
    }

    @Override
    public Paciente getPaciente() { return paciente; }
    @Override
    public List<Medico> getMedicos() { return registro.getMedicos(); }
    @Override
    public Medico getMedicoSeleccionado() { return medicoSeleccionado; }
    @Override
    public List<Horario> getHorariosDisponibles() {
        return registro.getHorariosDisponibles(medicoSeleccionado);
    }
    @Override
    public Cita getCita() { return cita; }
    @Override
    public String getAviso() { return aviso; }
}
