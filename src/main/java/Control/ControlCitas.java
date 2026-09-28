package Control;

import Modelo.Horario;
import Modelo.ModeloCitas;
import Modelo.Medico;

/**
 *
 * @author ori
 */
public class ControlCitas {
    private ModeloCitas modelo;

    public ControlCitas(ModeloCitas modelo) {
        this.modelo = modelo;
    }
    public void buscarPaciente(String nss) {
        modelo.buscarPaciente(nss);
    }
    public void seleccionarMedico(Medico medico) {
        modelo.seleccionarMedico(medico);
    }
    public void apartarCita(Horario horario) {
        modelo.apartarCita(horario);
    }
}
