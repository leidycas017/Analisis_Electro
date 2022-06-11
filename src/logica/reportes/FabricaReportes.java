/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.reportes;

/**
 *
 * @author Usuario
 */
public class FabricaReportes {
    private static FabricaReportes instance = null;
    private FabricaReportes(){
        
    }
    public static FabricaReportes getInstanceFabrica(){
         if(instance != null){
             return instance;
         }
         else {
             instance = new FabricaReportes();
             return instance;
         }
    }
     public ReporteSistemaClieVentEstrategia getEstrategiaReporte() {
       
        ReporteSistemaClieVentEstrategia obj = null;
        String conf = "CLIENTE";
        if(conf.equals("VENTA")){
            obj = new ReporteVenta();
        }
        else{
            obj = new ReporteCliente();
        }
        return obj;
    }
}
