package com.derian;

/**
 * @author derian-cordoba - 6/9/21
 * @project PatronAbstractFactory
 */
public abstract class Scooter {

    protected String modelo, color;
    protected int potencia;

    public Scooter(String modelo, String color, int potencia) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
    }

    public abstract void mostrarCaracteristicas();
}
