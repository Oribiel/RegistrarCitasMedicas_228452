package com.mycompany.registrarcitamedica_228452;

import Modelo.RegistroCitas;
import Modelo.ModeloCitas;
import Control.ControlCitas;
import Vista.VistaCitas;


public class RegistrarCitaMedica_228452 {

    public static void main(String[] args) {

        RegistroCitas registro = new RegistroCitas();
        ModeloCitas modelo = new ModeloCitas(registro);
        ControlCitas control = new ControlCitas(modelo);
        VistaCitas vista = new VistaCitas(control);
        modelo.attach(vista);
        modelo.notificar();
        vista.setVisible(true);

    }
}
