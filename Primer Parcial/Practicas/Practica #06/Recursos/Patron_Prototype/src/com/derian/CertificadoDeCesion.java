package com.derian;

/**
 * @author derian-cordoba - 23/9/21
 * @project Patron_Prototype
 */
public class CertificadoDeCesion extends Documento {

    @Override
    public void imprime() {
        System.out.println("Imprime el certificado de cesion: " + this.contenido);
    }

    @Override
    public void visualiza() {
        System.out.println("Muestra el certificado de cesion: " + this.contenido);
    }
}
