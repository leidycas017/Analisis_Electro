/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package modelos;

import java.sql.Date;

public class Vcliente extends Vpersona{
    private int   idcliente;
    private float ingreso_mensual;
    private String estado;
    private String direccion_laboral;

    public Vcliente() {
    }

    

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public float getIngreso_mensual() {
        return ingreso_mensual;
    }

    public void setIngreso_mensual(float ingreso_mensual) {
        this.ingreso_mensual = ingreso_mensual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccion_laboral() {
        return direccion_laboral;
    }

    public void setDireccion_laboral(String direccion_laboral) {
        this.direccion_laboral = direccion_laboral;
    }
    
   
}
