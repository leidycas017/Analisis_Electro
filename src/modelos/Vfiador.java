/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package modelos;

public class Vfiador extends Vpersona{
    private int    idfiador;
    private String estado;
    private float  ingreso_mensual;
    private String direccion_laboral;

    public Vfiador() {
    }

    public int getIdfiador() {
        return idfiador;
    }

    public void setIdfiador(int idfiador) {
        this.idfiador = idfiador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getIngreso_mensual() {
        return ingreso_mensual;
    }

    public void setIngreso_mensual(float ingreso_mensual) {
        this.ingreso_mensual = ingreso_mensual;
    }

    public String getDireccion_laboral() {
        return direccion_laboral;
    }

    public void setDireccion_laboral(String direccion_laboral) {
        this.direccion_laboral = direccion_laboral;
    }
    
   
    
}
