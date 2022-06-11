/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package logica.controladores;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import logica.accesodatos.VentaDao;
import modelos.Vdetalleventa;
import modelos.Vventa;
/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
public class ControllerVenta {
    private  VentaDao venta;
    private  String buscar;
    
    public ControllerVenta() throws SQLException {
        venta = new VentaDao();
        buscar = "";
    }
    public void gestionInsertarVentaController(Vventa dts, Vdetalleventa dtsv){
         
    } 
   
    public boolean insertarVentaController(Vventa dts, Vdetalleventa dtsv){
           boolean flag = venta.insertar(dts, dtsv);
           return flag;
    } 
    public boolean editarVentaController(Vventa dts, Vdetalleventa dtsv){
        boolean flag;
        flag = venta.editar(dts, dtsv);
        return flag;
    }
    public boolean eliminarVentaController(Vventa dts, Vdetalleventa dtsv){
        boolean flag;
        flag = venta.eliminar(dts, dtsv);
        return flag;
    }
    public DefaultTableModel mostrarVentaController(String buscar){
          DefaultTableModel modelo = new DefaultTableModel();
          modelo = venta.mostrar(buscar);
          return modelo;
    } 
     public boolean existeVentaController(int idventa){
        boolean noexiste = false;
        return noexiste;
    }
    
}
