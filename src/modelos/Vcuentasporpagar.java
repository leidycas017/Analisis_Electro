/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package modelos;

import java.sql.Date;

public class Vcuentasporpagar {
     private int idcuentasporpagar;
     private int idcompra;
     private Date fecha_pago;
     private Date fecha_maxima;
     private float valor;
     private String estado;

    public Vcuentasporpagar() {
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public int getIdcuentasporpagar() {
        return idcuentasporpagar;
    }

    public void setIdcuentasporpagar(int idcuentasporpagar) {
        this.idcuentasporpagar = idcuentasporpagar;
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public Date getFecha_maxima() {
        return fecha_maxima;
    }

    public void setFecha_maxima(Date fecha_maxima) {
        this.fecha_maxima = fecha_maxima;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
     
     
}
