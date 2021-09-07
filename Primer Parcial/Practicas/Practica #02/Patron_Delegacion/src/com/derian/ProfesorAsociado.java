package com.derian;

/**
 * @author derian-cordoba - 30/8/21
 * @project Patron_Delegacion
 */
public class ProfesorAsociado implements Descripcion {

    private String nombre, nacionalidad, profesion;

    public ProfesorAsociado(String nombre, String nacionalidad, String profesion) {
        this.setNombre(nombre);
        this.setNacionalidad(nacionalidad);
        this.setProfesion(profesion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String descripcion() {
        return String.format("%s-%s-%s", this.getNombre(), this.getNacionalidad(), this.getProfesion());
    }
}
