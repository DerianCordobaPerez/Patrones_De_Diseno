package com.derian;

/**
 * @author derian-cordoba - 6/9/21
 * @project PatronBuilder
 */
public class ConstructorDocumentacionVehiculoHtml extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoHtml() {
        super.documentacion = new DocumentacionHtml();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        super.documentacion.agregarDocumento("<HTML>Solicitud de pedido Cliente: " + nombreCliente + "</HTML>");
    }

    @Override
    public void construyeSolicitudMatricula(String nombreSolicitante) {
        super.documentacion.agregarDocumento("<HTML>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</HTML>");
    }
}
