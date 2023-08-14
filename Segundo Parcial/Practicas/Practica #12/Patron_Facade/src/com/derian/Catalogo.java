package com.derian;

import java.util.List;

/**
 * @author derian-cordoba - 21/10/21
 * @project Patron_Facade
 */
public interface Catalogo {

    List<String> buscaVehiculos(int minimo, int maximo);

}
