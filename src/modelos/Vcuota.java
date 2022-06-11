/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
*/
package modelos;

import java.sql.Date;

public class Vcuota {
     private int numerocuota;
     private int idcredito;
     private float valorcuota;
     private Date fecha_pago_cuota;
     private Date fecha_pagado_cuota;

    public Vcuota() {
    }

    public int getNumerocuota() {
        return numerocuota;
    }

    public void setNumerocuota(int numerocuota) {
        this.numerocuota = numerocuota;
    }

    public int getIdcredito() {
        return idcredito;
    }

    public void setIdcredito(int idcredito) {
        this.idcredito = idcredito;
    }

    public float getValorcuota() {
        return valorcuota;
    }

    public void setValorcuota(float valorcuota) {
        this.valorcuota = valorcuota;
    }

    public Date getFecha_pago_cuota() {
        return fecha_pago_cuota;
    }

    public void setFecha_pago_cuota(Date fecha_pago_cuota) {
        this.fecha_pago_cuota = fecha_pago_cuota;
    }

    public Date getFecha_pagado_cuota() {
        return fecha_pagado_cuota;
    }

    public void setFecha_pagado_cuota(Date fecha_pagado_cuota) {
        this.fecha_pagado_cuota = fecha_pagado_cuota;
    }

    
}
