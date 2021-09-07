package com.derian;

/**
 * @author derian-cordoba - 30/8/21
 * @project Patron_Delegacion
 */
public class Profesor implements Descripcion {

    private String departamento;
    private double sueldo;

    public Profesor(String departamento, double sueldo) {
        this.setDepartamento(departamento);
        this.setSueldo(sueldo);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String descripcion() {
        return String.format("%s-%f", this.getDepartamento(), this.getSueldo());
    }
}
