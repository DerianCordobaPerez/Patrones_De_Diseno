package com.derian;

/**
 * @author derian-cordoba - 22/11/21
 * @project Patron_Command
 */
public class Invocador {
    private ComandoDeshacer comando;

    public ComandoDeshacer getComando() {
        return comando;
    }

    public void setComando(ComandoDeshacer comando) {
        this.comando = comando;
    }

    public void ejecutaComando(String param){
        comando.ejecutar(param);
    }

    public void deshacerComando(){
        comando.deshacer();
    }

    public void rehacerComando(){
        comando.rehacer();
    }
}
