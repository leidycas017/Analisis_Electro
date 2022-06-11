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
import modelos.Vcredito;

/**
 *
 * @author Usuario
 */

public class CreditoDao {
    private AdminDatos mysql;
    private Connection cn;
    private String sSQL="";
    private String sSQLV = "";
    DefaultTableModel modelo;
    String cabecera[] = {"ID Crédito","ID Venta","ID Cliente","ID Fiador","Fecha Crédito","Estado", "numerocuotas", "Valor Crédito","Couta Inicial"};
    public CreditoDao() throws SQLException{
        iniciarconnection();
       
    }
     public void iniciarconnection() throws SQLException{
         AdminDatos mysql=new AdminDatos();
         cn = mysql.conectar();
    }
    public boolean insertar(Vcredito dtscredito){
          sSQL ="INSERT INTO CREDITO (idventa, idcliente, idfiador, fechacredito, estado, numerocuotas, valorcredito,valor_cuota_inicial)"+
                "VALUES (?,?,?,?,?,?,?,?)";
       
        try{
            
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            
            pst.setInt(1,dtscredito.getIdventa());
            pst.setInt(2,dtscredito.getIdcliente());
            pst.setInt(3,dtscredito.getIdfiador()); 
            pst.setDate(4,dtscredito.getFechacredito());
            pst.setString(5,dtscredito.getEstado());
            pst.setInt(6,dtscredito.getNumerocuotas());
            pst.setFloat(7,dtscredito.getValor_credito());
            pst.setFloat(8,dtscredito.getValor_couta_inicial());
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
    public boolean editar(Vcredito dtscredito){
        sSQL = "UPDATE CREDITO SET  estado =?, numerocuotas = ? " +
               "WHERE idcredito = ?";
      
        try{
            
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            pst.setString(1, dtscredito.getEstado());
            pst.setInt(2, dtscredito.getNumerocuotas());
            pst.setInt(3, dtscredito.getIdcredito());
            int flag = pst.executeUpdate();
            if(flag != 0){
                int n2=0;
                return true;
               // if(n2 !=0){
                    //return true;
                //}
               // else return false;
            }
            else{
                return false;
            }
        }
        
        catch(Exception e){
            System.out.println("Verifica la lógica SQL " + e);;
            return true;
        }
    }
    public boolean eliminar(Vcredito dtscredito){ 
        //Primero se elimina la tupla de la instancia derivada y luego se elimina la tupla del padre
        sSQL = "DELETE FROM CREDITO WHERE idcredito=?";
       
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            pst.setInt(1, dtscredito.getIdcredito()); //Va enla posicion 9 que corresponde a la variable del WHERE
                      
            int flag = pst.executeUpdate();
            
            if(flag != 0){
               
                    return true;
            }        
            else return false;
           
        }
        catch(Exception e){
            System.out.println("Verifica la lógica SQL " + e);
            return true;
        }
    }
      public DefaultTableModel mostrar(String buscar){
        String registro[] = new String[9];
        modelo = new DefaultTableModel(null, cabecera);
        
        sSQL = "Select idcredito, idventa,idcliente, idfiador, fechacredito, "
                + "estado, numerocuotas, valorcredito, valor_cuota_inicial "
                + "FROM CREDITO "
                + "Where estado like '%"+buscar+"%' order by estado desc";
        try{
            Statement st = cn.createStatement();  //Crea variable para poder ejecutar el método executequery
            ResultSet rs = st.executeQuery(sSQL);   //Se ejecuta la sentencia query y retorna el resultado de la consulta
            while(rs.next()){
                registro[0] = rs.getString("idcredito");
                registro[1] = rs.getString("idventa");
                registro[2] = rs.getString("idcliente");
                registro[3] = rs.getString("idfiador");
                registro[4] = rs.getString("fechacredito");
                registro[5] = rs.getString("estado");
                registro[6] = rs.getString("numerocuotas");
                registro[7] = rs.getString("valorcredito");
                registro[8] = rs.getString("valor_cuota_inicial");
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
