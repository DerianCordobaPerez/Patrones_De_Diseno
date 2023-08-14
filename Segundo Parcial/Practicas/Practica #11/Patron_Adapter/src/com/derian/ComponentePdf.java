package com.derian;

/**
 * @author derian-cordoba - 21/10/21
 * @project Patron_Adapter
 */
public class ComponentePdf {

    protected String contenido;

    public void pdfFijaContenido(String contenido) {
        this.contenido = contenido;
    }

    public void pdfPreparaVisualizacion() {
        System.out.println("Visualiza PDF: Comienzo");
    }

    public void pdfRefresca() {
        System.out.println("Visualiza contenido PDF: " + this.contenido);
    }

    public void pdfFinalizaVisualizacion() {
        System.out.println("Visualiza PDF: Fin");
    }
    public void pdfEnviaImpresora() {
        System.out.println("Impresión PDF: " + this.contenido);
    }

}
