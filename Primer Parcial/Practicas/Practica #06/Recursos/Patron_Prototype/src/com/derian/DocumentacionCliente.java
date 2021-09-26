package com.derian;

import java.util.ArrayList;

/**
 * @author derian-cordoba - 23/9/21
 * @project Patron_Prototype
 */
public class DocumentacionCliente extends Documentacion {

    public DocumentacionCliente(String informacion) {
        this.documentos = new ArrayList<>();

        DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.getInstance();
        for(Documento documento : documentacionEnBlanco.getDocumentos()) {
            Documento copiaDocumento = documento.duplica();
            copiaDocumento.rellena(informacion);
            this.documentos.add(copiaDocumento);
        }
    }

    public void visualiza() {
        for (Documento documento: documentos)
            documento.visualiza();
    }
    public void imprime() {
        for (Documento documento: documentos)
            documento.imprime();
    }
}
