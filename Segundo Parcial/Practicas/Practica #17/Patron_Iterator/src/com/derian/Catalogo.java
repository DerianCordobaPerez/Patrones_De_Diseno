package com.derian;

import java.util.ArrayList;
import java.util.List;

/**
 * @author derian-cordoba - 22/11/21
 * @project Patron_Iterator
 */
public abstract class Catalogo<TElemento extends Elemento, TIterador extends Iterador<TElemento>> {
    protected List<TElemento> contenido = new ArrayList<TElemento>();

    protected abstract TIterador creaIterador();
    public TIterador busqueda(String palabraClaveConsulta) {
        TIterador resultado = creaIterador();
        resultado.setPalabraClaveConsulta(palabraClaveConsulta, contenido);
        return resultado;
    }
}