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
import modelos.Vfiador;

public class FiadorDao {
    private AdminDatos mysql;
    private Connection cn;
    private String sSQL="";
    private String sSQL2 = "";
    DefaultTableModel modelo;
    

    String cabecera[] = {"ID","Fecha Ingreso","Nombres","Numero Documento","Direccion","Correo","Telefono","Ingreso mensual", "Direccion Laboral","Estado"};
    public FiadorDao() throws SQLException{
        iniciarconnection();
     }
    /*
     * El metodo instancia la clase conexión que contiene los metodos necesarios para conectarse a la bdd
    */
    public void iniciarconnection() throws SQLException{
         AdminDatos mysql=new AdminDatos();
         cn = mysql.conectar();
    }
     /*
     * Tengase en cuenta que Cliente hereda de la tabla persona todos sus atributos
    */
    public boolean insertar(Vfiador dts){
         sSQL ="INSERT INTO Persona (fecha_registro, nombre,num_documento ,direccion, email, telefono)"+
                "VALUES (?,?,?,?,?,?)";
       
               
       sSQL2 = "INSERT INTO Fiador (idfiador,ingreso_mensual,direccionlaboral, estado)" +
                "values((SELECT idpersona FROM Persona ORDER BY idpersona desc limit 1),?,?,?)";
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
            pst2.setFloat(1,dts.getIngreso_mensual());
            pst2.setString(2, dts.getEstado());
            pst2.setString(3,dts.getDireccion_laboral());
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
    
    public boolean editar(Vfiador dts){
        sSQL = "UPDATE Persona set fecha_registro =?, nombre =?,num_documento = ?, " +
                " direccion=?, email = ? , telefono = ? "+
                "WHERE idpersona = ?";
      
        sSQL2 = "UPDATE fiador SET ingreso_mensual =?, estado=?, direccionlaboral =? "+
                "WHERE idfiador =?";
        
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
           
            pst.setDate(1,dts.getFecha_registro());
            pst.setString(2, dts.getNombres());
            pst.setString(3, dts.getNum_documento());
            pst.setString(4, dts.getDireccion());
            pst.setString(5, dts.getEmail());
            pst.setString(6, dts.getTelefono());
            pst.setInt(7, dts.getIdpersona());
            
            pst2.setFloat(1,dts.getIngreso_mensual());
            pst2.setString(2, dts.getEstado());
            pst2.setString(3,dts.getDireccion_laboral());
            pst2.setInt(4,dts.getIdpersona());
            
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
    public boolean eliminar(Vfiador dts){
        //Primero se elimina la tupla de la instancia derivada y luego se elimina la tupla del padre
        sSQL = "DELETE FROM fiador WHERE idfiador=?";
        sSQL2 ="DELETE FROM persona WHERE idpersona=?";
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            
            pst.setInt(1, dts.getIdpersona()); //Va enla posicion 9 que corresponde a la variable del WHERE
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
    /*Pendiente modificar*/
     public DefaultTableModel mostrar(String buscar){
        String registro[] = new String[10];
        modelo = new DefaultTableModel(null, cabecera);
        
        sSQL = "Select idpersona,fecha_registro, nombre, num_documento,"
                + " direccion, email, telefono, ingreso_mensual, direccionlaboral, estado"
                + " FROM Persona  INNER JOIN Fiador "
                + "On idpersona = idfiador Where num_documento like '%"+buscar+"%' order by idfiador desc";
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
                registro[7] =  rs.getString("ingreso_mensual");
                registro[8] = rs.getString("direccionlaboral");
                registro[9] =  rs.getString("estado");
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
