package com.derian;

/**
 * @author derian-cordoba - 6/9/21
 * @project PatronBuilder
 */
public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoPdf() {
        super.documentacion = new DocumentacionPdf();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        super.documentacion.agregarDocumento("<PDF>Solicitud de pedido Cliente: " + nombreCliente + "</PDF>");
    }

    @Override
    public void construyeSolicitudMatricula(String nombreSolicitante) {
        super.documentacion.agregarDocumento("<PDF>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</PDF>");
    }
}
