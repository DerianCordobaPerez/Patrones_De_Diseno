package com.derian;

/**
 * @author derian-cordoba - 6/9/21
 * @project PatronAbstractFactory
 */
public class ScooterElectrico extends Scooter {

    public ScooterElectrico(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Scooter electrica de modelo: " +
                modelo + " de color: " + color + " de potencia: " + potencia);
    }
}
