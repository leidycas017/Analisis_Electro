/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package modelos;

import java.sql.Date;

public class Vcredito {
    private int idcredito;
    private int idventa;
    private int idcliente;
    private int idfiador;
    private Date fechacredito;
    private String estado;
    private int numerocuotas;
    private float valor_credito;
    private float valor_couta_inicial;

    public int getIdcredito() {
        return idcredito;
    }

    public void setIdcredito(int idcredito) {
        this.idcredito = idcredito;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdfiador() {
        return idfiador;
    }

    public void setIdfiador(int idfiador) {
        this.idfiador = idfiador;
    }

    public Date getFechacredito() {
        return fechacredito;
    }

    public void setFechacredito(Date fechacredito) {
        this.fechacredito = fechacredito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumerocuotas() {
        return numerocuotas;
    }

    public void setNumerocuotas(int numerocuotas) {
        this.numerocuotas = numerocuotas;
    }

    public float getValor_credito() {
        return valor_credito;
    }

    public void setValor_credito(float valor_credito) {
        this.valor_credito = valor_credito;
    }

    public float getValor_couta_inicial() {
        return valor_couta_inicial;
    }

    public void setValor_couta_inicial(float valor_couta_inicial) {
        this.valor_couta_inicial = valor_couta_inicial;
    }
    

    
}
