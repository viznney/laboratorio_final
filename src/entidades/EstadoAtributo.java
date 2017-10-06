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
public class EstadoAtributo extends Entidad{
    int codigoEstadoAtributo;
    String nombreEstadoAtributo;

    public EstadoAtributo() {
    }

    public int getCodigoEstadoAtributo() {
        return codigoEstadoAtributo;
    }

    public String getNombreEstadoAtributo() {
        return nombreEstadoAtributo;
    }

    public void setCodigoEstadoAtributo(int codigoEstadoAtributo) {
        this.codigoEstadoAtributo = codigoEstadoAtributo;
    }

    public void setNombreEstadoAtributo(String nombreEstadoAtributo) {
        this.nombreEstadoAtributo = nombreEstadoAtributo;
    }
    
}
