package com.derian;

public class Main {

    public static void main(String[] args) {
        Comercial elComercial = Comercial.Instance();
        elComercial.setNombre("Comercial Auto");
        elComercial.setDireccion("Madrid");
        elComercial.setEmail("comercial@comerciales.com");
        visualiza();
    }

    public static void visualiza() {
        Comercial elComercial = Comercial.Instance();
        elComercial.visualiza();
    }
}
