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

    public DigitalHouseManager(){

        this.listaDeAlumnos = new ArrayList<>();
        this.listaDeProfesores = new ArrayList<>();
        this.listaDeCursos = new ArrayList<>();
        this.listaDeInscripciones = new ArrayList<>();
    }

    //metodos


    //dar de alta un curso

    public void altaCurso(String nombre, Integer codigoDeCurso, Integer cupoMaximoDeAlumnos){
        Curso curso = new Curso(nombre, codigoDeCurso, cupoMaximoDeAlumnos);

        listaDeCursos.add(curso);
        System.out.println("Curso creado");
    }


    //dar de baja el curso SIN TERMINAR

    private Curso buscarCursoPorCodigo(Integer unCodigoDeCurso) {
        Curso cursoBuscado = null;
        for (Curso curso : listaDeCursos) {
            if (curso.getCodigoDeCurso().equals(unCodigoDeCurso)) {
                cursoBuscado = curso;
            }
        }
        return cursoBuscado;
    }


    public void bajaCurso(Curso curso){
        listaDeCursos.remove(curso);
            System.out.println("Curso eliminado correctamente");
        }


    public void bajaCursoPorCodigo(Integer unCodigoDeCurso) {
        Curso cursoARemover = buscarCursoPorCodigo(unCodigoDeCurso);
        bajaCurso(cursoARemover);
    }

}
