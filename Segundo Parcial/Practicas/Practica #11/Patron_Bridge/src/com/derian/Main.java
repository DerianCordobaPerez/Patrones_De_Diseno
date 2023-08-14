package com.derian;

public class Main {

    public static void main(String[] args) {

        FormularioMatriculacionPortugal formularioMatriculacionPortugal = new FormularioMatriculacionPortugal(new FormularioHtml());
        formularioMatriculacionPortugal.visualiza();

        if(formularioMatriculacionPortugal.administraZona())
            formularioMatriculacionPortugal.generaDocumento();

        System.out.println();

        FormularioMatriculacionEspaña formularioMatriculacionEspaña = new FormularioMatriculacionEspaña(new FormularioApplet());
        formularioMatriculacionEspaña.visualiza();

        if(formularioMatriculacionEspaña.administraZona())
            formularioMatriculacionEspaña.generaDocumento();

    }
}
