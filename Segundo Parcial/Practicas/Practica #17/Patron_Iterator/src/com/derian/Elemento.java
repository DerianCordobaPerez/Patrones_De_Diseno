package com.derian;

/**
 * @author derian-cordoba - 22/11/21
 * @project Patron_Iterator
 */
public abstract class Elemento {
    protected String descripcion;

    public Elemento(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean palabraClaveValida(String palabraClave)
    {
        return descripcion.contains(palabraClave);
    }
}
