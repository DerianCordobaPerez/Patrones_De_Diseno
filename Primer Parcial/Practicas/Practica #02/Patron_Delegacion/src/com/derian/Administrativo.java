package com.derian;

/**
 * @author derian-cordoba - 30/8/21
 * @project Patron_Delegacion
 */
public class Administrativo implements Descripcion {

    private String funcion, cargo;

    public Administrativo(String funcion, String cargo) {
        this.setFuncion(funcion);
        this.setCargo(cargo);
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String descripcion() {
        return String.format("%s-%s", this.getFuncion(), this.getCargo());
    }
}
