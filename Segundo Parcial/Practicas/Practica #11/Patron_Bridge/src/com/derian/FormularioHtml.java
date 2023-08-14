package com.derian;

import java.util.Scanner;

/**
 * @author derian-cordoba - 21/10/21
 * @project Patron_Bridge
 */
public class FormularioHtml implements IFormulario {

    protected Scanner scanner = new Scanner(System.in);

    @Override
    public void dibujaTexto(String texto) {
        System.out.println("HTML: " + texto);
    }

    @Override
    public String administraZonaIndicada() {
        return this.scanner.next();
    }
}
