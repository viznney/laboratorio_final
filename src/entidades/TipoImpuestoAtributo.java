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
public class TipoImpuestoAtributo extends Entidad {
    int orden;
    Atributo atributo;
    boolean descartado;
    TipoImpuesto tipoImpuesto;
    
    public TipoImpuestoAtributo() {
    }

    public int getOrden() {
        return orden;
    }

    public Atributo getAtributo() {
        return atributo;
    }

    public boolean isDescartado() {
        return descartado;
    }

    public TipoImpuesto getTipoImpuesto() {
        return tipoImpuesto;
    }
    
    public void setOrden(int orden) {
        this.orden = orden;
    }

    public void setAtributo(Atributo atributo) {
        this.atributo = atributo;
    }

    public void setDescartado(boolean descartado) {
        this.descartado = descartado;
    }

    public void setTipoImpuesto(TipoImpuesto tipoImpuesto) {
        this.tipoImpuesto = tipoImpuesto;
    }
    
}
