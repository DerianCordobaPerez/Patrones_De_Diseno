package com.derian;

/**
 * @author derian-cordoba - 30/8/21
 * @project Patron_Strategy
 */
public class Madera extends Pato {

    public Madera() {
        super.vuelo = new NoVolar();
        super.graznido = new NoGraznar();
        super.flotar = new FlotarAlto();
    }

    @Override
    public String dibujar() {
        return "Soy un pato de madera";
    }
}
