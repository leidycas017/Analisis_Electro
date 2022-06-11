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
import modelos.Vempleado;


public class EmpleadoDao {
    private AdminDatos mysql;
    private Connection cn;
    private String sSQL="";
    private String sSQL2 = "";
    DefaultTableModel modelo;
    
    String cabecera[] = {"ID","Fecha ingreso","Nombres","Número Documento","Direccion","Telefono","Correo","Dirección",
                         "Salario","Acceso", "Usuario","Contraseña"};
    public EmpleadoDao() throws SQLException{
        iniciarconnection();
        
    }
    public void iniciarconnection() throws SQLException{
         AdminDatos mysql=new AdminDatos();
         cn = mysql.conectar();
    }
    public boolean editar(Vempleado dts){
        sSQL = "UPDATE Persona set fecha_registro =?, nombre =?, num_documento = ?, " +
                " direccion=?, telefono = ? , email = ? "+
                "WHERE idpersona = ?";
      
        sSQL2 = "UPDATE Empleado SET cargo =?, salario =?, acceso =?, usuario=?, contrasena = ? "+
                "WHERE idempleado =?";
        
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
           
            pst.setDate(1,dts.getFecha_registro());
            pst.setString(2, dts.getNombres());
            pst.setString(3,dts.getNum_documento());
            pst.setString(4, dts.getDireccion());
            pst.setString(5, dts.getTelefono());
            pst.setString(6,dts.getEmail());
            pst.setInt(7, dts.getIdpersona());
           
            pst2.setString(1, dts.getCargo());
            pst2.setDouble(2,dts.getSalario());
            pst2.setString(3,dts.getAcceso());
            pst2.setString(4,dts.getLogin());
            pst2.setString(5,dts.getPassword());
            pst2.setInt(6,dts.getIdpersona());
           
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
    public boolean eliminar(Vempleado dts){
        //Primero se elimina la tupla de la instancia derivada y luego se elimina la tupla del padre
        sSQL = "DELETE FROM Empleado WHERE idempleado=?";
        sSQL2 ="DELETE FROM Persona WHERE idpersona=?";
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            
            pst.setInt(1, dts.getIdpersona()); //SE setea el campo herencia de persona
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
    /*Codigo funcionando correctamente*/
    public boolean insertar(Vempleado dts){
        sSQL ="INSERT INTO Persona (fecha_registro, nombre, num_documento ,direccion, telefono, email)"+
                "VALUES (?,?,?,?,?,?)";
       
               
        sSQL2 = "INSERT INTO Empleado (idempleado ,cargo, salario, acceso,usuario , contrasena)" +
                "values((SELECT idpersona FROM Persona ORDER BY idpersona desc limit 1),?,?,?,?,?)";
               
        try{
            
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            pst.setDate(1,dts.getFecha_registro());
            pst.setString(2, dts.getNombres());
            pst.setString(3,dts.getNum_documento());
            pst.setString(4, dts.getDireccion());
            pst.setString(5, dts.getTelefono());
            pst.setString(6,dts.getEmail());
            
           // pst2.setInt(1, dts.getIdpersona());  //Porque no se envía  magia herencia
            pst2.setString(1, dts.getCargo());
            pst2.setFloat(2,dts.getSalario());
            pst2.setString(3,dts.getAcceso());
            pst2.setString(4,dts.getLogin());
            pst2.setString(5,dts.getPassword());
          
            
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
    /*Pendiente rediseño mucho ojo*/
    public DefaultTableModel login(String usuario, String contrasena){
        String registro[] = new String[5];
        String cab[] = {"Id","Nombres ","Acceso","Usuario","Contrasena"};
       
        modelo = new DefaultTableModel(null, cab);
        
        sSQL = "SELECT p.idpersona, p.nombre, "
                + " t.acceso,t.usuario, t.contrasena"
                + " FROM persona p  INNER JOIN empleado t "
                + "ON p.idpersona = t.idempleado "
                + "WHERE t.usuario ='"+usuario+"' AND t.contrasena='" + contrasena+"'";
              
        try{
           
            Statement st = cn.createStatement();  //Crea variable para poder ejecutar el método executequery
            ResultSet rs = st.executeQuery(sSQL);   //Se ejecuta la sentencia query y retorna el resultado de la consulta
            
            while(rs.next()){
                registro[0] = rs.getString("p.idpersona");
                registro[1] = rs.getString("p.nombre");
                registro[2] = rs.getString("t.acceso");
                registro[3] = rs.getString("usuario");
                registro[4] = rs.getString("contrasena");
                
                modelo.addRow(registro);  //Se agrega registro a la tabla
            }
         
        }
        catch(Exception e){
             System.out.println("Verifica la lógica SQL " + e);
             return null;
        }
        return modelo;
    }
    /*Pendiente Rediseño*/
    public DefaultTableModel mostrar(String buscar){
        String registro[] = new String[12];
        modelo = new DefaultTableModel(null, cabecera);
        
        sSQL = "Select idpersona , fecha_registro , nombre,num_documento,"
                + "direccion, telefono,email , cargo, salario ,acceso,usuario , contrasena"
                + " FROM persona  INNER JOIN empleado "
                + "On idpersona = idempleado Where num_documento like '%"+buscar+"%' order by idempleado desc";
        try{
           
            Statement st = cn.createStatement();  //Crea variable para poder ejecutar el método executequery
            ResultSet rs = st.executeQuery(sSQL);   //Se ejecuta la sentencia query y retorna el resultado de la consulta
            while(rs.next()){
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("fecha_registro");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("num_documento");
                registro[4] = rs.getString("direccion");
                registro[5] = rs.getString("telefono");
                registro[6] = rs.getString("email");
                registro[7] = rs.getString("cargo");
                registro[8] =  rs.getString("salario");
                registro[9] = rs.getString("acceso");
                registro[10] = rs.getString("usuario");
                registro[11] = rs.getString("contrasena");
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
