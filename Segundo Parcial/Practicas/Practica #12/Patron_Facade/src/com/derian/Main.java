package com.derian;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IWebServiceAuto webServiceAuto = new WebServiceAuto();

        System.out.println(webServiceAuto.documento(0));
        System.out.println(webServiceAuto.documento(1));

        var resultado = webServiceAuto.buscaVehiculos(6000, 10000);

        if(resultado.size() > 0) {
            System.out.println("Vehículo(s) cuyo precio está comprendido entre 5000 y 7000");
            resultado.forEach(System.out::println);
        }
    }
}
