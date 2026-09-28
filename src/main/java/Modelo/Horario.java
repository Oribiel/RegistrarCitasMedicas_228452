/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ori
 */
public class Horario {
    private Medico medico;
    private String dia;
    private String fecha;
    private String hora;
    private boolean ocupado;

    public Horario(Medico medico, String dia, String fecha, String hora) {
        this.medico = medico;
        this.dia = dia;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getDia() {
        return dia;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public boolean isOcupado() {
        return ocupado;
    }

 @Override
    public String toString() { 
        return dia + " " + fecha + " - " + hora; 
    }
    
    
    public void ocupar() {
        ocupado = true;
    }
}
