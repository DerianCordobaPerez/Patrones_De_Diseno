package com.derian;

import java.util.ArrayList;
import java.util.List;

/**
 * @author derian-cordoba - 21/10/21
 * @project Patron_Composite
 */
public class EmpresaMadre extends Empresa {

    protected List<Empresa> filiales = new ArrayList<>();

    @Override
    public double calculaCosteMantenimiento() {
        double coste = 0.0;

        for(var filial : this.filiales)
            coste += filial.calculaCosteMantenimiento();

        return coste + super.vehiculos * costeUniversitario;
    }

    @Override
    public boolean agregarFilial(Empresa empresa) {
        return this.filiales.add(empresa);
    }
}
