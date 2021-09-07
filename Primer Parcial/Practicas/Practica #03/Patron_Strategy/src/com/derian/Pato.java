package com.derian;

/**
 * @author derian-cordoba - 30/8/21
 * @project Patron_Strategy
 */
public abstract class Pato {

    protected IVuelo vuelo;
    protected IGraznido graznido;
    protected IFlotar flotar;

    public String realizarVuelo() {
        return this.vuelo.volar();
    }

    public String realizarGraznido() {
        return this.graznido.graznar();
    }

    public String realizarFlotar() { return this.flotar.flotar(); }

    public IVuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(IVuelo vuelo) {
        this.vuelo = vuelo;
    }

    public IGraznido getGraznido() {
        return graznido;
    }

    public void setGraznido(IGraznido graznido) {
        this.graznido = graznido;
    }

    public String nadar() {
        return "Nado";
    }

    public IFlotar getFlotar() {
        return flotar;
    }

    public void setFlotar(IFlotar flotar) {
        this.flotar = flotar;
    }

    public abstract String dibujar();
}
