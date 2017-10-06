/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Andres
 */
public class EstadoTipoDato extends Entidad {
    int codigoEstadoTipoDato;
    String nombreEstadoTipoDato;

    public EstadoTipoDato() {
    }

    public int getCodigoEstadoTipoDato() {
        return codigoEstadoTipoDato;
    }

    public String getNombreEstadoTipoDato() {
        return nombreEstadoTipoDato;
    }

    public void setCodigoEstadoTipoDato(int codigoEstadoTipoDato) {
        this.codigoEstadoTipoDato = codigoEstadoTipoDato;
    }

    public void setNombreEstadoTipoDato(String nombreEstadoTipoDato) {
        this.nombreEstadoTipoDato = nombreEstadoTipoDato;
    }
    
}
