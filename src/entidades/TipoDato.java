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
public class TipoDato extends Entidad {
    int codigoTipoDato;
    String nombreTipoDato;
    EstadoTipoDato estado;
    
    public TipoDato() {
    }

    public int getCodigoTipoDato() {
        return codigoTipoDato;
    }

    public String getNombreTipoDato() {
        return nombreTipoDato;
    }

    public EstadoTipoDato getEstado() {
        return estado;
    }

    public void setCodigoTipoDato(int codigoTipoDato) {
        this.codigoTipoDato = codigoTipoDato;
    }

    public void setNombreTipoDato(String nombreTipoDato) {
        this.nombreTipoDato = nombreTipoDato;
    }

    public void setEstado(EstadoTipoDato estado) {
        this.estado = estado;
    }
    
}
