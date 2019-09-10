package com.company;

import java.util.Objects;

public class Profesor {

    //atributos

    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoDeProfesor;

    //constructor

    public Profesor(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor){
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.codigoDeProfesor = codigoDeProfesor;
    }

    //getters/setters

    public Integer getCodigoDeProfesor(){
        return codigoDeProfesor;
    }

    public Integer getAntiguedad(){
        return antiguedad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(this.codigoDeProfesor, profesor.codigoDeProfesor);

    }


}
