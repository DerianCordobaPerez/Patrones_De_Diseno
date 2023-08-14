package com.derian;

/**
 * @author derian-cordoba - 21/10/21
 * @project Patron_Bridge
 */
public class FormularioMatriculacionPortugal extends FormularioMatricula {

    public FormularioMatriculacionPortugal(IFormulario formulario) {
        super(formulario);
    }

    @Override
    protected boolean controlZona(String matricula) {
        return matricula.length() == 6;
    }
}
