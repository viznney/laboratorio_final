/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

/**
 *
 * @author Andres
 */
public class DTOTipoImpuesto {
    int codigo;
    boolean importeEditable;
    String nombre;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isImporteEditable() {
        return importeEditable;
    }

    public void setImporteEditable(boolean importeEditable) {
        this.importeEditable = importeEditable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
