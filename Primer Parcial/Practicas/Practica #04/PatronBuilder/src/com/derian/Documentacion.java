package com.derian;

import java.util.ArrayList;
import java.util.List;

/**
 * @author derian-cordoba - 6/9/21
 * @project PatronBuilder
 */
public abstract class Documentacion {

    protected List<String> contenido = new ArrayList<>();

    public abstract void agregarDocumento(String documento);
    public abstract void imprime();
}
