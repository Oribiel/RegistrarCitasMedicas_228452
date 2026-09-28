/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.util.List;

/**
 *
 * @author ori
 */
public interface IModelo {
    Paciente getPaciente();
    List<Medico> getMedicos();
    Medico getMedicoSeleccionado();
    List<Horario> getHorariosDisponibles();
    Cita getCita();
    String getAviso();
}
