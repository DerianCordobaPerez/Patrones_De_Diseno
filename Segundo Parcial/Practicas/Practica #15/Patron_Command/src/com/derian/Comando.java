package com.derian;

/**
 * @author derian-cordoba - 22/11/21
 * @project Patron_Command
 */
public interface Comando {
    void setReunion(Reunion reunion);
    Reunion getReunion();
    void ejecutar(String param);
}
