package com.derian;

/**
 * @author derian-cordoba - 21/10/21
 * @project Patron_Adapter
 */
public class DocumentoHtml implements Documento {

    protected String contenido;

    @Override
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void dibuja() {
        System.out.println("Dibuja el documento HTML: " + this.contenido);
    }

    @Override
    public void imprime() {
        System.out.println("Imprime el documento HTML: " + this.contenido);
    }
}
