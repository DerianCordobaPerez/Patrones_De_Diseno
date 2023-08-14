package com.derian;

/**
 * @author derian-cordoba - 22/11/21
 * @project Patron_Iterator
 */
public class Vehiculo extends Elemento {

    public Vehiculo(String descripcion) {
        super(descripcion);
    }

    public void visualiza()
    {
        System.out.print("Descripcion del vehículo: " + descripcion);
    }
}
