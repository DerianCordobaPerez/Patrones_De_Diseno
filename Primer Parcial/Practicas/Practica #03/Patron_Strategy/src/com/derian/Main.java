package com.derian;

public class Main {

    public static void main(String[] args) {
        Pato p1 = new Mergo();
        Pato p2 = new Goma();
        Pato p3 = new Buceador();
        Pato p4 = new Madera();

        System.out.println("Simulador de patos\nEl pato #01");
        System.out.println(p1.dibujar() + "\n");
        System.out.println(p1.realizarVuelo() + "\n");
        System.out.println(p1.realizarGraznido() + "\n");
        System.out.println(p1.realizarFlotar() + "\n");

        System.out.println("El pato #01 se estrella\n");
        p1.setVuelo(new NoVolar());
        System.out.println(p1.realizarVuelo() + "\n");

        System.out.println("El pato #02\n");
        System.out.println(p2.dibujar() + "\n");
        System.out.println(p2.realizarVuelo() + "\n");
        System.out.println(p2.realizarGraznido() + "\n");
        System.out.println(p2.realizarFlotar() + "\n");

        System.out.println("El pato #02 puede graznar y pero no podra flotar");
        p2.setGraznido(new GraznarAlto());
        p2.setFlotar(new NoFlotar());
        System.out.println(p2.realizarGraznido() + "\n");
        System.out.println(p2.realizarFlotar() + "\n");

        System.out.println("El pato #03\n");
        System.out.println(p3.dibujar() + "\n");
        System.out.println(p3.realizarVuelo() + "\n");
        System.out.println(p3.realizarGraznido() + "\n");
        System.out.println(p3.realizarFlotar() + "\n");
        System.out.println("El pato #03 puede graznar y volar");
        p3.setGraznido(new GraznarAlto());
        p3.setVuelo(new VolarAlto());
        System.out.println(p3.realizarVuelo() + "\n");
        System.out.println(p3.realizarGraznido() + "\n");

        System.out.println("El pato #04\n");
        System.out.println(p4.dibujar() + "\n");
        System.out.println(p4.realizarVuelo() + "\n");
        System.out.println(p4.realizarGraznido() + "\n");
        System.out.println(p4.realizarFlotar() + "\n");
        System.out.println("El pato #04 puede volar y pero no flotar");
        p4.setVuelo(new VolarAlto());
        p4.setFlotar(new NoFlotar());
        System.out.println(p4.realizarVuelo() + "\n");
        System.out.println(p4.realizarFlotar() + "\n");
    }
}
