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
import modelos.Vcuota;

public class CuotaDao {
    private AdminDatos mysql;
    private Connection cn;
    private String sSQL="";
    //private String sSQLV = "";
    DefaultTableModel modelo;
    String cabecera[] = {"Numero cuota","ID Credito","Valor Cuota","Fecha Pago","Fecha a Pagar"};
   
    public CuotaDao() throws SQLException{
        iniciarconnection();
    }
     public void iniciarconnection() throws SQLException{
         AdminDatos mysql=new AdminDatos();
         cn = mysql.conectar();
    }
    public boolean insertar(Vcuota dtscuota){
          sSQL ="INSERT INTO CUOTA (numerocuota,idcredito, valorcuota, fecha_pago_cuota,fecha_pagado_cuota )"+
                "VALUES (?,?,?,?,?)";
       
        try{
            
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            pst.setInt(1,dtscuota.getNumerocuota());
            pst.setInt(2,dtscuota.getIdcredito());
            pst.setFloat(3,dtscuota.getValorcuota()); 
            pst.setDate(4,dtscuota.getFecha_pago_cuota());
            pst.setDate(5,dtscuota.getFecha_pagado_cuota());
            int flag = pst.executeUpdate();  
           
            if(flag != 0){
              return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            System.out.println("Verifica al insertar cuota " + e);
            return true;
        }
    }  
     public boolean editar(Vcuota dtscuota){
        sSQL = "UPDATE CUOTA SET  idcredito =?, valorcuota = ?, fecha_pago_cuota= ?, fecha_pagado_cuota=? " +
               "WHERE numerocuota = ?";
      
        try{
            
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            
            pst.setInt(1, dtscuota.getIdcredito());
            pst.setFloat(2, dtscuota.getValorcuota());
            pst.setDate(3, dtscuota.getFecha_pago_cuota());
            pst.setDate(4, dtscuota.getFecha_pagado_cuota());
            pst.setInt(5, dtscuota.getNumerocuota());
            
            int flag = pst.executeUpdate();
            if(flag != 0){
                int n2=0;
                return true;
            }
            else{
                return false;
            }
        }
        
        catch(Exception e){
            System.out.println("Error al editar cuota "+ e);
            return true;
        }
    }
    public boolean eliminar(Vcuota dtscuota){ 
        //Primero se elimina la tupla de la instancia derivada y luego se elimina la tupla del padre
        sSQL = "DELETE FROM CUOTA WHERE numerocuota=?";
       
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            pst.setInt(1, dtscuota.getNumerocuota()); //Va enla posicion 9 que corresponde a la variable del WHERE
                      
            int flag = pst.executeUpdate();
            
            if(flag != 0){
               
                    return true;
            }        
            else return false;
           
        }
        catch(Exception e){
            System.out.println("Error al eliminar cuota "+ e);
            return true;
        }
    }
    public DefaultTableModel mostrar(String buscar){
        String registro[] = new String[5];
        modelo = new DefaultTableModel(null, cabecera);
        
        sSQL = "Select numerocuota, idcredito, valorcuota, fecha_pago_cuota, fecha_pagado_cuota "
                + "FROM CUOTA "
                + "WHERE fecha_pago_cuota like '%"+buscar+"%' order by fecha_pago_cuota desc";
        try{
            Statement st = cn.createStatement();  //Crea variable para poder ejecutar el método executequery
            ResultSet rs = st.executeQuery(sSQL);   //Se ejecuta la sentencia query y retorna el resultado de la consulta
            while(rs.next()){
                registro[0] = rs.getString("numerocuota");
                registro[1] = rs.getString("idcredito");
                registro[2] = rs.getString("valorcuota");
                registro[3] = rs.getString("fecha_pago_cuota");
                registro[4] = rs.getString("fecha_pagado_cuota");
                modelo.addRow(registro);  //Se agrega registro a la tabla
           
          }
        }
        catch(Exception e){
             System.out.println("Error al mostrar parametros cuota "+ e);
             return null;
        }
        return modelo;
    }
}
