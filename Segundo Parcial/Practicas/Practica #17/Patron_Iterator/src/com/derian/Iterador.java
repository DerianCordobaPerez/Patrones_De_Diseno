package com.derian;

import java.util.List;

/**
 * @author derian-cordoba - 22/11/21
 * @project Patron_Iterator
 */
public abstract class Iterador<TElemento extends Elemento> {

    protected String palabraClaveConsulta;
    protected int indice;
    protected List<TElemento> contenido;

    public void setPalabraClaveConsulta(String palabraClaveConsulta, List<TElemento> contenido) {
        this.palabraClaveConsulta = palabraClaveConsulta;
        this.contenido = contenido;
    }

    public void inicio() {
        indice = 0;
        int tamaño = contenido.size();
        while ((indice < tamaño) && (!contenido.get(indice).palabraClaveValida(palabraClaveConsulta)))
            indice++;
    }

    public void siguiente() {
        int tamaño = contenido.size();
        indice++;
        while ((indice < tamaño) && (!contenido.get(indice).palabraClaveValida(palabraClaveConsulta)))
            indice++;
    }

    public TElemento item() {
        if (indice < contenido.size())
            return contenido.get(indice);
        return null;
    }
}