package com.derian;

/**
 * @author derian-cordoba - 22/11/21
 * @project Patron_Interpreter
 */
public abstract class OperadorBinario extends Expresion
{
    protected Expresion operandoIzquierdo, operandoDerecho;
    public OperadorBinario(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        this.operandoIzquierdo = operandoIzquierdo;
        this.operandoDerecho = operandoDerecho;
    }
}
