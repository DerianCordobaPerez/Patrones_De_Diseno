package com.derian;

public class Main {

    public static void main(String[] args) {
        try {
            Manejador manejador1 = new ManejadorConcreto1();
            Manejador manejador2 = new ManejadorConcreto2();
            Manejador manejador3 = new ManejadorConcreto3();

            manejador1.setSucesor(manejador2);
            manejador2.setSucesor(manejador3);

            Paquete p1 = new Paquete("Bicicleta", "Madrid Capital", 300);
            Paquete p2 = new Paquete("Bicicleta", "Comunidad Madrid", 20);
            Paquete p3 = new Paquete("PDA", "Burgos", 1);

            System.out.println("Coste envio de paquete: \n" + p1.toString() + "\n" + manejador1.calculaCosteEnvio(p1));
            System.out.println("Coste envio de paquete: \n" + p2.toString() + "\n" + manejador1.calculaCosteEnvio(p2));
            System.out.println("Coste envio de paquete: \n" + p3.toString() + "\n" + manejador1.calculaCosteEnvio(p3));

        } catch (Exception e) {
            e.toString();
        }
    }
}
