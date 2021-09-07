package com.derian;

/**
 * @author derian-cordoba - 30/8/21
 * @project Patron_Strategy
 */
public class VolarAlto implements IVuelo {
    @Override
    public String volar() {
        return "Vuelo alto";
    }
}
