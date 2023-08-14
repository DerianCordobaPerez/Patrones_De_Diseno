package com.derian;

/**
 * @author derian-cordoba - 21/10/21
 * @project Patron_Composite
 */
public abstract class Empresa {

    protected static double costeUniversitario = 5.0;
    protected int vehiculos;

    public void agregarVehiculo() {
        this.vehiculos++;
    }

    public abstract double calculaCosteMantenimiento();

    public abstract boolean agregarFilial(Empresa empresa);

}
