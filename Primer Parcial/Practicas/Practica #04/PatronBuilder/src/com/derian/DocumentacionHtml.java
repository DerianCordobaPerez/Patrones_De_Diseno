package com.derian;

/**
 * @author derian-cordoba - 6/9/21
 * @project PatronBuilder
 */
public class DocumentacionHtml extends Documentacion {
    @Override
    public void agregarDocumento(String documento) {
        if(documento.startsWith("<HTML>"))
            super.contenido.add(documento);
    }

    @Override
    public void imprime() {
        System.out.println("Documentacion HTML");
        for(var documento : super.contenido)
            System.out.println(documento);
    }
}
