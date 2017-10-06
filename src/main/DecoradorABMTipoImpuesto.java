
package main;

import DTOs.DTOModificarAtributo;
import DTOs.DTONuevoAtributo;
import DTOs.DTOTipoImpuesto;
import java.util.List;

public class DecoradorABMTipoImpuesto extends ExpertoABMTipoImpuesto
{

    public DecoradorABMTipoImpuesto() {
    }
    
    @Override
    public List<DTOTipoImpuesto> buscarTipoImpuesto() {
        FachadaInterna.getInstance().iniciarTransaccion();
        return super.buscarTipoImpuesto();
    }
    
    @Override
    public void guardarNuevo(List<DTONuevoAtributo> atributos) {
        super.guardarNuevo(atributos);
        FachadaInterna.getInstance().finalizarTransaccion();
    }
    
    @Override
    public void guardarModificado(List<DTOModificarAtributo> atributos, String nombre, boolean editable) {
        super.guardarModificado(atributos, nombre, editable);
        FachadaInterna.getInstance().finalizarTransaccion();
    }
    
    @Override
    public void eliminarTipoImpuesto(int codigoTipoImpuesto) {
        super.eliminarTipoImpuesto(codigoTipoImpuesto);
        FachadaInterna.getInstance().finalizarTransaccion();
    }
    
}
    

