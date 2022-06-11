/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package logica.controladores;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import logica.accesodatos.ClienteDao;
import modelos.Vcliente;

public class ControllerCliente {
    private  ClienteDao clie;
    private  String buscar;
    
    public ControllerCliente() throws SQLException {
        clie = new ClienteDao();
        buscar = "";
    }
    public void gestionInsertarClienteController(Vcliente dts){
         
    } 
   
    public boolean insertarClienteController(Vcliente dts){
           boolean flag = clie.insertar(dts);
           return flag;
    } 
    public boolean editarClienteController(Vcliente dts){
        boolean flag;
        flag = clie.editar(dts);
        return flag;
    }
    public boolean eliminarClienteController(Vcliente dts){
        boolean flag;
        flag = clie.eliminar(dts);
        return flag;
    }
    public DefaultTableModel mostrarClienteController(String buscar){
          DefaultTableModel modelo = new DefaultTableModel();
          modelo = clie.mostrar(buscar);
          return modelo;
    } 
    public boolean existePersonaController(String idpersona){
        boolean noexiste = false;
        return noexiste;
    }
}
