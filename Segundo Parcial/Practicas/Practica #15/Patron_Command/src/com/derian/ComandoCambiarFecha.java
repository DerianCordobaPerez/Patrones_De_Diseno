package com.derian;

/**
 * @author derian-cordoba - 22/11/21
 * @project Patron_Command
 */
public class ComandoCambiarFecha implements ComandoDeshacer{

    private Reunion reunion;
    private FechaHora nuevaFecha;
    private FechaHora antiguaFecha;

    public Reunion getReunion(){
        return this.reunion;
    }

    public void setReunion(Reunion reunion){
        this.reunion = reunion;
    }

    public FechaHora getNuevaFecha() {
        return nuevaFecha;
    }

    public void setNuevaFecha(FechaHora nuevaFecha) {
        this.nuevaFecha = nuevaFecha;
    }

    public FechaHora getAntiguaFecha() {
        return antiguaFecha;
    }

    public void setAntiguaFecha(FechaHora antiguaFecha) {
        this.antiguaFecha = antiguaFecha;
    }

    public void ejecutar(String param){
        antiguaFecha = reunion.getFecha();
        nuevaFecha = new FechaHora(param);
        reunion.setFecha(nuevaFecha);
    }

    public void deshacer(){
        reunion.setFecha(antiguaFecha);
    }

    public void rehacer(){
        reunion.setFecha(nuevaFecha);
    }
}