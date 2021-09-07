package com.derian;

import java.util.ArrayList;

/**
 * @author derian-cordoba - 30/8/21
 * @project Patron_Delegacion
 */

public class PersonalUniversitario {

    private String dni, nombre, direccion;
    private ArrayList<Descripcion> roles;

    public PersonalUniversitario(String dni, String nombre, String direccion) {
        this.setDni(dni);
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.roles = new ArrayList<Descripcion>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Descripcion> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Descripcion> roles) {
        this.roles = roles;
    }

    public void setRol(Descripcion rol) {
        this.roles.add(rol);
    }

    public void borrarRol(Descripcion rol) {
        this.roles.remove(rol);
    }

    public String descripcion() {
        StringBuilder descripcion = new StringBuilder(this.dni + " - " + this.nombre + " - " + this.direccion + "\n");
        for (Descripcion role : roles)
            descripcion.append(role.descripcion()).append("\n");
        return descripcion.toString();
    }

}
