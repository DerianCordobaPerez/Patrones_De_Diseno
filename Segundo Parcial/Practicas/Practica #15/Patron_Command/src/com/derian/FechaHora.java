package com.derian;

/**
 * @author derian-cordoba - 22/11/21
 * @project Patron_Command
 */
public class FechaHora {
    private int anio, mes, dia, hora, min;

    public FechaHora(int anio, int mes, int dia, int hora, int min) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.min = min;
    }

    public FechaHora(String cadenaFecha){
        //Completar

    }

    public FechaHora(){
        //Completar

    }

    @Override
    public String toString() {
        if (min < 10) {
            return dia + "/" + mes + "/" + anio + "/" + hora + ":0" + min;
        } else {
            return dia + "/" + mes + "/" + anio + "/" + hora + ":" + min;
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
