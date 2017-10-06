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
public class EstadoTipoImpuesto extends Entidad {
    int codigoEstadoTipoImpuesto;
    String nombreEstadoTipoImpuesto;

    public EstadoTipoImpuesto() {
    }

    public int getCodigoEstadoTipoImpuesto() {
        return codigoEstadoTipoImpuesto;
    }

    public String getNombreEstadoTipoImpuesto() {
        return nombreEstadoTipoImpuesto;
    }

    public void setCodigoEstadoTipoImpuesto(int codigoEstadoTipoImpuesto) {
        this.codigoEstadoTipoImpuesto = codigoEstadoTipoImpuesto;
    }

    public void setNombreEstadoTipoImpuesto(String nombreEstadoTipoImpuesto) {
        this.nombreEstadoTipoImpuesto = nombreEstadoTipoImpuesto;
    }
    
}
