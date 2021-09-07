package com.derian;

import java.util.Scanner;

public class Main {

    public static int nAutos = 3;
    public static int nScooters = 2;

    public static void main(String[] args) {
        IFabricaVehiculo fabrica;
        Automovil[] autos = new Automovil[nAutos];
        Scooter[] scooters = new Scooter[nScooters];

        System.out.print("Desea utilizar vehiculos electricos (1) o a gasolina (2):");
        fabrica = new Scanner(System.in).next().equalsIgnoreCase("1")
                ? new FabricaVehiculoElectrico() : new FabricaVehiculoGasolina();

        for (int index = 0; index < nAutos; index++)
            autos[index] = fabrica.crearAutomovil("estandar", "amarillo", 6 + index, 3.2);

        for (int index = 0; index < nScooters; index++)
            scooters[index] = fabrica.crearScooter("clasico", "rojo", 2 + index);

        for (Automovil auto: autos)
            auto.mostrarCaracteristicas();

        for (Scooter scooter: scooters)
            scooter.mostrarCaracteristicas();
    }
}
