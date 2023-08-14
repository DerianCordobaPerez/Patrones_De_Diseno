package com.derian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Expresion expresionConsulta;
        Scanner reader = new Scanner(System.in);

        System.out.print("Introduzca su consulta: ");
        String consulta = reader.nextLine();

        try {
            expresionConsulta = Expresion.analiza(consulta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            expresionConsulta = null;
        }

        if (expresionConsulta != null) {
            System.out.print("Introduzca la descripción de un vehículo: ");
            String descripcion = reader.nextLine();

            if (expresionConsulta.evalua(descripcion))
                System.out.print("La descripción responde a la consulta");
            else
                System.out.print("La descripción no responde a la consulta");
        }
    }
}
