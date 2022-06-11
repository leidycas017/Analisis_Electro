/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package logica.controladores;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import logica.accesodatos.FiadorDao;
import modelos.Vfiador;

public class ControllerFiador {
    private  FiadorDao empl;
    private String buscar;
    public ControllerFiador() throws SQLException {
        empl = new FiadorDao();
        buscar = "";
    }
    public boolean insertarFiadorController(Vfiador dts){
           boolean flag = empl.insertar(dts);
           return flag;
    } 
    public boolean editarFiadorController(Vfiador dts){
        boolean flag;
        flag = empl.editar(dts);
        return flag;
    }
    public boolean eliminarFiadorController(Vfiador dts){
        boolean flag;
        flag = empl.eliminar(dts);
        return flag;
    }
    public DefaultTableModel mostrarFiadorController(String buscar){
          DefaultTableModel modelo = new DefaultTableModel();
          modelo = empl.mostrar(buscar);
          return modelo;
    }
    
    public boolean existePersonaController(String numdocumento){
        boolean noexiste = false;
        return  noexiste;
    }
}
