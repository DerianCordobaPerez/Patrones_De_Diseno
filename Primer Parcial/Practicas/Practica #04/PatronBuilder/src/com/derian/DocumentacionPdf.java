package com.derian;

/**
 * @author derian-cordoba - 6/9/21
 * @project PatronBuilder
 */
public class DocumentacionPdf extends Documentacion {
    @Override
    public void agregarDocumento(String documento) {
        if(documento.startsWith("<PDF>"))
            super.contenido.add(documento);
    }

    @Override
    public void imprime() {
        System.out.println("Documentacion PDF");
        for(var documento : super.contenido)
            System.out.println(documento);
    }
}
