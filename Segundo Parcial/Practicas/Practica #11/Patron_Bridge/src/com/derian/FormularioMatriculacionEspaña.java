package com.derian;

/**
 * @author derian-cordoba - 21/10/21
 * @project Patron_Bridge
 */
public class FormularioMatriculacionEspaña extends FormularioMatricula {

    public FormularioMatriculacionEspaña(IFormulario formulario) {
        super(formulario);
    }

    @Override
    protected boolean controlZona(String matricula) {
        return matricula.length() == 7;
    }
}
