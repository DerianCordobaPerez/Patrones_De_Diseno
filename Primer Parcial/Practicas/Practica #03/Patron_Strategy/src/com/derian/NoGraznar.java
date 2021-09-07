package com.derian;

/**
 * @author derian-cordoba - 30/8/21
 * @project Patron_Strategy
 */
public class NoGraznar implements IGraznido {
    @Override
    public String graznar() {
        return "No Grazno";
    }
}
