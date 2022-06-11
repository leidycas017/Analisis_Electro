/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package modelos;

import java.sql.Date;

public class Vproducto {
    private int idProducto;
    private String ean;
    private int idproveedor;
    private int cantidad;
    private String descripcion_producto;
    private Date fecha_ingreso_producto;
    private float valor_venta;
    
    public Vproducto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public Date getFecha_ingreso_producto() {
        return fecha_ingreso_producto;
    }

    public void setFecha_ingreso_producto(Date fecha_ingreso_producto) {
        this.fecha_ingreso_producto = fecha_ingreso_producto;
    }

    public float getValor_venta() {
        return valor_venta;
    }

    public void setValor_venta(float valor_venta) {
        this.valor_venta = valor_venta;
    }

    
    
}
