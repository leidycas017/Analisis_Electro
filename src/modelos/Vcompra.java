/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package modelos;

import java.sql.Date;

public class Vcompra {
    private int    idcompra;
    private int    idpreveedor;
    private String estado;
    private Date   fechacopmpra;

    public Vcompra() {
    }

    

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public int getIdpreveedor() {
        return idpreveedor;
    }

    public void setIdpreveedor(int idpreveedor) {
        this.idpreveedor = idpreveedor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechacopmpra() {
        return fechacopmpra;
    }

    public void setFechacopmpra(Date fechacpmpra) {
        this.fechacopmpra = fechacpmpra;
    }
    
    
}
