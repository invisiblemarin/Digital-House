package com.company;

import com.company.vehiculos.Auto;
import com.company.vehiculos.Moto;

public class Main {

    public static void main(String[] args) {

        Auto unAuto = new Auto(140.0, 68.0, 90.0, "SAN16");
        Auto dosAuto = new Auto(290.0, 32.2, 90.0, "Pat345");
        Auto tresAuto = new Auto(230.0, 43.0, 90.0, "Lopi543");

        Moto unaMoto = new Moto(123.0, 23.0, 50.0, "Jose320");
        Moto dosMoto = new Moto(231.0, 31.0,50.0,"Edu450");
        Moto tresMoto = new Moto(231.0,34.0,12.0,"Hacker123");

        Carrera unaCarrera = new Carrera(3020.320, 540000.0, "El acantilado de la muerte", 5);

        unaCarrera.darDeAltaAuto(unAuto);
        unaCarrera.darDeAltaAuto(dosAuto);
        unaCarrera.darDeAltaAuto(tresAuto);

        unaCarrera.darDeAltaMoto(unaMoto);
        unaCarrera.darDeAltaMoto(dosMoto);
        unaCarrera.darDeAltaMoto(tresMoto);

        unaCarrera.eliminarVehiculo(dosAuto);
        unaCarrera.eliminarVehiculoConPatente("SAN16");

        unaCarrera.socorrerAuto("SAN16");
        unaCarrera.socorrerAuto("Lopi543");

        unaCarrera.darDeAltaAuto(dosAuto);
        unaCarrera.darDeAltaAuto(unAuto);

        unaCarrera.socorrerAuto("SAN16");

        unaCarrera.socorrerMoto("Edu450");
        unaCarrera.socorrerMoto("Hacker123");

        unaCarrera.definirElGanadorDeLaCarrera();
    }
}
