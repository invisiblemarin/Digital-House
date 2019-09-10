package com.company;

public class ProfesorTitular extends Profesor{

    //atributos

    private String especialidad;

    //constructor

    public ProfesorTitular(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, String especialidad) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);

        this.especialidad = especialidad;

    }

    //getters

    public String getEspecialidad(){
        return especialidad;
    }

    }
