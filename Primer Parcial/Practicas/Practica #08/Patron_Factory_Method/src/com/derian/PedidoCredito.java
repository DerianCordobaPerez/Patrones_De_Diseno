package com.derian;

/**
 * @author derian-cordoba - 27/9/21
 * @project Patron_Factory_Method
 */
public class PedidoCredito extends Pedido {

    public PedidoCredito(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return (this.importe >= 1000.0) && (this.importe <= 5000.0);
    }

    @Override
    public void paga() {
        System.out.println("El pago del pedido a credito de: " + importe + " se ha realizado.");
    }
}
