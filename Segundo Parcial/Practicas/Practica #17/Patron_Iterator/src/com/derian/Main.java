package com.derian;

public class Main {

    public static void main(String[] args) {
        CatalogoVehiculo catalogo = new CatalogoVehiculo();
        IteradorVehiculo iterador = catalogo.busqueda("economico");
        Vehiculo vehiculo;
        iterador.inicio();

        while ((vehiculo = iterador.item()) != null) {
            vehiculo.visualiza();
            iterador.siguiente();
            System.out.println("");
        }
    }
}
