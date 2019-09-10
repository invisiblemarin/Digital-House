package com.company;

import java.util.Objects;

public class Alumno {


//Atributos

    private String nombre;
    private String apellido;
    private Integer codigoDeAlumno;


//Constructor

    public Alumno(String nombre, String apellido, Integer codigoDeAlumno) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeAlumno = codigoDeAlumno;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(this.codigoDeAlumno, alumno.codigoDeAlumno);
    }


    //getters/setters

    public Integer getCodigoDeAlumno() {
        return codigoDeAlumno;
    }

}
