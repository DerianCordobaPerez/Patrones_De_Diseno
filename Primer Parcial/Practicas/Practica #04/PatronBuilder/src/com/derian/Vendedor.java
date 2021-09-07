package com.derian;

/**
 * @author derian-cordoba - 6/9/21
 * @project PatronBuilder
 */
public class Vendedor {

    protected ConstructorDocumentacionVehiculo constructorDocumentacionVehiculo;

    public Vendedor(ConstructorDocumentacionVehiculo constructorDocumentacionVehiculo) {
        this.constructorDocumentacionVehiculo = constructorDocumentacionVehiculo;
    }

    public Documentacion construye(String nombreCliente) {
        this.constructorDocumentacionVehiculo.construyeSolicitudPedido(nombreCliente);
        this.constructorDocumentacionVehiculo.construyeSolicitudMatricula(nombreCliente);

        return this.constructorDocumentacionVehiculo.resultado();
    }
}
