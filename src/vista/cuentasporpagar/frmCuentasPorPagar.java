/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
 */
package vista.cuentasporpagar;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.controladores.ControllerCuentasPorPagar;
import modelos.Vcuentasporpagar;
import vista.compra.frmVistaCompra;
import vista.empleado.frmVistaEmpleado;


public class frmCuentasPorPagar extends javax.swing.JInternalFrame {
      private String accion ="Guardar";  
      private Vcuentasporpagar dts;
      private ControllerCuentasPorPagar func;
     
      private void mostrar(String buscar){
        try{
            DefaultTableModel modelo;
            modelo =  func.mostrarCuentasPorPagarController(buscar);
           
            tablalistado.setModel(modelo);
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Error al mostrar los registros en la tabla cliente");
        }
    } 
    
    public frmCuentasPorPagar() throws SQLException {
        initComponents();
        dts = new Vcuentasporpagar();
        func = new ControllerCuentasPorPagar();
        inhabilitar();
        mostrar("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try {
            frmProducto1 = new vista.producto.frmProducto();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        btnguardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtidcuentasporpagar = new javax.swing.JTextField();
        txtidcompra = new javax.swing.JTextField();
        txtvalor = new javax.swing.JTextField();
        btnbuscacompra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        datefechamaxima = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        datefechapago = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox<>();

        frmProducto1.setVisible(true);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cuentas por pagar");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha Pago:");

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jLabel12.setText("Feecha Máxima");

        txtidcuentasporpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcuentasporpagarActionPerformed(evt);
            }
        });

        txtidcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcompraActionPerformed(evt);
            }
        });

        btnbuscacompra.setText("....");
        btnbuscacompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscacompraActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Cuentas Por Pagar:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Cuentas"));

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Cuentas A Pagar", "ID Compra", "Fecha Pago", "Fecha Máxima", "Valor", "Estado"
            }
        ));
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablalistado);

        jLabel9.setText("Buscar");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel2.setText("Id Compra");

        jLabel3.setText("Valor:");

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado:");

        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagada", "Pendiente" }));
        cboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnguardar)
                        .addGap(18, 18, 18)
                        .addComponent(btncancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidcuentasporpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(datefechapago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtidcompra, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnbuscacompra, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cboestado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(datefechamaxima, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtidcuentasporpagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtidcompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscacompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(datefechapago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(datefechamaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtvalor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnuevo)
                            .addComponent(btnguardar)
                            .addComponent(btncancelar))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void habilitar(){
        txtidcuentasporpagar.setEnabled(false);
        txtidcompra.setEnabled(false);
        datefechamaxima.setEnabled(true);
        datefechapago.setEnabled(true);
        txtvalor.setEnabled(false);
        btnnuevo.setEnabled(true);
        btnguardar.setEnabled(true);
        btnsalir.setEnabled(true);
        btncancelar.setEnabled(true);
        txtidcuentasporpagar.setText("");
        txtidcompra.setText("");
        txtvalor.setText("");
        int d,m,a;
        Calendar cal;
    
    } 
    private void inhabilitar(){
        txtidcuentasporpagar.setEnabled(false);
        txtidcompra.setEnabled(false);
        datefechamaxima.setEnabled(false);
        datefechapago.setEnabled(false);
        txtvalor.setEnabled(false);
        btnnuevo.setEnabled(true);
        btnguardar.setEnabled(false);
        btnsalir.setEnabled(false);
        btncancelar.setEnabled(false);
        txtidcuentasporpagar.setText("");
        txtidcompra.setText("");
    } 
    private void verificaEnfoque(){
               
        if(txtidcompra.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un id compra");
            txtidcompra.requestFocus();
            return;
        }
        if(datefechapago.getCalendar().get(Calendar.DATE) ==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una fecha de pago");
            datefechapago.requestFocus();
            return;
        }
        if(datefechamaxima.getCalendar().get(Calendar.DATE) ==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una fecha maxima de pago");
            datefechamaxima.requestFocus();
            return;
        }
        if(txtvalor.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el valor de la compra");
            txtvalor.requestFocus();
            return;
        }
    }
    
   
    
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        verificaEnfoque();
        empaquetaDatos();
        
        empaquetaDatos(); 
        if(accion.equals("guardar")){
            if(func.insertarCuentasPorPagarController(dts)){
                JOptionPane.showConfirmDialog(rootPane, "Registro proveedor almacenado con éxito");
                mostrar("");  //muestra el modelo de la tabla
                inhabilitar();
            }
        }else if(accion.equals("editar")){
            dts.setIdcuentasporpagar(Integer.parseInt(txtidcuentasporpagar.getText()));
            func.editarCuentasPorPagarController(dts);
            mostrar("");  //muestra el modelo de la tabla
            inhabilitar();

        }
    }//GEN-LAST:event_btnguardarActionPerformed
    private void empaquetaDatos(){
        int sel; 
        int d,m,a;
        Calendar cal;
        cal = datefechapago.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFecha_pago(new Date(a,m,d));
        sel = cboestado.getSelectedIndex();
        
        cal = datefechamaxima.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFecha_maxima(new Date(a,m,d));
        dts.setIdcompra(Integer.parseInt(txtidcompra.getText()));
        dts.setValor(Float.parseFloat(txtvalor.getText()));
        dts.setEstado(cboestado.getItemAt(sel));
    }
    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtidcuentasporpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcuentasporpagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcuentasporpagarActionPerformed

    private void txtidcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcompraActionPerformed

    private void btnbuscacompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscacompraActionPerformed
        frmVistaCompra vista=null;
          try {
              vista = new frmVistaCompra();
          } catch (SQLException ex) {
              Logger.getLogger(frmCuentasPorPagar.class.getName()).log(Level.SEVERE, null, ex);
          }
        vista.toFront();
        vista.setVisible(true);
    }//GEN-LAST:event_btnbuscacompraActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        btnguardar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion="editar";
        int fila=tablalistado.rowAtPoint(evt.getPoint());
        txtidcuentasporpagar.setText(tablalistado.getValueAt(fila, 0).toString());
        txtidcompra.setText(tablalistado.getValueAt(fila, 1).toString()); //No se muestra la columna
        datefechapago.setDate(Date.valueOf(tablalistado.getValueAt(fila, 2).toString()));
        datefechamaxima.setDate(Date.valueOf(tablalistado.getValueAt(fila, 3).toString()));
        txtvalor.setText(tablalistado.getValueAt(fila, 4).toString());
    
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
            Logger.getLogger(frmCuentasPorPagar.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed
    
    private void callEliminar(String mensage) throws SQLException{
        if(!(txtidcuentasporpagar.getText().toString()=="")){
            int confir = JOptionPane.showConfirmDialog(null, mensage);
            if(confir==0){
                dts.setIdcuentasporpagar(Integer.parseInt(txtidcuentasporpagar.getText()));  //Se crea la instancia para mandar el idtrabajador a eliminar
                boolean flag = func.eliminarCuentasPorPagarController(dts);
                mostrar("");
                if(flag==true){
                    JOptionPane.showConfirmDialog(rootPane, "Registro del trabajador eliminado con éxito");
                }
                   inhabilitar();
            }
        }
    }
    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void cboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboestadoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscacompra;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cboestado;
    private com.toedter.calendar.JDateChooser datefechamaxima;
    private com.toedter.calendar.JDateChooser datefechapago;
    private vista.producto.frmProducto frmProducto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    public static javax.swing.JTextField txtidcompra;
    private javax.swing.JTextField txtidcuentasporpagar;
    public static javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
