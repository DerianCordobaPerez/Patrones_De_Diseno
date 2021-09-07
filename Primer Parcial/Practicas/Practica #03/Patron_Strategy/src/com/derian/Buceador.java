package com.derian;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author derian-cordoba - 30/8/21
 * @project Patron_Strategy
 */
public class Buceador extends Pato {

    public Buceador() {
        super.vuelo = new NoVolar();
        super.graznido = new NoGraznar();
        super.flotar = new FlotarAlto();
    }

    @Override
    public String dibujar() {
        return "Soy un pato buceador";
    }
}
