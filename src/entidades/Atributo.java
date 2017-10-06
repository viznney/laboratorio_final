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
public class Atributo extends Entidad {
    int codigoAtributo;
    short longitudAtributo;
    String nombreAtributo;
    EstadoAtributo estado;
    TipoDato tipoDato;
    
    public Atributo() {
    }

    public int getCodigoAtributo() {
        return codigoAtributo;
    }

    public short getLongitudAtributo() {
        return longitudAtributo;
    }

    public String getNombreAtributo() {
        return nombreAtributo;
    }

    public EstadoAtributo getEstado() {
        return estado;
    }

    public TipoDato getTipoDato() {
        return tipoDato;
    }

    public void setCodigoAtributo(int codigoAtributo) {
        this.codigoAtributo = codigoAtributo;
    }

    public void setLongitudAtributo(short longitudAtributo) {
        this.longitudAtributo = longitudAtributo;
    }

    public void setNombreAtributo(String nombreAtributo) {
        this.nombreAtributo = nombreAtributo;
    }

    public void setEstado(EstadoAtributo estado) {
        this.estado = estado;
    }

    public void setTipoDato(TipoDato tipoDato) {
        this.tipoDato = tipoDato;
    }
    
}
