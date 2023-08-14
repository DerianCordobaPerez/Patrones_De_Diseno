package com.derian;

/**
 * @author derian-cordoba - 22/11/21
 * @project Patron_Interpreter
 */
public class PalabraClave extends Expresion {
    protected String palabraClave;

    public PalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public boolean evalua(String descripcion) {
        return descripcion.contains(palabraClave);
    }

    public static Expresion parsea() throws Exception {
        Expresion resultado;
        resultado = new PalabraClave(pieza);
        siguientePieza();
        return resultado;
    }
}
