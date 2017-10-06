/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import entidades.*;
import DTOs.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;


/**
 *
 * @author Andres
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ABMTipoImpuesto abmti = new ABMTipoImpuesto();
        abmti.setVisible(true);
        //ABMTipoImpuesto77 abmti = new ABMTipoImpuesto77(); //     esta es la que anda
        //abmti.setVisible(true);
        /*List<DTOUsuario> listaDTOUsuario = new ArrayList<>();
        
        List<DTOCriterio> criterioList1 = new ArrayList<>();
        DTOCriterio criterio1 = new DTOCriterio();
        criterio1.setAtributo("nombreEstadoUsuario");
        criterio1.setOperacion("=");
        criterio1.setValor("Habilitado");
        criterioList1.add(criterio1);

        EstadoUsuario estado  = (EstadoUsuario) FachadaPersistencia.getInstance().buscar("EstadoUsuario", criterioList1).get(0);
        
        List<DTOCriterio> criterioList2 = new ArrayList<>();
        DTOCriterio criterio2 = new DTOCriterio();
        criterio2.setAtributo("m_EstadoUsuario");
        criterio2.setOperacion("=");
        criterio2.setValor(estado);
        criterioList2.add(criterio2);
        
        List<Object> listaTI;

        listaTI = FachadaPersistencia.getInstance().buscar("UsuarioLab", criterioList2);
        int i=0;
        for(Object ti: listaTI){
            UsuarioLab temp = (UsuarioLab)ti;
            System.out.println(temp.getUsuario());
            //System.out.println(temp.getM_EstadoUsuario().getNombreEstadoUsuario());
        }*/
        
        //LISTAR_IMPUESTOS lista = new LISTAR_IMPUESTOS();
        //lista.setVisible(true);
    }
    
}
