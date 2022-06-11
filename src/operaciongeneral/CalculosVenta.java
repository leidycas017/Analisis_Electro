/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciongeneral;

/**
 *
 * @author Usuario
 */
public class CalculosVenta {
     private float resultado;
     public float totalVenta(int cantidad, float valorunitario){
         return cantidad*valorunitario;
    }
    public float valorCuota(float valorcredito, int numerocuotas){
        return valorcredito/numerocuotas;
    } 
}
