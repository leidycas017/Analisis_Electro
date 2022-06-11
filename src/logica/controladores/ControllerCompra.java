/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package logica.controladores;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.accesodatos.CompraDao;
import modelos.Vcompra;
import modelos.VproductoComprado;

public class ControllerCompra {
    private  CompraDao compra;
    private String buscar;
    public ControllerCompra() throws SQLException {
         compra = new CompraDao();
         buscar = "";
    }
    public void gestionInsertarCliente(){
         
    } 
    public boolean insertarCompraController(Vcompra dts, VproductoComprado dtspc){
           boolean flag = compra.insertar(dts, dtspc);
           return flag;
    } 
    public boolean editarCompraController(Vcompra dts, VproductoComprado dtspc){
        boolean flag;
        flag = compra.editar(dts,dtspc);
        return flag;
    }
    public boolean eliminarCompraController(Vcompra dts){
        boolean flag;
        flag = compra.eliminar(dts);
        return flag;
    }
    public DefaultTableModel mostrarCompraController(String buscar){
          DefaultTableModel modelo = new DefaultTableModel();
          modelo = compra.mostrar(buscar);
          return modelo;
    } 
    public boolean existeCompraController(int idpersona){
        boolean noexiste = false;
        return noexiste;
    }   
}
