package com.derian;

/**
 * @author derian-cordoba - 30/8/21
 * @project Patron_Strategy
 */
public class NoVolar implements IVuelo {
    @Override
    public String volar() {
        return "No vuelo";
    }
}
