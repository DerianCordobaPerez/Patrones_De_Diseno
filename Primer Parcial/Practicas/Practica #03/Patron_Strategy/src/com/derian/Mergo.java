package com.derian;

/**
 * @author derian-cordoba - 30/8/21
 * @project Patron_Strategy
 */
public class Mergo extends Pato {

    public Mergo() {
        super.vuelo = new VolarAlto();
        super.graznido = new GraznarAlto();
        super.flotar = new FlotarAlto();
    }

    @Override
    public String dibujar() {
        return "Soy un pato mergo";
    }
}
