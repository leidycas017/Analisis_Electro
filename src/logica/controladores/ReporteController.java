/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.controladores;

//import logica.reportes.ReporteEstrategia;

import logica.reportes.FabricaReportes;
import logica.reportes.ReporteSistemaClieVentEstrategia;

//import logica.reportes.ReporteFactory;

/**
 *
 * @author Usuario
 */
public class ReporteController {
    public void generarReporteVentas(){
        //LLamar al factory para obtener Estartegia
        //Consultar lista de Ventas
        //Pasar venta a la estrategia
        ReporteSistemaClieVentEstrategia est;
        est = FabricaReportes.getInstanceFabrica().getEstrategiaReporte();
        est.mostrarRepote();
    }
}
