package com.derian;

/**
 * @author derian-cordoba - 23/9/21
 * @project Patron_Prototype
 */
public class SolicitudDeMatriculacion extends Documento {

    @Override
    public void imprime() {
        System.out.println("Imprime la solicitud de matriculacion: " + this.contenido);
    }

    @Override
    public void visualiza() {
        System.out.println("Muestra la solicitud de matriculacion: " + this.contenido);
    }
}
