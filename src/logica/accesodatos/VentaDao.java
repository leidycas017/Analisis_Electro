/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package logica.accesodatos;

import conexion.AdminDatos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import modelos.Vdetalleventa;
import modelos.Vventa;


public class VentaDao {
    private AdminDatos mysql;
    private Connection cn;
    private String sSQL="";
    private String sSQLV = "";
    DefaultTableModel modelo;
    String cabecera[] = {"ID Venta","ID Cliente","ID Empleado","Tipo Venta","Fecha Venta","Id Producto", "Cantidad","Valor"};
    
    
    public VentaDao() throws SQLException{
        iniciarconnection();
       
    }
    public void iniciarconnection() throws SQLException{
         AdminDatos mysql=new AdminDatos();
         cn = mysql.conectar();
    }
    public boolean insertar(Vventa dtsventa,Vdetalleventa dtsdv){
          sSQL ="INSERT INTO VENTA (idcliente, idempleado, tipoventa, fechaventa)"+
                "VALUES (?,?,?,?)";
       
        /*idproductocomprado debe ser autogenerado*/       
       sSQLV = "INSERT INTO DETALLEVENTA (numventa,idproducto,cantidadcomprada,valor)" +
                "VALUES((SELECT idventa FROM VENTA ORDER BY idventa desc limit 1),?,?,?)";
               
        try{
            
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            
            pst.setInt(1, dtsventa.getIdcliente());
            pst.setInt(2,dtsventa.getIdempleado());
            pst.setString(3, dtsventa.getTipoventa());
            pst.setDate(4, dtsventa.getFecha_venta());
            
            PreparedStatement pst2 = cn.prepareStatement(sSQLV);
            pst2.setInt(1,dtsdv.getIdproducto());
            pst2.setInt(2,dtsdv.getCantidadcomprada());
            pst2.setFloat(3,dtsdv.getValor());
            
            int flag = pst.executeUpdate();  
            if(flag != 0){
                int n2 = pst2.executeUpdate();
                if(n2 !=0){
                  return true;
                }
                else return false;
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
    public boolean editar(Vventa dtsventa, Vdetalleventa dtsdv){
        sSQL = "UPDATE VENTA SET idcliente =?, idempleado =?, tipoventa = ?, fechaventa=? " +
               "WHERE idventa = ?";
      
        sSQLV = "UPDATE DETALLEVENTA SET idproducto =?, cantidadcomprada=?, valor =? "+
                "WHERE numventa =?";
        
        try{
            
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            PreparedStatement pst2 = cn.prepareStatement(sSQLV);
            
            pst.setInt(1,dtsventa.getIdcliente());
            pst.setInt(2, dtsventa.getIdempleado());
            pst.setString(3, dtsventa.getTipoventa());
            pst.setDate(4, dtsventa.getFecha_venta());
            pst.setInt(5, dtsventa.getIdventa());
            
            int numventa = dtsventa.getIdventa();         
            pst2.setInt(1,dtsdv.getIdproducto());
            pst2.setInt(2, dtsdv.getCantidadcomprada());
            pst2.setFloat(3,dtsdv.getValor());
            pst2.setFloat(4,numventa);
            
            int flag = pst.executeUpdate();
            if(flag !=0){
                int n2 = pst2.executeUpdate();
                if(n2 !=0){
                    return true;
                }
                else return false;
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
    public boolean eliminar(Vventa dtsventa, Vdetalleventa dtsdv){ 
       
        sSQL = "DELETE FROM VENTA WHERE idventa=?";
        sSQLV ="DELETE FROM DETALLEVENTA WHERE numventa=?"; //sSQL2
        
     
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            PreparedStatement pst2 = cn.prepareStatement(sSQLV);
            
            pst.setInt(1, dtsventa.getIdventa()); //Va enla posicion 9 que corresponde a la variable del WHERE
            pst2.setInt(1,dtsdv.getNumventa());
            
            int flag = pst2.executeUpdate();
            
            if(flag != 0){
                int n2 = pst.executeUpdate();
                if(n2 !=0){
                    return true;
                }
                else return false;
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
        String registro[] = new String[10];
        modelo = new DefaultTableModel(null, cabecera);
        
        sSQL = "Select v.idventa, v.idcliente,v.idempleado , v.tipoventa, v.fechaventa, "
                + "d.idproducto, d.cantidadcomprada, d.valor "
                + " FROM VENTA v  INNER JOIN DETALLEVENTA d  "
                + "On v.idventa = d.numventa Where v.fechaventa like '%"+buscar+"%' order by v.fechaventa desc"; //Ojo
        try{
           
            Statement st = cn.createStatement();  //Crea variable para poder ejecutar el método executequery
            ResultSet rs = st.executeQuery(sSQL);   //Se ejecuta la sentencia query y retorna el resultado de la consulta
            while(rs.next()){
                registro[0] = rs.getString("v.idventa");
                registro[1] = rs.getString("v.idcliente");
                registro[2] = rs.getString("v.idempleado");
                registro[3] = rs.getString("v.tipoventa");
                registro[4] = rs.getString("v.fechaventa");
                registro[5] = rs.getString("d.idproducto");
                registro[6] = rs.getString("d.cantidadcomprada");
                registro[7] = rs.getString("d.valor");
                            
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
