/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.reportes;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.accesodatos.ClienteDao;
import logica.controladores.ControllerCliente;
import modelos.Vcliente;
import modelos.Vventa;

/**
 *
 * @author Usuario
 */
public class ReporteCliente implements ReporteSistemaClieVentEstrategia{
    private String accion ="Guardar"; 
    private Vcliente dts; 
    private ClienteDao func;
    @Override
    public void mostrarRepote() {
        dts = new Vcliente();
        try {
            func = new ClienteDao();
        } catch (SQLException ex) {
            Logger.getLogger(ReporteCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

    @Override
    public String[] generarReporte(String documento) {
        String[] cliente=null;
        try { 
            func = new ClienteDao();
            cliente = func.mostrarCliente(documento);
        } catch (SQLException ex) {
            Logger.getLogger(ReporteCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
   }
    
}
