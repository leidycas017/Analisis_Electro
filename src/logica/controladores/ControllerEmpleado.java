/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package logica.controladores;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelos.Vcliente;
import logica.accesodatos.EmpleadoDao;
import modelos.Vempleado;

public class ControllerEmpleado {
    private  EmpleadoDao empl;
    String buscar;
    public ControllerEmpleado() throws SQLException {
        empl = new EmpleadoDao();
        buscar = "";
    }
    public boolean insertarEmpleadoController(Vempleado dts){
           boolean flag = empl.insertar(dts);
           return flag;
    } 
    public boolean editarEmpleadoController(Vempleado dts){
        boolean flag;
        flag = empl.editar(dts);
        return flag;
    }
    public boolean eliminarEmpleadoController(Vempleado dts){
        boolean flag;
        flag = empl.eliminar(dts);
        return flag;
    }
    public DefaultTableModel mostrarEmpleadoController(String buscar){
          DefaultTableModel modelo = new DefaultTableModel();
          modelo = empl.mostrar(buscar);
          return modelo;
    }
     public boolean existePersonaController(String numDocumento){
        boolean noexiste = false;
        return  noexiste;
    }
}
