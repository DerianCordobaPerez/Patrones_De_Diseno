package com.derian;

/**
 * @author derian-cordoba - 21/10/21
 * @project Patron_Facade
 */
public class ComponenteGestionDocumento implements GestionDocumento {
    @Override
    public String documento(int indice) {
        return "Documento numero " + indice;
    }
}
