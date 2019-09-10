package com.company;

import com.company.vehiculos.Auto;
import com.company.vehiculos.Moto;
import com.company.vehiculos.Vehiculo;

import java.util.HashSet;
import java.util.Set;

public class Carrera {
    private Double distancia;
    private Double premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private Set<Vehiculo> listaDeVehiculos;
    private String ganador;
    private SocorristaAuto unSocorristaAuto = new SocorristaAuto();
    private SocorristaMoto unSocorristaMoto = new SocorristaMoto();

    public Carrera(Double distancia, Double premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        listaDeVehiculos = new HashSet<>();
        ganador = "";
    }

    public void darDeAltaAuto(Auto unAuto){
        if(listaDeVehiculos.size() < cantidadDeVehiculosPermitidos){
            listaDeVehiculos.add(unAuto);
            System.out.println("El auto se pudo agregar correctamente");
        }else{
            System.out.println("El auto no se puedo agregar porque la cantidad de vehiculos esta llena");
        }
    }

    public void darDeAltaMoto(Moto unaMoto){
        if(listaDeVehiculos.size() < cantidadDeVehiculosPermitidos){
            listaDeVehiculos.add(unaMoto);
            System.out.println("La moto se pudo agregar correctamente");
        }else{
            System.out.println("La moto no se puedo agregar porque la cantidad de vehiculos esta llena");
        }
    }

    public void eliminarVehiculo(Vehiculo unVehiculo){
        listaDeVehiculos.remove(unVehiculo);
        System.out.println("El vehiculo se pudo eliminar correctamente");
    }

    public void eliminarVehiculoConPatente(String unaPatente){
        for (Vehiculo e:listaDeVehiculos) {
            if(e.getPatente().equals(unaPatente)){
                eliminarVehiculo(e);
                break;
            }
        }
    }

    public void definirElGanadorDeLaCarrera(){
        Double cuentaDeLaFormula;
        Double cuentaDeLaFormulaGanadora = 0.0;
        for (Vehiculo e:listaDeVehiculos) {
            cuentaDeLaFormula = e.getVelocidad() * 1/2 * e.getAceleracion() / (e.getAnguloDeGiro() *(e.getPeso() - e.getRuedas() * 100));
            if(cuentaDeLaFormula > cuentaDeLaFormulaGanadora){
                cuentaDeLaFormulaGanadora = cuentaDeLaFormula;
                ganador = e.getPatente();
            }
        }
        System.out.println("El ganador es el vehiculo con la patente: " + ganador);
    }

    public void socorrerAuto(String patente){
        for (Vehiculo e:listaDeVehiculos) {
            if(e.getPatente().equals(patente) && e.getRuedas() == 4){
                unSocorristaAuto.socorrer((Auto) e);
            }
        }
    }
    public void socorrerMoto(String patente){
        for (Vehiculo e:listaDeVehiculos) {
            if(e.getPatente().equals(patente) && e.getRuedas() == 2){
                unSocorristaMoto.socorrer((Moto) e);
            }
        }
    }
}
