package com.derian;

public class Main {

    public static void main(String[] args) {
        DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.getInstance();

        documentacionEnBlanco.incluye(new OrdenDePedido());
        documentacionEnBlanco.incluye(new CertificadoDeCesion());
        documentacionEnBlanco.incluye(new SolicitudDeMatriculacion());

        DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Derian");
        DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Amanda");
        documentacionCliente1.visualiza();
        documentacionCliente2.visualiza();
    }
}
