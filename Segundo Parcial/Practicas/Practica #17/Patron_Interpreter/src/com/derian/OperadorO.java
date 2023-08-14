package com.derian;

/**
 * @author derian-cordoba - 22/11/21
 * @project Patron_Interpreter
 */
public class OperadorO extends OperadorBinario {

    public OperadorO(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    @Override
    public boolean evalua(String descripcion) {
        return operandoIzquierdo.evalua(descripcion) || operandoDerecho.evalua(descripcion);
    }

    public static Expresion parsea() throws Exception {
        Expresion resultadoIzquierdo, resultadoDerecho;
        resultadoIzquierdo = OperadorY.parsea();
        while ((pieza != null) && (pieza.equals("o")))
        {
            siguientePieza();
            resultadoDerecho = OperadorY.parsea();
            resultadoIzquierdo = new OperadorO(resultadoIzquierdo,
                    resultadoDerecho);
        }
        return resultadoIzquierdo;
    }
}
