package com.derian;

/**
 * @author derian-cordoba - 6/9/21
 * @project PatronAbstractFactory
 */
public interface IFabricaVehiculo {

    /**
     * @param modelo modelo del vehiculo
     * @param color color del vehiculo
     * @param potencia potencia del vehiculo
     * @param espacio espacio del vehiculo
     * @return Automovil
     */
    Automovil crearAutomovil(String modelo, String color, int potencia, double espacio);

    /**
     * @param modelo modelo del vehiculo
     * @param color color del vehiculo
     * @param potencia potencia del vehiculo
     * @return Scooter
     */
    Scooter crearScooter(String modelo, String color, int potencia);
}
