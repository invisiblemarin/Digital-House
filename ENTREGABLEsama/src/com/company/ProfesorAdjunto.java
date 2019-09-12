package com.company;

public class ProfesorAdjunto extends Profesor {


    //atributos

    private Integer cantidadDeHoras;

    //constructor

    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codigoProfesor, Integer cantidadDeHoras) {
        super(nombre, apellido, antiguedad, codigoProfesor);

        this.cantidadDeHoras = cantidadDeHoras;
    }

    //getters

    public Integer getCantidadDeHoras(){
        return cantidadDeHoras;
    }
}
