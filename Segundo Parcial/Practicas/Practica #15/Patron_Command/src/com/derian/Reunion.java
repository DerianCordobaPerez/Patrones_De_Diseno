package com.derian;

/**
 * @author derian-cordoba - 22/11/21
 * @project Patron_Command
 */
public class Reunion {
    private String motivo;
    private String participantes;
    private String localizacion;
    private FechaHora fecha;

    public Reunion(String motivo, String participantes, String localizacion, FechaHora fecha) {
        this.motivo = motivo;
        this.participantes = participantes;
        this.localizacion = localizacion;
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public FechaHora getFecha() {
        return fecha;
    }

    public void setFecha(FechaHora fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "\n#### Reunión #### \n# " + motivo + " \n# " + participantes
                + " \n# " + localizacion + " \n# " + fecha.toString();
    }
}
