/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package modelos;

public class Vproveedor extends Vpersona{
    private int     idproveedor;
    private String  nombrebanco;
    private String  numerocuenta;

    public Vproveedor() {
    }

     public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNombrebanco() {
        return nombrebanco;
    }

    public void setNombrebanco(String nombrebanco) {
        this.nombrebanco = nombrebanco;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    
}
