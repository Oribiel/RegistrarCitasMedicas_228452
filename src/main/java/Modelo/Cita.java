/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ori
 */
public class Cita {
    private Paciente paciente;
    private Medico medico;
    private Horario horario;

    public Cita(Paciente paciente, Medico medico, Horario horario) {
        this.paciente = paciente;
        this.medico = medico;
        this.horario = horario;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Horario getHorario() {
        return horario;
    }
    
    
}
