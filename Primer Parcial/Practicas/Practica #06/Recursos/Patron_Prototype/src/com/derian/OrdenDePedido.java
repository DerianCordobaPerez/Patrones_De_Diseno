package com.derian;

/**
 * @author derian-cordoba - 23/9/21
 * @project Patron_Prototype
 */
public class OrdenDePedido extends Documento {

    @Override
    public void imprime() { System.out.println("Imprime la orden de pedido: " + this.contenido); }

    @Override
    public void visualiza() {
        System.out.println("Muestra la orden de pedido: " + this.contenido);
    }
}
