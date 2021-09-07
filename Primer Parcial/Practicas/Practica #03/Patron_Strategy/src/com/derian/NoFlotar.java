package com.derian;

/**
 * @author derian-cordoba - 30/8/21
 * @project Patron_Strategy
 */
public class NoFlotar implements IFlotar {
    @Override
    public String flotar() {
        return "No floto";
    }
}
