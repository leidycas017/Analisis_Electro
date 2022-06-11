/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/

package logica.accesodatos;
import  conexion.AdminDatos;
import  java.sql.Connection;
import  java.sql.PreparedStatement;
import  java.sql.ResultSet;
import  java.sql.SQLException;
import  java.sql.Statement;
import  javax.swing.table.DefaultTableModel;
import  modelos.Vcompra;
import  modelos.VproductoComprado;

public class CompraDao {
    private AdminDatos mysql;
    private Connection cn;
    private String sSQL="";
    private String sSQL2 = "";
    private DefaultTableModel modelo;
    
    private String cabecera[] = {"ID Compra","ID Proveedor","Estado","Fecha","Id Producto", "Cantidad","Valor Compra"};
    public CompraDao() throws SQLException{
        iniciarconnection();
    }
    /*
     * El metodo instancia la clase conexión que contiene los metodos necesarios para conectarse a la bdd
    */
    public void iniciarconnection() throws SQLException{
         AdminDatos mysql=new AdminDatos();
         cn = mysql.conectar();
    }
    
    public boolean insertar(Vcompra dtscompra,VproductoComprado dtspc){
        sSQL ="INSERT INTO Compra (idproveedor, estado, fecha)"+
                "VALUES (?,?,?)";
       
        /*idproductocomprado debe ser autogenerado*/       
        sSQL2 = "INSERT INTO productocomprado (idproducto,idcompra,cantidad,valorcompra)" +
                "VALUES(?,(SELECT idcompra FROM compra ORDER BY idcompra desc limit 1),?,?)";
               
        try{
            
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            
            pst.setInt(1, dtscompra.getIdpreveedor());
            pst.setString(2,dtscompra.getEstado());
            pst.setDate(3, dtscompra.getFechacopmpra());
            int flag = pst.executeUpdate();  
            
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            pst2.setInt(1,dtspc.getIdproducto());
            pst2.setInt(2,dtspc.getCantidad());
            pst2.setFloat(3,dtspc.getValorcompra());
            
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
    
    public boolean editar(Vcompra dtscompra, VproductoComprado dtspc){
        sSQL = "UPDATE Compra SET idproveedor =?, estado =?,fecha = ? " +
               "WHERE idcompra = ?";
      
        sSQL2 = "UPDATE productocomprado SET idproducto =?, cantidad=?, Valorcompra =? "+
                "WHERE idcompra =?";
        
        try{
            
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            
            pst.setInt(1,dtscompra.getIdpreveedor());
            pst.setString(2, dtscompra.getEstado());
            pst.setDate(3, dtscompra.getFechacopmpra());
            pst.setInt(4, dtscompra.getIdcompra());
                     
            pst2.setInt(1,dtspc.getIdproducto());
            pst2.setInt(2, dtspc.getCantidad());
            pst2.setFloat(3,dtspc.getValorcompra());
            pst2.setFloat(4,dtspc.getValorcompra());
            
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
    public boolean eliminar(Vcompra dts){
        //Primero se elimina la tupla de la instancia derivada y luego se elimina la tupla del padre
        sSQL = "DELETE FROM compra WHERE idcompra=?";
        sSQL2 ="DELETE FROM productocomprado WHERE idcompra=?";
     
        try{
            PreparedStatement pst=cn.prepareStatement(sSQL); //Se prepara la sentencia sql para insertar
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            
            pst.setInt(1, dts.getIdcompra()); //Va enla posicion 9 que corresponde a la variable del WHERE
            pst2.setInt(1,dts.getIdcompra());
            
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
    /*Pendiente modificar*/
     public DefaultTableModel mostrar(String buscar){
        String registro[] = new String[10];
        modelo = new DefaultTableModel(null, cabecera);
        
        sSQL = "Select c.idcompra,c.idproveedor, c.estado, c.fecha,"
                + "p.idproducto, p.cantidad, p.valorcompra "
                + " FROM compra c  INNER JOIN productocomprado p  "
                + "On c.idcompra = p.idcompra Where c.fecha like '%"+buscar+"%' order by c.fecha desc"; //Ojo
        try{
           
            Statement st = cn.createStatement();  //Crea variable para poder ejecutar el método executequery
            ResultSet rs = st.executeQuery(sSQL);   //Se ejecuta la sentencia query y retorna el resultado de la consulta
            while(rs.next()){
                registro[0] = rs.getString("c.idcompra");
                registro[1] = rs.getString("c.idproveedor");
                registro[2] = rs.getString("c.estado");
                registro[3] = rs.getString("c.fecha");
                registro[4] = rs.getString("p.idproducto");
                registro[5] = rs.getString("p.cantidad");
                registro[6] = rs.getString("p.valorcompra");
                            
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
