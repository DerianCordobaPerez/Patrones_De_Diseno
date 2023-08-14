package com.derian;

/**
 * @author derian-cordoba - 21/10/21
 * @project Patron_Composite
 */
public class EmpresaSinFilial extends Empresa {
    @Override
    public double calculaCosteMantenimiento() {
        return super.vehiculos * costeUniversitario;
    }

    @Override
    public boolean agregarFilial(Empresa empresa) {
        return false;
    }
}
