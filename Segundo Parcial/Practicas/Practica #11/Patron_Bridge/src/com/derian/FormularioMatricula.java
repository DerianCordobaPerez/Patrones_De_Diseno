package com.derian;

/**
 * @author derian-cordoba - 21/10/21
 * @project Patron_Bridge
 */
public abstract class FormularioMatricula {

    protected String contenido;
    protected IFormulario formulario;

    public FormularioMatricula(IFormulario formulario) {
        this.formulario = formulario;
    }

    public void visualiza() {
        this.formulario.dibujaTexto("Numero de matricula existente: ");
    }

    public void generaDocumento() {
        this.formulario.dibujaTexto("Solicitud de matriculacion: ");
        this.formulario.dibujaTexto("Numero de matricula: " + this.contenido);
    }

    public boolean administraZona() {
        this.contenido = formulario.administraZonaIndicada();
        return this.controlZona(this.contenido);
    }

    protected abstract boolean controlZona(String matricula);

}
