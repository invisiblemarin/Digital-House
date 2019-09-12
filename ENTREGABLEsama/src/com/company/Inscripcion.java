package com.company;

import java.util.Date;

public class Inscripcion {

    //atributos

    private Alumno alumno;
    private Curso curso;
    private Date fechaDeInscripcion;


    //constructor

    public Inscripcion(Alumno alumno, Curso curso){
        this.alumno = alumno;
        this.curso = curso;
        this.fechaDeInscripcion = new Date();
    }
}
