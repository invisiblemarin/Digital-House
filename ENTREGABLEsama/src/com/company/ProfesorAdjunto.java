package com.company;

public class ProfesorAdjunto extends Profesor {


    //atributos

    private Integer cantidadDeHorasDeConsulta;

    //constructor

    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoDeProfesor, Integer cantidadDeHorasDeConsulta) {
        super(nombre, apellido, antiguedad, codigoDeProfesor);

        this.cantidadDeHorasDeConsulta = cantidadDeHorasDeConsulta;
    }

    //getters

    public Integer getCantidadDeHorasDeConsulta(){
        return cantidadDeHorasDeConsulta;
    }
}
