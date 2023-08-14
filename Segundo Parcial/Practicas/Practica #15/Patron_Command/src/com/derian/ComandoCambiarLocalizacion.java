package com.derian;

/**
 * @author derian-cordoba - 22/11/21
 * @project Patron_Command
 */
public class ComandoCambiarLocalizacion implements ComandoDeshacer {

    private Reunion reunion;
    private String nuevalocalizacion;
    private String antigualocalizacion;

    public Reunion getReunion() {
        return reunion;
    }

    public void setReunion(Reunion reunion) {
        this.reunion = reunion;
    }

    public String getNuevalocalizacion() {
        return nuevalocalizacion;
    }

    public void setNuevalocalizacion(String nuevalocalizacion) {
        this.nuevalocalizacion = nuevalocalizacion;
    }

    public String getAntigualocalizacion() {
        return antigualocalizacion;
    }

    public void setAntigualocalizacion(String antigualocalizacion) {
        this.antigualocalizacion = antigualocalizacion;
    }

    public void ejecutar(String param) {
        //Completar XD
        antigualocalizacion = reunion.getLocalizacion();
        nuevalocalizacion = param;
        reunion.setLocalizacion(nuevalocalizacion);
    }

    public void deshacer() {
        reunion.setLocalizacion(antigualocalizacion);
    }

    public void rehacer() {
        reunion.setLocalizacion(nuevalocalizacion);
    }
}
