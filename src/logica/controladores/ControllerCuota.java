/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package logica.controladores;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import logica.accesodatos.CuotaDao;
import modelos.Vcuota;


public class ControllerCuota {
     private  CuotaDao cuota;
    private  String buscar;
    
    public ControllerCuota() throws SQLException {
        cuota = new CuotaDao();
        buscar = "";
    }
    public void gestionInsertarCoutaController(Vcuota dts){
         
    } 
   
    public boolean insertarCuotaController(Vcuota dts){
           boolean flag = cuota.insertar(dts);
           return flag;
    } 
    public boolean editarCuotaController(Vcuota dts){
        boolean flag;
        flag = cuota.editar(dts);
        return flag;
    }
    public boolean eliminarCuotaController(Vcuota dts){
        boolean flag;
        flag = cuota.eliminar(dts);
        return flag;
    }
    public DefaultTableModel mostrarCuotaController(String buscar){
          DefaultTableModel modelo = new DefaultTableModel();
          modelo = cuota.mostrar(buscar);
          return modelo;
    } 
     public boolean existeCuotaController(int idcuota){
        boolean noexiste = false;
        return noexiste;
    }
}
