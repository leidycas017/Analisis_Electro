/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package logica.controladores;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import logica.accesodatos.ProductoDao;
import modelos.Vproducto;


public class ControllerProducto {
    private  ProductoDao prod;
    private  String buscar;
    
    public ControllerProducto() throws SQLException {
        prod = new ProductoDao();
        buscar = "";
    }
    public void gestionInsertarProductoController(Vproducto dts){
         
    } 
   
    public boolean insertarProductoController(Vproducto dts){
           boolean flag = prod.insertar(dts);
           return flag;
    } 
    public boolean editarProductoController(Vproducto dts){
        boolean flag;
        flag = prod.editar(dts);
        return flag;
    }
    public boolean editarCantidadProductoController(Vproducto dts){
        boolean flag;
        flag = prod.editarCantidad(dts);
        return flag;
    }
    public boolean eliminarProductoController(Vproducto dts){
        boolean flag;
        flag = prod.eliminar(dts);
        return flag;
    }
    public DefaultTableModel mostrarProductoController(String buscar){
          DefaultTableModel modelo = new DefaultTableModel();
          modelo = prod.mostrar(buscar);
          return modelo;
    } 
     public boolean existeProductoController(String idpersona){
        boolean noexiste = false;
        return noexiste;
    }
}
