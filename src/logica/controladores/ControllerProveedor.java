/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package logica.controladores;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import logica.accesodatos.ProveedorDao;
import modelos.Vproveedor;

public class ControllerProveedor {
    private  ProveedorDao empl;
    private  String buscar;
    public ControllerProveedor() throws SQLException {
        empl = new ProveedorDao();
        buscar = "";
    }
    public boolean insertarProveedorController(Vproveedor dts){
           boolean flag = empl.insertar(dts);
           return flag;
    } 
    public boolean editarProveedorController(Vproveedor dts){
        boolean flag;
        flag = empl.editar(dts);
        return flag;
    }
    public boolean eliminarProveedorController(Vproveedor dts){
        boolean flag;
        flag = empl.eliminar(dts);
        return flag;
    }
    public DefaultTableModel mostrarProveedorController(String buscar){
          DefaultTableModel modelo = new DefaultTableModel();
          modelo = empl.mostrar(buscar);
          return modelo;
    }
    
    public boolean existePersonaController(String idpersona){
        boolean noexiste = false;
        return  noexiste;
    }
}
