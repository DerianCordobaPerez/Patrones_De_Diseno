package com.derian;

/**
 * @author derian-cordoba - 27/9/21
 * @project Patron_Factory_Method
 */
public abstract class Pedido {

    protected double importe;

    public Pedido(double importe) {
        this.importe = importe;
    }

    public abstract boolean valida();

    public abstract void paga();
}
