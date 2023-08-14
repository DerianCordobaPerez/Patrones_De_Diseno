package com.derian;

/**
 * @author derian-cordoba - 21/10/21
 * @project Patron_Adapter
 */
public class DocumentoPdf implements Documento {

    protected final ComponentePdf componentePdf = new ComponentePdf();

    @Override
    public void setContenido(String contenido) {
        this.componentePdf.pdfFijaContenido(contenido);
    }

    @Override
    public void dibuja() {
        this.componentePdf.pdfPreparaVisualizacion();
        this.componentePdf.pdfRefresca();
        this.componentePdf.pdfFinalizaVisualizacion();
    }

    @Override
    public void imprime() {
        this.componentePdf.pdfEnviaImpresora();
    }
}
