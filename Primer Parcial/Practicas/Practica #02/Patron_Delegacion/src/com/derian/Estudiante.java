package com.derian;

/**
 * @author derian-cordoba - 30/8/21
 * @project Patron_Delegacion
 */
public class Estudiante implements Descripcion {
    private String universidad, titulacion;

    public Estudiante(String universidad, String titulacion) {
        this.setUniversidad(universidad);
        this.setTitulacion(titulacion);
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public String descripcion() {
        return String.format("%s-%s", this.getUniversidad(), this.getTitulacion());
    }
}
