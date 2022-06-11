/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package logica.controladores;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import logica.accesodatos.CreditoDao;
import modelos.Vcredito;

public class ControllerCredito {
    private  CreditoDao credito;
    private  String buscar;
    
    public ControllerCredito() throws SQLException {
        credito = new CreditoDao();
        buscar = "";
    }
    public void gestionInsertarCreditoController(Vcredito dts){
         
    } 
   
    public boolean insertarCreditoController(Vcredito dts){
           boolean flag = credito.insertar(dts);
           return flag;
    } 
    public boolean editarCreditoController(Vcredito dts){
        boolean flag;
        flag = credito.editar(dts);
        return flag;
    }
    public boolean eliminarCreditoController(Vcredito dts){
        boolean flag;
        flag = credito.eliminar(dts);
        return flag;
    }
    public DefaultTableModel mostrarCreditoController(String buscar){
          DefaultTableModel modelo = new DefaultTableModel();
          modelo = credito.mostrar(buscar);
          return modelo;
    } 
     public boolean existeCreditoController(int idventa){
        boolean noexiste = false;
        return noexiste;
    }
    
}
