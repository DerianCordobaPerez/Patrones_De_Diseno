package com.derian;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Empresa empresa_uno = new EmpresaSinFilial();
        empresa_uno.agregarVehiculo();

        Empresa empresa_dos = new EmpresaSinFilial();
        empresa_dos.agregarVehiculo();
        empresa_dos.agregarVehiculo();

        Empresa empresa_madre = new EmpresaMadre();
        empresa_madre.agregarFilial(empresa_uno);
        empresa_madre.agregarFilial(empresa_dos);
        empresa_madre.agregarVehiculo();

        System.out.println("Coste de mantenimiento total del grupo: " + empresa_madre.calculaCosteMantenimiento());
    }
}
