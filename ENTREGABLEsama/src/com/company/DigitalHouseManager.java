package com.company;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    //atributos

    private List<Alumno> listaDeAlumnos;
    private List<Profesor> listaDeProfesores;
    private List<Curso> listaDeCursos;
    private List<Inscripcion> listaDeInscripciones;

    //constructor

    public DigitalHouseManager() {

        this.listaDeAlumnos = new ArrayList<>();
        this.listaDeProfesores = new ArrayList<>();
        this.listaDeCursos = new ArrayList<>();
        this.listaDeInscripciones = new ArrayList<>();
    }


    //metodos


    //dar de alta un curso

    public void altaCurso(String nombre, Integer codigoDeCurso, Integer cupoMaximoDeAlumnos) {
        listaDeCursos.add(new Curso(nombre, codigoDeCurso, cupoMaximoDeAlumnos));
        System.out.println("Curso creado");
    }


    //dar de baja el curso


    public void bajaCurso(Integer unCodigoDeCurso) {
        Curso cursoBuscado = null;
        for (Curso curso : listaDeCursos) {
            if (curso.getCodigoDeCurso().equals(unCodigoDeCurso)) {
                cursoBuscado = curso;
            }
        }
        listaDeCursos.remove(cursoBuscado);
        System.out.println("Curso eliminado");
    }


    //alta profesor adjunto

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        listaDeProfesores.add(new ProfesorAdjunto(nombre, apellido, 0, codigoProfesor, cantidadDeHoras));
        System.out.println("Profesor adjunto creado");
    }


    //alta profesor titular

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad) {
        listaDeProfesores.add(new ProfesorTitular(nombre, apellido, 0, codigoProfesor, especialidad));
        System.out.println("Profesor titular creado");
    }


    //baja profesor

    public void bajaProfesor(Integer unCodigoDeProfesor) {
        Profesor profesorBuscado = null;
        for (Profesor profesor : listaDeProfesores) {
            if (profesor.getCodigoDeProfesor().equals(unCodigoDeProfesor)) {
                profesorBuscado = profesor;
            }
        }
        listaDeProfesores.remove(profesorBuscado);
        System.out.println("Profesor eliminado");
    }


    //alta alumno

    public void altaAlumno(String nombre, String apellido, Integer codigoDeAlumno) {
        listaDeAlumnos.add(new Alumno(nombre, apellido, codigoDeAlumno));
        System.out.println("Alumno creado");
    }


    //inscribir un alumno a un curso

    public void inscribirAlumno(Integer codigoDeAlumno, Integer codigoDeCurso) {

        //busco el curso

        Curso cursoBuscado = buscarCursoPorCodigo(codigoDeCurso);

        //busco el alumno

        Alumno alumnoBuscado = buscarAlumnoPorCodigo(codigoDeAlumno);

        //inscribo al alumno si se puede

        if (cursoBuscado.quedanCupos()) {
            listaDeInscripciones.add(new Inscripcion(alumnoBuscado, cursoBuscado));
            System.out.println("Inscripcion realizada");
        } else {
            System.out.println("No se pudo realizar la inscripcion por falta de cupo");
        }
    }


    //asignar profesores a un curso (sin terminar)

    public void asignarProfesores(Integer codigoDeCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){

        ProfesorTitular profesorTitularBuscado = (ProfesorTitular)buscarProfesorPorCodigo(codigoProfesorTitular);

        ProfesorAdjunto profesorAdjuntoBuscado = (ProfesorAdjunto)buscarProfesorPorCodigo(codigoProfesorAdjunto);

        Curso cursoBuscado = buscarCursoPorCodigo(codigoDeCurso);

                //setters de profesores?

        cursoBuscado.setProfesorTitular(profesorTitularBuscado);
        cursoBuscado.setProfesorAdjunto(profesorAdjuntoBuscado);

        System.out.println("Profesores asignados");
    }



    //metodos para buscar

    public Alumno buscarAlumnoPorCodigo(Integer unCodigoDeAlumno) {
        Alumno alumnoBuscado = null;
        for (Alumno alumno : listaDeAlumnos) {
            if (alumno.getCodigoDeAlumno().equals(unCodigoDeAlumno)) {
                alumnoBuscado = alumno;
            }
        }
        return alumnoBuscado;
    }


    public Curso buscarCursoPorCodigo(Integer unCodigoDeCurso) {
        Curso cursoBuscado = null;
        for (Curso curso : listaDeCursos) {
            if (curso.getCodigoDeCurso().equals(unCodigoDeCurso)) {
                cursoBuscado = curso;
            }
        }
        return cursoBuscado;
    }


    public Profesor buscarProfesorPorCodigo(Integer unCodigoDeProfesor) {
        Profesor profesorBuscado = null;
        for (Profesor profesor : listaDeProfesores) {
            if (profesor.getCodigoDeProfesor().equals(unCodigoDeProfesor)) {
                profesorBuscado = profesor;
            }
        }
        return profesorBuscado;
    }

}

