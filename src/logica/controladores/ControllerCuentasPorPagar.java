/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package logica.controladores;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import logica.accesodatos.CuentasporpagarDao;
import modelos.Vcuentasporpagar;


public class ControllerCuentasPorPagar {
    private  CuentasporpagarDao cuentaspp;
    private  String buscar;
    
    public ControllerCuentasPorPagar() throws SQLException {
        cuentaspp = new CuentasporpagarDao();
        buscar = "";
    }
    public void gestionInsertarCuentasPorPagarController(Vcuentasporpagar dts){
         
    } 
   
    public boolean insertarCuentasPorPagarController(Vcuentasporpagar dts){
           boolean flag = cuentaspp.insertar(dts);
           return flag;
    } 
    public boolean editarCuentasPorPagarController(Vcuentasporpagar dts){
        boolean flag;
        flag = cuentaspp.editar(dts);
        return flag;
    }
    public boolean eliminarCuentasPorPagarController(Vcuentasporpagar dts){
        boolean flag;
        flag = cuentaspp.eliminar(dts);
        return flag;
    }
    public DefaultTableModel mostrarCuentasPorPagarController(String buscar){
          DefaultTableModel modelo = new DefaultTableModel();
          modelo = cuentaspp.mostrar(buscar);
          return modelo;
    } 
     public boolean existePersonaController(String idpersona){
        boolean noexiste = false;
        return noexiste;
    }
}
