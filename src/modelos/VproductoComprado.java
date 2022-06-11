/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package modelos;

public class VproductoComprado {
    private int   idcompra;
    private int   idproducto;
    private int   cantidad;
    private float valorcompra;

    public VproductoComprado() {
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(float valorcompra) {
        this.valorcompra = valorcompra;
    }
    
    
    
}
