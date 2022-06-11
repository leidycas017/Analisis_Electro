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
import modelos.Vproveedor;

public class ProveedorDao {
    private AdminDatos mysql;
    private Connection cn;
    private String sSQL="";
    private String sSQL2 = "";
    private DefaultTableModel modelo;
    private String cabecera[] ={"ID", "Fecha Ingreso","Nombres", "Número Documento","Direccion","Correo","Teléfono","Nombre Banco","Numero Cuenta"};
   
    
    public ProveedorDao() throws SQLException{
         iniciarconnection();
    }
    /*
     * El metodo instancia la clase conexión que contiene los metodos necesarios para conectarse a la bdd
    */
    private void iniciarconnection() throws SQLException{
         AdminDatos mysql=new AdminDatos();
         cn = mysql.conectar();
    }
     /*
     * Tengase en cuenta que Cliente hereda de la tabla persona todos sus atributos
    */
    public boolean insertar(Vproveedor dts){
         sSQL ="INSERT INTO Persona (fecha_registro, nombre, num_documento ,direccion, email, telefono)"+
                "VALUES (?,?,?,?,?,?)";
       
               
        sSQL2 = "INSERT INTO Proveedor (idproveedor,nombrebanco, numerocuenta)" +
                "values((SELECT idpersona FROM Persona ORDER BY idpersona desc limit 1),?,?)";
               
        try{
                        
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            
            pst.setDate(1,dts.getFecha_registro());
            pst.setString(2, dts.getNombres());
            pst.setString(3,dts.getNum_documento());
            pst.setString(4, dts.getDireccion());
            pst.setString(5,dts.getEmail());
            pst.setString(6, dts.getTelefono());
       
            
           // pst2.setInt(1, dts.getIdpersona());  //Porque no se envía  magia herencia
            pst2.setString(1, dts.getNombrebanco());
            pst2.setString(2,dts.getNumerocuenta());
                      
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
    
    public boolean editar(Vproveedor dts){
        sSQL = "UPDATE Persona set fecha_registro =?, nombre=?, num_documento = ?, " +
                " direccion=?, email = ? , telefono = ? "+
                "WHERE idpersona = ?";
      
        sSQL2 = "UPDATE Proveedor SET nombrebanco = ?, numerocuenta = ? "+
                "WHERE idproveedor =?";
        
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
           
            pst.setDate(1,dts.getFecha_registro());
            pst.setString(2, dts.getNombres());
            pst.setString(3,dts.getNum_documento());
            pst.setString(4, dts.getDireccion());
            pst.setString(5, dts.getEmail());
            pst.setString(6,dts.getTelefono());
            pst.setInt(7, dts.getIdpersona());
      
            pst2.setString(1, dts.getNombrebanco());
            pst2.setString(2,dts.getNumerocuenta());
            pst2.setInt(3,dts.getIdpersona());
            
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
    public boolean eliminar(Vproveedor dts){
        //Primero se elimina la tupla de la instancia derivada y luego se elimina la tupla del padre
        sSQL = "DELETE FROM proveedor WHERE idproveedor=?";
        sSQL2 ="DELETE FROM persona WHERE  idpersona=?";
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            pst.setInt(1, dts.getIdpersona());
            pst2.setInt(1,dts.getIdpersona());
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
     public DefaultTableModel mostrar(String buscar){
        String registro[] = new String[11];
        modelo = new DefaultTableModel(null, cabecera);
        
        sSQL = "Select idpersona,fecha_registro,nombre, num_documento,"
                + "direccion, email,telefono , nombrebanco, numerocuenta"
                + " FROM persona  INNER JOIN proveedor "
                + "On idpersona = idproveedor Where num_documento like '%"+buscar+"%' order by idproveedor desc";
        try{
           
            Statement st = cn.createStatement();  //Crea variable para poder ejecutar el método executequery
            ResultSet rs = st.executeQuery(sSQL);   //Se ejecuta la sentencia query y retorna el resultado de la consulta
            while(rs.next()){
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("fecha_registro");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("num_documento");
                registro[4] = rs.getString("direccion");
                registro[5] = rs.getString("email");
                registro[6] = rs.getString("telefono");
                registro[7] = rs.getString("nombrebanco");
                registro[8] = rs.getString("numerocuenta");
                modelo.addRow(registro);  //Se agrega registro a la tabla
            }
         
        }
        catch(Exception e){
             System.out.println("Verifica la lógica SQL " + e);
             return null;
        }
        return modelo;
     }
      public DefaultTableModel mostrarVista(String buscar){
        String registro[] = new String[11];
        modelo = new DefaultTableModel(null, cabecera);
        
        sSQL = "Select idpersona,fecha_registro,nombre, num_documento,"
                + "direccion, email,telefono , nombrebanco, numerocuenta"
                + " FROM persona  INNER JOIN proveedor "
                + "On idpersona = idproveedor Where num_documento like '%"+buscar+"%' order by idproveedor desc";
        try{
           
            Statement st = cn.createStatement();  //Crea variable para poder ejecutar el método executequery
            ResultSet rs = st.executeQuery(sSQL);   //Se ejecuta la sentencia query y retorna el resultado de la consulta
            while(rs.next()){
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("fecha_registro");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("num_documento");
                registro[4] = rs.getString("direccion");
                registro[5] = rs.getString("email");
                registro[6] = rs.getString("telefono");
                registro[7] = rs.getString("nombrebanco");
                registro[8] = rs.getString("numerocuenta");
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
