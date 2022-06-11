/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
 */
package vista.credito;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.controladores.ControllerCuota;
import modelos.Vcuota;

public class frmCuota extends javax.swing.JInternalFrame {
    public static int numerocuotas;
    private String accion ="Guardar";  
    private ControllerCuota func;
    private Vcuota dts;
    public static String valorcredito;
  
    public frmCuota() throws SQLException {
        initComponents();
        dts = new Vcuota();
        func = new ControllerCuota();
        inhabilitar();
        mostrar("");
         
    }
    //Es una prueba
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datefechaventa = new com.toedter.calendar.JDateChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtnumerocuota = new javax.swing.JTextField();
        txtidcredito = new javax.swing.JTextField();
        txtvalorcuota = new javax.swing.JTextField();
        btnbuscaridcredito = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        datefecha_pagos_cuota = new com.toedter.calendar.JDateChooser();
        datefecha_pagado_cuota = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);

        jLabel3.setText("Fecha A Pagar:");

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Del Pago:");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jLabel12.setText("Valor Cuota::");

        txtnumerocuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumerocuotaActionPerformed(evt);
            }
        });

        txtidcredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcreditoActionPerformed(evt);
            }
        });

        txtvalorcuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorcuotaActionPerformed(evt);
            }
        });

        btnbuscaridcredito.setText("....");
        btnbuscaridcredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaridcreditoActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero Cuota:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista cuotas"));

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero Cuota", "ID Crédito", "Valor Cuota", "Fecha A Pagar Cuota", "Fecha Pago Cuota"
            }
        ));
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablalistado);

        jLabel9.setText("Buscar:");

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnsalir.setText("Exit");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(btnsalir)
                    .addComponent(btneliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setText("ID Credito:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnumerocuota, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtidcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscaridcredito, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(datefecha_pagado_cuota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(datefecha_pagos_cuota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtvalorcuota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnguardar)
                        .addGap(18, 18, 18)
                        .addComponent(btncancelar)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnumerocuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtidcredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscaridcredito))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtvalorcuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(datefecha_pagos_cuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(datefecha_pagado_cuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnuevo)
                            .addComponent(btnguardar)
                            .addComponent(btncancelar)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";
         
    }//GEN-LAST:event_btnnuevoActionPerformed
    
    private void mostrar(String buscar){
        try{
            DefaultTableModel modelo;
            modelo =  func.mostrarCuotaController(buscar);
            tablalistado.setModel(modelo);
        }
        catch(Exception e){
            System.out.println("Error al mostrar las uotas "+ e);
       }
    }  
    
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        verificaEnfoque();
        empaquetaDatos();
        if(!(func.existeCuotaController(dts.getNumerocuota()))){
             if(accion.equals("guardar")){
                 if(func.insertarCuotaController(dts)){
                    JOptionPane.showConfirmDialog(rootPane, "Registro trabajador almacenado con éxito");
                    mostrar("");  
                    inhabilitar();
                 }
            }else if(accion.equals("editar")){
                      dts.setNumerocuota(Integer.parseInt(txtnumerocuota.getText()));
                      func.editarCuotaController(dts);
                      mostrar(""); 
                      inhabilitar();
               }
        }
    }//GEN-LAST:event_btnguardarActionPerformed
   private void empaquetaDatos(){
        int d,m,a;
        Calendar cal;
             
        cal = datefecha_pagos_cuota.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFecha_pago_cuota(new Date(a,m,d));
        
        cal = datefecha_pagado_cuota.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFecha_pagado_cuota(new Date(a,m,d)); 
        
        dts.setIdcredito(Integer.parseInt(txtidcredito.getText()));
        dts.setNumerocuota(Integer.parseInt(txtnumerocuota.getText()));
        dts.setValorcuota(Float.parseFloat(txtvalorcuota.getText()));
        
    }
    private void habilitar(){
        Date date = new Date(1,1,1);
        txtnumerocuota.setEnabled(true);
        txtvalorcuota.setEnabled(false);
        txtidcredito.setEnabled(false);
        txtnumerocuota.setEnabled(true);
        datefecha_pagos_cuota.setEnabled(true);
        datefecha_pagado_cuota.setEnabled(false);
        
        btnguardar.setEnabled(true);
        btnnuevo.setEnabled(true);
        btnsalir.setEnabled(true);
        btncancelar.setEnabled(true);
        txtnumerocuota.setText("");
        txtidcredito.setText("");
        txtnumerocuota.setText("");
        datefecha_pagado_cuota.setDate(date);
    }
     private void inhabilitar(){
      //  Date date = new Date(0,0,0);
        txtnumerocuota.setEnabled(false);
        txtvalorcuota.setEnabled(false);
        txtidcredito.setEnabled(false);
        txtnumerocuota.setEnabled(false);
        datefecha_pagos_cuota.setEnabled(false);
        datefecha_pagado_cuota.setEnabled(false);
        
        btnguardar.setEnabled(false);
        btnnuevo.setEnabled(true);
        txtnumerocuota.setText("");
        txtidcredito.setText("");
        txtnumerocuota.setText("");
       // datefecha_pagado_cuota.setDate(date);
    } 
    private void verificaEnfoque(){
        if(txtnumerocuota.getText().length()==0){
            JOptionPane.showConfirmDialog(null,"Debes ingresar el número de cuotas");
            txtnumerocuota.requestFocus();
            return;
        }
        
        if(txtvalorcuota.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el valor de la cuota");
            txtvalorcuota.requestFocus();
            return;
        }
        if(datefecha_pagos_cuota.getCalendar().get(Calendar.DATE) ==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar fecha a pagar");
            datefecha_pagos_cuota.requestFocus();
            return;
        }
        if(datefecha_pagado_cuota.getCalendar().get(Calendar.DATE) ==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar del pago");
            datefecha_pagado_cuota.requestFocus();
            return;
        }
              
    }
    
   
    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtnumerocuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumerocuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumerocuotaActionPerformed

    private void txtidcreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcreditoActionPerformed

    private void txtvalorcuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorcuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorcuotaActionPerformed

    private void btnbuscaridcreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaridcreditoActionPerformed
        frmVistaCredito vista = null;
        try {
            vista = new frmVistaCredito();
        } catch (SQLException ex) {
            Logger.getLogger(frmCuota.class.getName()).log(Level.SEVERE, null, ex);
        }
        vista.toFront();
        vista.setVisible(true);
    }//GEN-LAST:event_btnbuscaridcreditoActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        btnguardar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion="editar";
        int fila=tablalistado.rowAtPoint(evt.getPoint());
        datefecha_pagado_cuota.setEnabled(true);
        txtnumerocuota.setText(tablalistado.getValueAt(fila, 0).toString());
        txtidcredito.setText(tablalistado.getValueAt(fila, 1).toString()); //No se muestra la columna
        txtvalorcuota.setText(tablalistado.getValueAt(fila, 2).toString());
        datefecha_pagos_cuota.setDate(Date.valueOf(tablalistado.getValueAt(fila, 3).toString()));
        datefecha_pagado_cuota.setDate(Date.valueOf(tablalistado.getValueAt(fila, 4).toString()));
   
    }//GEN-LAST:event_tablalistadoMouseClicked
    
    
    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
          callEliminar("Estas seguro de que quiere eliminar el registro trabajador?");
        } catch (SQLException ex) {
            Logger.getLogger(frmCuota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneliminarActionPerformed
    
     
    private void callEliminar(String mensage) throws SQLException{
        if(!(txtnumerocuota.getText().toString()=="")){
            int confir = JOptionPane.showConfirmDialog(null, mensage);
            if(confir==0){
                dts.setNumerocuota(Integer.parseInt(txtnumerocuota.getText()));  //Se crea la instancia para mandar el idtrabajador a eliminar
                boolean flag = func.eliminarCuotaController(dts);
                mostrar("");
                if(flag==true){
                    JOptionPane.showConfirmDialog(rootPane, "Registro del producto con éxito");
                }
                   inhabilitar();
            }
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    public static javax.swing.JButton btnbuscaridcredito;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private com.toedter.calendar.JDateChooser datefecha_pagado_cuota;
    private com.toedter.calendar.JDateChooser datefecha_pagos_cuota;
    private com.toedter.calendar.JDateChooser datefechaventa;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    public static javax.swing.JTextField txtidcredito;
    private javax.swing.JTextField txtnumerocuota;
    public static javax.swing.JTextField txtvalorcuota;
    // End of variables declaration//GEN-END:variables
}
