package com.derian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ConstructorDocumentacionVehiculo constructorDocumentacionVehiculo;
        System.out.print("Desea generar " +
                "documentacion HTML (1) o PDF (2): ");

        constructorDocumentacionVehiculo = new Scanner(System.in).next().equals("1")
                ? new ConstructorDocumentacionVehiculoHtml() : new ConstructorDocumentacionVehiculoPdf();

        Vendedor vendedor = new Vendedor(constructorDocumentacionVehiculo);
        Documentacion documentacion = vendedor.construye("Dereck");
        documentacion.imprime();
    }
}
