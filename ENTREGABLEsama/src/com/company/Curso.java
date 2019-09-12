package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {


    //atributos

    private String nombre;
    private Integer codigoDeCurso;
    private Integer cantidadDeAlumnosPermitidos;
    private List<Alumno> listaDeAlumnosInscriptos;
    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;


    //constructor

    public Curso(String nombre, Integer codigoDeCurso, Integer cantidadDeAlumnosPermitidos) {

        this.nombre = nombre;
        this.codigoDeCurso = codigoDeCurso;
        this.cantidadDeAlumnosPermitidos = cantidadDeAlumnosPermitidos;
        this.listaDeAlumnosInscriptos = new ArrayList<>();
    }


    //equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(this.codigoDeCurso, curso.codigoDeCurso);
    }


    //getters/setters

    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public Integer getCantidadDeAlumnosPermitidos() {
        return cantidadDeAlumnosPermitidos;
    }

    public void setProfesorTitular(ProfesorTitular nuevoProfesorTitular){
        profesorTitular = nuevoProfesorTitular;
    }

    public void setProfesorAdjunto(ProfesorAdjunto nuevoProfesorAdjunto) {
        profesorAdjunto = nuevoProfesorAdjunto;
    }




    //metodos

    public Boolean agregarUnAlumno(String nombre, String apellido, Integer codigoDeAlumno) {
        if (listaDeAlumnosInscriptos.size() < cantidadDeAlumnosPermitidos) {
            Alumno alumno = new Alumno(nombre, apellido, codigoDeAlumno);
            listaDeAlumnosInscriptos.add(alumno);
        return true;
        } else {
            return false;
        }
    }

    public Boolean quedanCupos() {
        return listaDeAlumnosInscriptos.size() < cantidadDeAlumnosPermitidos;
    }

    public void eliminarAlumno(Alumno alumnoBuscado){
        listaDeAlumnosInscriptos.remove(alumnoBuscado);
    }


}