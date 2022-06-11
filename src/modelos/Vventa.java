/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package modelos;
import java.sql.Date;

public class Vventa {
    private int idventa;
    private int idcliente;
    private int idempleado;
    private String tipoventa;
    private Date fecha_venta;

    public Vventa() {
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int numventa) {
        this.idventa = numventa;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getTipoventa() {
        return tipoventa;
    }

    public void setTipoventa(String tipoventa) {
        this.tipoventa = tipoventa;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    
    
}
