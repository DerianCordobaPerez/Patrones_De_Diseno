package com.derian;

/**
 * @author derian-cordoba - 6/9/21
 * @project PatronAbstractFactory
 */
public class FabricaVehiculoElectrico implements IFabricaVehiculo {

    /**
     * @param modelo   modelo del vehiculo
     * @param color    color del vehiculo
     * @param potencia potencia del vehiculo
     * @param espacio  espacio del vehiculo
     * @return Automovil
     */
    @Override
    public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilElectricidad(modelo, color, potencia, espacio);
    }

    /**
     * @param modelo   modelo del vehiculo
     * @param color    color del vehiculo
     * @param potencia potencia del vehiculo
     * @return Scooter
     */
    @Override
    public Scooter crearScooter(String modelo, String color, int potencia) {
        return new ScooterElectrico(modelo, color, potencia);
    }
}
