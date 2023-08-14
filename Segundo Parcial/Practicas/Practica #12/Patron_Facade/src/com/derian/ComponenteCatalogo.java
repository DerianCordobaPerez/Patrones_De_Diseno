package com.derian;

import java.util.ArrayList;
import java.util.List;

/**
 * @author derian-cordoba - 21/10/21
 * @project Patron_Facade
 */
public class ComponenteCatalogo implements Catalogo {

    protected Object[] descripcionVehiculo = {
            "Berlina 5 puertas", 6000, "Compacto 3 puertas", 4000,
            "Espace 5 puertas", 8000, "Break 5 puertas", 7000,
            "Coupé 2 puertas", 9000, "Utilitario 3 puertas", 5000
    };

    @Override
    public List<String> buscaVehiculos(int minimo, int maximo) {
        List<String> resultado = new ArrayList<>();

        for(int i = 0; i < descripcionVehiculo.length / 2; ++i) {
            int precio = (Integer)descripcionVehiculo[2 * i + 1];
            if(precio >= minimo && precio <= maximo)
                resultado.add((String) descripcionVehiculo[2 * i]);
        }

        return resultado;
    }
}
