package com.derian;

/**
 * @author derian-cordoba - 30/8/21
 * @project Patron_Delegacion
 */
public class Proyecto implements Descripcion {

    private String nombre, categoria;

    public Proyecto(String nombre, String categoria) {
        this.setNombre(nombre);
        this.setCategoria(categoria);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String descripcion() {
        return String.format("%s-%s", this.getNombre(), this.getCategoria());
    }
}
