package com.derian;

/**
 * @author derian-cordoba - 6/9/21
 * @project PatronBuilder
 */
public abstract class ConstructorDocumentacionVehiculo {

    protected Documentacion documentacion;

    public abstract void construyeSolicitudPedido(String nombreCliente);

    public abstract void construyeSolicitudMatricula(String nombreSolicitante);

    public Documentacion resultado() {
        return this.documentacion;
    }
}
