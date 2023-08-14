package com.derian;

/**
 * @author derian-cordoba - 27/9/21
 * @project Patron_Factory_Method
 */
public class ClienteCredito extends Cliente {
    @Override
    protected Pedido creaPedido(double importe) {
        return new PedidoCredito(importe);
    }
}