/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ori
 */
public class Medico {
    private int id;
    private String nombre;
    private String especialidad;
    private String consultorio;
    private String diasConsulta;
    private String horasConsulta;

    public Medico(int id, String nombre, String especialidad, String consultorio, String diasConsulta, String horasConsulta) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.consultorio = consultorio;
        this.diasConsulta = diasConsulta;
        this.horasConsulta = horasConsulta;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public String getDiasConsulta() {
        return diasConsulta;
    }

    public String getHorasConsulta() {
        return horasConsulta;
    }
    
    @Override
    public String toString() { 
        return nombre; 
    }
}
