package com.derian;

/**
 * @author derian-cordoba - 6/9/21
 * @project PatronAbstractFactory
 */
public class ScooterGasolina extends Scooter {

    public ScooterGasolina(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Scooter gasolina de modelo: " +
                modelo + " de color: " + color + " de potencia: " + potencia);
    }
}
