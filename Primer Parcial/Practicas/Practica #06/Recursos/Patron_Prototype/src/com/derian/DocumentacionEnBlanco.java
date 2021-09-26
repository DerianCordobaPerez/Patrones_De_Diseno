package com.derian;

import java.util.ArrayList;

/**
 * @author derian-cordoba - 23/9/21
 * @project Patron_Prototype
 */
public class DocumentacionEnBlanco extends Documentacion {

    private static DocumentacionEnBlanco _instance = null;

    public DocumentacionEnBlanco() {
        this.documentos = new ArrayList<>();
    }

    public static DocumentacionEnBlanco getInstance() {
        if(_instance == null)
            _instance = new DocumentacionEnBlanco();
        return _instance;
    }

    public void incluye(Documento documento) {
        this.documentos.add(documento);
    }

    public void excluye(Documento documento) {
        this.documentos.remove(documento);
    }
}
