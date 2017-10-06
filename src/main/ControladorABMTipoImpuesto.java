package main;

import DTOs.DTOAtributo;
import DTOs.DTOModificarAtributo;
import DTOs.DTONuevoAtributo;
import DTOs.DTOTipoImpAtrib;
import DTOs.DTOTipoImpuesto;
import java.util.ArrayList;
import java.util.List;

public class ControladorABMTipoImpuesto
{

    private ExpertoABMTipoImpuesto experto = (ExpertoABMTipoImpuesto) FabricaExpertos.getInstancia().crearExperto("ABMTipoImpuesto");

    public List<DTOTipoImpuesto> buscarTipoImpuesto(){
        return experto.buscarTipoImpuesto();
    }
    
    public List<DTOAtributo> crearTipoImpuesto(String nombreTI, boolean importeEditableTI){
       return experto.crearTipoImpuesto(nombreTI, importeEditableTI);
    }
    
    public void guardarNuevo(List<DTONuevoAtributo> atributos){
        experto.guardarNuevo(atributos);
    }
    
    public List<DTOTipoImpAtrib> modificarTipoImpuesto(int codigoTipoImpuesto){
        return experto.modificarTipoImpuesto(codigoTipoImpuesto);
    }
    
    public void guardarModificado(List<DTOModificarAtributo> atributos, String nombre, boolean editable){
        experto.guardarModificado(atributos, nombre, editable);
    }
    
    public void eliminarTipoImpuesto(int codigoTipoImpuesto){
        experto.eliminarTipoImpuesto(codigoTipoImpuesto);
    }

}
