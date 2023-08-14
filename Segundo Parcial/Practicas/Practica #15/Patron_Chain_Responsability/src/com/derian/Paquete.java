package com.derian;

/**
 * @author derian-cordoba - 22/11/21
 * @project Patron_Chain_Responsibility
 */
public class Paquete {

    private String contenido, destino;
    private double peso;

    public Paquete(String contenido, String destino, double peso) {
        this.contenido = contenido;
        this.destino = destino;
        this.peso = peso;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String toString(){
        return "### Paquete # Contenido: " + this.contenido + "# Destino: " + this.destino + "# Peso: " + this.peso;
    }

}
