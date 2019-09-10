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

    /*private Boolean quedanCupos() {
        if(listaDeAlumnosInscriptos.size() < cantidadDeAlumnosPermitidos){
            return true;
        }else{
            return false;
        }
    }*/

    public void eliminarAlumno(Alumno alumno){
        listaDeAlumnosInscriptos.remove(alumno);
        System.out.println("Alumno eliminado");
        }

    public void eliminarAlumnoPorCodigo(Integer unCodigoDeAlumno) {
        Alumno alumnoARemover = buscarAlumnoPorCodigo(unCodigoDeAlumno);
        eliminarAlumno(alumnoARemover);
    }

    private Alumno buscarAlumnoPorCodigo(Integer unCodigoDeAlumno) {
        Alumno alumnoBuscado = null;
        for (Alumno alumno : listaDeAlumnosInscriptos) {
            if (alumno.getCodigoDeAlumno().equals(unCodigoDeAlumno)) {
                alumnoBuscado = alumno;
            }
        }
        return alumnoBuscado;
    }
}