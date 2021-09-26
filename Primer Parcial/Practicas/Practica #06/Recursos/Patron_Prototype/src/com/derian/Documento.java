package com.derian;

/**
 * @author derian-cordoba - 23/9/21
 * @project Patron_Prototype
 */
public abstract class Documento implements Cloneable {

    protected String contenido = "";

    public Documento duplica() {
        Documento resultado;

        try {
            resultado = (Documento) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }

        return resultado;
    }

    public void rellena(String contenido) {
        this.contenido = contenido;
    }

    public abstract void imprime();
    public abstract void visualiza();
}
