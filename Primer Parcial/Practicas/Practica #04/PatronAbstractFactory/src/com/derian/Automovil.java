package com.derian;

/**
 * @author derian-cordoba - 6/9/21
 * @project PatronAbstractFactory
 */
public abstract class Automovil {
    protected String modelo, color;
    protected int potencia;
    protected double espacio;

    public Automovil(String modelo, String color, int potencia, double espacio) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
        this.espacio = espacio;
    }

    public abstract void mostrarCaracteristicas();
}
