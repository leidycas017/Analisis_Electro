/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
 */
package logica.accesodatos;

import conexion.AdminDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import modelos.Vproducto;


public class ProductoDao {
    private AdminDatos mysql;
    private Connection cn;
    private String sSQL="";
    private String sSQL2 = "";
    DefaultTableModel modelo;
    String cabecera[] = {"ID Producto","EAN","ID Proveedor","Cantidad","Descripción","Fecha Ingreso","Valor Venta"};
    public ProductoDao() throws SQLException{
        iniciarconnection();
        
    }
    public void iniciarconnection() throws SQLException{
         AdminDatos mysql=new AdminDatos();
         cn = mysql.conectar();
    }
    public boolean editarCantidad(Vproducto dts){
           sSQL = "UPDATE Producto SET cantidad = ? " +
                   "WHERE idproducto = ?";
              
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            pst.setInt(1,dts.getCantidad());
            pst.setInt(2,dts.getIdProducto());      
            System.out.println("Editando 44");
            int flag = pst.executeUpdate();
        
            if(flag != 0){
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            System.out.println("Verifica la lógica SQL " + e);
            return true;
        }
    }
    public boolean editar(Vproducto dts){
        sSQL = "UPDATE Producto SET ean =?, cantidad = ?, " +
                " descripcion_producto=?, fecha_ingreso_producto = ? , valor_venta = ? "+
                "WHERE idproducto = ?";
              
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            pst.setString(1, dts.getEan());
            pst.setInt(2,dts.getCantidad());
            pst.setString(3, dts.getDescripcion_producto());
            pst.setDate(4, dts.getFecha_ingreso_producto());
            pst.setFloat(5,dts.getValor_venta());
            pst.setInt(6,dts.getIdProducto());      
          
            int flag = pst.executeUpdate();
        
            if(flag != 0){
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            System.out.println("Verifica la lógica SQL " + e);
            return true;
        }
    }
    public boolean eliminar(Vproducto dts){
        //Primero se elimina la tupla de la instancia derivada y luego se elimina la tupla del padre
        sSQL = "DELETE FROM Producto WHERE idproducto=?";
        
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            //PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            
            pst.setInt(1, dts.getIdProducto()); //SE setea el campo herencia de persona
           
            int flag = pst.executeUpdate();
            
            if(flag != 0){
               return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            System.out.println("Verifica la lógica SQL " + e);
            return true;
        }
    }
    
    public boolean insertar(Vproducto dts){
        sSQL ="INSERT INTO Producto (ean, idproveedor, cantidad ,descripcion_producto, fecha_ingreso_producto, valor_venta)"+
                "VALUES (?,?,?,?,?,?)";
                     
        try{
            
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            pst.setString(1,dts.getEan());
            pst.setInt(2, dts.getIdproveedor());
            pst.setInt(3,dts.getCantidad());
            pst.setString(4, dts.getDescripcion_producto());
            pst.setDate(5, dts.getFecha_ingreso_producto());
            pst.setFloat(6,dts.getValor_venta());
            int flag = pst.executeUpdate();
            if(flag != 0){
               return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            System.out.println("Verifica la lógica SQL " + e);
            return true;
        }
    }
    
    public DefaultTableModel mostrar(String buscar){
        String registro[] = new String[12];
        modelo = new DefaultTableModel(null, cabecera);
       // Where num_documento like '%"+buscar+"%' order by idcliente desc";
        sSQL = "Select idproducto , ean , idproveedor,cantidad,descripcion_producto, fecha_ingreso_producto, valor_venta "
                + " FROM producto "
                +  "Where descripcion_producto like '%"+buscar+"%' order by descripcion_producto desc";
        try{
           
            Statement st = cn.createStatement();  //Crea variable para poder ejecutar el método executequery
            ResultSet rs = st.executeQuery(sSQL);   //Se ejecuta la sentencia query y retorna el resultado de la consulta
            while(rs.next()){
                registro[0] = rs.getString("idproducto");
                registro[1] = rs.getString("ean");
                registro[2] = rs.getString("idproveedor");
                registro[3] = rs.getString("cantidad");
                registro[4] = rs.getString("descripcion_producto");
                registro[5] = rs.getString("fecha_ingreso_producto");
                registro[6] = rs.getString("valor_venta");
                modelo.addRow(registro);  //Se agrega registro a la tabla
            }
         
        }
        catch(Exception e){
             System.out.println("Verifica la lógica SQL " + e);
             return null;
        }
        return modelo;
    }
    
      
}
