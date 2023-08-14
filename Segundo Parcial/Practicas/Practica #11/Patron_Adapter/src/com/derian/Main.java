package com.derian;

public class Main {

    public static void main(String[] args) {
	    Documento   documento_uno = new DocumentoHtml(),
                    documento_dos = new DocumentoPdf();

        documento_uno.setContenido("Hola HTML");
        documento_uno.dibuja();

        System.out.println();

        documento_dos.setContenido("Hola PDF");
        documento_dos.dibuja();
    }
}
