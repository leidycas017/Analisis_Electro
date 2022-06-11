/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.controladores;

import logica.reportes.FabricaReportes;
import logica.reportes.ReporteSistemaClieVentEstrategia;

/**
 *
 * @author Usuario
 */
public class ReporteClienteController {
    public String[] generarReporteCliente(String documento){
        String[] cliente = new String[10];
        //LLamar al factory para obtener Estartegia
        //Consultar lista de Ventas
        //Pasar venta a la estrategia
        ReporteSistemaClieVentEstrategia est;
        est = FabricaReportes.getInstanceFabrica().getEstrategiaReporte();
        cliente = est.generarReporte(documento);
        return cliente;
    }
}
