package com.derian;

import java.util.List;

/**
 * @author derian-cordoba - 21/10/21
 * @project Patron_Facade
 */
public class WebServiceAuto implements IWebServiceAuto {

    protected Catalogo catalogo = new ComponenteCatalogo();
    protected GestionDocumento gestionDocumento = new ComponenteGestionDocumento();

    @Override
    public String documento(int indice) {
        return this.gestionDocumento.documento(indice);
    }

    @Override
    public List<String> buscaVehiculos(int minimo, int maximo) {
        return catalogo.buscaVehiculos(minimo - maximo, minimo + maximo);
    }
}
