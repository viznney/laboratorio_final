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
public class TipoImpuesto extends Entidad {
    int codigoTipoImpuesto;
    String nombreTipoImpuesto;
    boolean importeEditable;
    EstadoTipoImpuesto estado;
    
    public TipoImpuesto() {
    }

    public int getCodigoTipoImpuesto() {
        return codigoTipoImpuesto;
    }

    public String getNombreTipoImpuesto() {
        return nombreTipoImpuesto;
    }

    public boolean isImporteEditable() {
        return importeEditable;
    }
    
    public EstadoTipoImpuesto getEstado() {
        return estado;
    }

    public void setCodigoTipoImpuesto(int codigoTipoImpuesto) {
        this.codigoTipoImpuesto = codigoTipoImpuesto;
    }

    public void setNombreTipoImpuesto(String nombreTipoImpuesto) {
        this.nombreTipoImpuesto = nombreTipoImpuesto;
    }

    public void setImporteEditable(boolean importeEditable) {
        this.importeEditable = importeEditable;
    }

    public void setEstado(EstadoTipoImpuesto estado) {
        this.estado = estado;
    }
    
}
