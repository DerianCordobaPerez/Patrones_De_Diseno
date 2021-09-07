package com.derian;

public class Main {

    public static void main(String[] args) {
        Descripcion d1 = new Profesor("CC", 1600);
        Descripcion d2 = new Estudiante("Alcala", "Informática");
        Descripcion d3 = new Estudiante("Alcala", "Doctorado en Informática");
        Descripcion d4 = new Proyecto("Proyecto 01", "Avanzado");
        Descripcion d5 = new ProfesorAsociado("Brandon", "Nicaraguense", "Vago");
        Descripcion d6 = new Administrativo("Director", "Director General");

        PersonalUniversitario pu1 = new PersonalUniversitario("1", "Pepe", "d1");
        PersonalUniversitario pu2 = new PersonalUniversitario("2", "Sonia", "d2");

        pu1.setRol(d1);
        pu1.setRol(d3);
        pu1.setRol(d4);
        pu2.setRol(d2);
        pu2.setRol(d5);
        pu2.setRol(d6);

        System.out.println(pu1.descripcion());
        System.out.println(pu2.descripcion());
    }
}
