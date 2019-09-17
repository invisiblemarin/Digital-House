package com.company;

public class Main {

    public static void main(String[] args) {

        DigitalHouseManager dhm = new DigitalHouseManager();

        dhm.altaProfesorTitular("Pat","Lopez", 123456, "Boludeo");
        dhm.altaProfesorTitular("Lopi", "Jimenez", 234567, "Gamer");
        dhm.altaProfesorAdjunto("Jose", "Fermoso", 345678, 4);
        dhm.altaProfesorAdjunto("Edu", "Blergh", 456789, 2);


        dhm.altaCurso("Full Stack", 20001, 3);
        dhm.altaCurso("Android", 20002, 2);

        dhm.asignarProfesores(20001, 123456, 345678);
        dhm.asignarProfesores(20002, 234567, 456789);

        dhm.altaAlumno("santiago","marin", 666);
        dhm.altaAlumno("manuel","marin", 777);
        dhm.altaAlumno("juan","marin", 888);

        dhm.inscribirAlumno(666, 20001);
        dhm.inscribirAlumno(777,20001);
        dhm.inscribirAlumno(666,20002);
        dhm.inscribirAlumno(777,20002);
        dhm.inscribirAlumno(888, 20002);

        dhm.bajaProfesor(456789);

        dhm.bajaCurso(20001);


        }



    }
