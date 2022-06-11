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
import modelos.Vcuentasporpagar;


public class CuentasporpagarDao {
    private AdminDatos mysql;
    private Connection cn;
    private String sSQL="";
    private String sSQL2 = "";
    DefaultTableModel modelo;
   
    String cabecera[] = {"ID Cuenta A Pagar","Id Compra","Fecha Pago","Fecha Máxima","Valor", "Estado"};
    public CuentasporpagarDao() throws SQLException{
        iniciarconnection();
       
    }
    public void iniciarconnection() throws SQLException{
         AdminDatos mysql=new AdminDatos();
         cn = mysql.conectar();
    }
    
     public boolean insertar(Vcuentasporpagar dts){
         sSQL ="INSERT INTO CUENTASPORPAGAR (idcompra,fecha_pago ,fecha_maxima, valor, estado)"+
                "VALUES (?,?,?,?,?)";
       
        try{
            
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
           
            pst.setInt(1,dts.getIdcompra());
            pst.setDate(2, dts.getFecha_pago());
            pst.setDate(3, dts.getFecha_maxima());
            pst.setFloat(4,dts.getValor());
            pst.setFloat(5,dts.getValor());
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
     public boolean editar(Vcuentasporpagar dts){
        sSQL = "UPDATE Cuentasporpagar set fecha_pago =?, fecha_maxima =?,valor = ?, estado =? " +
               "WHERE idcuentasporpagar = ?";
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
                   
            pst.setDate(1,dts.getFecha_pago());
            pst.setDate(2, dts.getFecha_maxima());
            pst.setFloat(3, dts.getValor());
            pst.setString(4, dts.getEstado());
            pst.setInt(5, dts.getIdcuentasporpagar());
                      
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
     public boolean eliminar(Vcuentasporpagar dts){
        //Primero se elimina la tupla de la instancia derivada y luego se elimina la tupla del padre
        sSQL = "DELETE FROM CUENTASPORPAGAR WHERE idcuentasporpagar=?";
       
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            pst.setInt(1, dts.getIdcuentasporpagar()); //Va enla posicion 9 que corresponde a la variable del WHERE
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
        String registro[] = new String[10];
        modelo = new DefaultTableModel(null, cabecera);
        
        sSQL = "Select idcuentasporpagar,idcompra, fecha_pago, fecha_maxima, valor, estado "
                + " FROM CUENTASPORPAGAR "
                + "Where estado like '%"+buscar+"%' order by estado desc";
        
      
        try{
           
            Statement st = cn.createStatement();  //Crea variable para poder ejecutar el método executequery
            ResultSet rs = st.executeQuery(sSQL);   //Se ejecuta la sentencia query y retorna el resultado de la consulta
            while(rs.next()){
                registro[0] = rs.getString("idcuentasporpagar");
                registro[1] = rs.getString("idcompra");
                registro[2] = rs.getString("fecha_pago");
                registro[3] = rs.getString("fecha_maxima");
                registro[4] = rs.getString("valor");  
                registro[5] = rs.getString("estado");  
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
