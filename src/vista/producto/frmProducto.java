/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
 */
package vista.producto;
import logica.controladores.ControllerProducto;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Vproducto;
import vista.proveedor.frmVistaProveedor;
import vista.proveedor.frmVistaProveedor;

public class frmProducto extends javax.swing.JInternalFrame {
      private String accion ="Guardar";  
      private Vproducto dts; 
      private ControllerProducto func;
   
    public frmProducto() throws SQLException {
        dts = new Vproducto();
        func = new ControllerProducto();
        initComponents();
        inhabilitar();
        mostrar("");
    }
    private void mostrar(String buscar){
        try{
            DefaultTableModel modelo;
            modelo =  func.mostrarProductoController(buscar);
            tablalistado.setModel(modelo);
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Error al mostrar los registros en la tabla cliente");
        }
    } 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtean = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txtidproducto = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        btnbuscaproveedor = new javax.swing.JButton();
        datefecha_ingreso = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtvalorventa = new javax.swing.JTextField();
        txtidproveedor = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Productos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/product.png"))); // NOI18N

        jLabel1.setText("ID Producto:");

        jLabel2.setText("Ean:");

        jLabel3.setText("Descripción:");

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Ingreso:");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel5.setText("ID proveedor:");

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jLabel12.setText("Cantidad:");

        txtean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteanActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lsta productos"));

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "EAN", "ID Proveedor", "Cantidad", "Descripcion", "Fecha Ingreso", "Valor Venta"
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

        txtidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproductoActionPerformed(evt);
            }
        });

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });

        btnbuscaproveedor.setText("....");
        btnbuscaproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaproveedorActionPerformed(evt);
            }
        });

        jLabel6.setText("Valor de Venta");

        txtidproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproveedorActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdescripcion)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtvalorventa, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(datefecha_ingreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                    .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtean, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnbuscaproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 16, Short.MAX_VALUE))))
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
                            .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(btnbuscaproveedor)
                            .addComponent(txtidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(datefecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtvalorventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnuevo)
                            .addComponent(btnguardar)
                            .addComponent(btncancelar)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void inhabilitar(){
        Date date = new Date(0,0,0);
        txtidproducto.setEnabled(false);
        datefecha_ingreso.setEnabled(false);
        txtean.setEnabled(false);
        txtidproveedor.setEnabled(false);
        txtcantidad.setEnabled(false);
        txtdescripcion.setEnabled(false);
        txtvalorventa.setEnabled(false);
        btnnuevo.setEnabled(true);
        btnguardar.setEnabled(false);
        btnsalir.setEnabled(true);
        btncancelar.setEnabled(true);
        txtidproducto.setText("");
        txtidproveedor.setText("");
        txtean.setText("");
        txtcantidad.setText("");
        txtdescripcion.setText("");
        txtvalorventa.setText("");
        datefecha_ingreso.setDate(date);
    } 
    
    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnnuevoActionPerformed
    private void habilitar(){
        Calendar c = Calendar.getInstance();
           
        int dia = c.get(Calendar.DATE);
        int mes = c.get(Calendar.DATE);
        int ano = c.get(Calendar.DATE);
        Date date = new Date(dia,mes,ano);
       
        txtidproducto.setEnabled(false);
        datefecha_ingreso.setEnabled(true);
        txtean.setEnabled(true);
        txtidproveedor.setEnabled(false);
        txtcantidad.setEnabled(true);
        txtdescripcion.setEnabled(true);
        datefecha_ingreso.setEnabled(true);
        txtvalorventa.setEnabled(true);
        btnguardar.setEnabled(true);
        btnnuevo.setEnabled(true);
        btnsalir.setEnabled(true);
        btncancelar.setEnabled(true);
        txtidproducto.setText("");
        txtidproveedor.setText("");
        txtean.setText("");
        txtcantidad.setText("");
        txtdescripcion.setText("");
        txtvalorventa.setText("");
        datefecha_ingreso.setDate(date);
    }
    private void verificaEnfoque(){
        if(txtean.getText().length()==0){
            JOptionPane.showConfirmDialog(null,"Debes ingresar el EAN");
            txtean.requestFocus();
            return;
        }
        
        if(txtcantidad.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una cantidad");
            txtdescripcion.requestFocus();
            return;
        }
        if(datefecha_ingreso.getCalendar().get(Calendar.DATE) ==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una fecha de registro");
            datefecha_ingreso.requestFocus();
            return;
        }
        if(txtcantidad.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una descripcion");
            txtdescripcion.requestFocus();
            return;
        }
        if(txtvalorventa.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el valor de venta");
            txtvalorventa.requestFocus();
            return;
        }
        
    }
    
     
    private void callEliminar(String mensage) throws SQLException{
        if(!(txtidproducto.getText().toString()=="")){
            int confir = JOptionPane.showConfirmDialog(null, mensage);
            if(confir==0){
                dts.setIdProducto(Integer.parseInt(txtidproducto.getText()));  //Se crea la instancia para mandar el idtrabajador a eliminar
                boolean flag = func.eliminarProductoController(dts);
                mostrar("");
                if(flag==true){
                    JOptionPane.showConfirmDialog(rootPane, "Registro del producto con éxito");
                }
                   inhabilitar();
            }
        }
    } 
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        verificaEnfoque();
         int d,m,a;
        Calendar cal;
             
        cal = datefecha_ingreso.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFecha_ingreso_producto(new Date(a,m,d));
        dts.setEan(txtean.getText());
        dts.setCantidad(Integer.parseInt(txtcantidad.getText()));
        dts.setDescripcion_producto(txtdescripcion.getText());
        dts.setValor_venta(Float.parseFloat(txtvalorventa.getText()));
        dts.setIdproveedor(Integer.parseInt(txtidproveedor.getText()));
              
        if(accion.equals("guardar")){
           if(func.insertarProductoController(dts)){
                JOptionPane.showConfirmDialog(rootPane, "Registro proveedor almacenado con éxito");
                mostrar("");  //muestra el modelo de la tabla
                inhabilitar();
            }
        }else if(accion.equals("editar")){
                dts.setIdProducto(Integer.parseInt(txtidproducto.getText()));
                func.editarProductoController(dts);
                mostrar("");  //muestra el modelo de la tabla
                inhabilitar();
         
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txteanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteanActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
          mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproductoActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtidproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproveedorActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            callEliminar("Estas seguro de que quiere eliminar el registro trabajador?");
        } catch (SQLException ex) {
            Logger.getLogger(frmProducto.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscaproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaproveedorActionPerformed
        frmVistaProveedor vista = new frmVistaProveedor();
        vista.toFront();
        vista.setVisible(true);
    }//GEN-LAST:event_btnbuscaproveedorActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        btnguardar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion="editar";
        int fila=tablalistado.rowAtPoint(evt.getPoint());
        txtidproducto.setText(tablalistado.getValueAt(fila, 0).toString());
        txtean.setText(tablalistado.getValueAt(fila, 1).toString()); //No se muestra la columna
        txtidproveedor.setText(tablalistado.getValueAt(fila, 2).toString());
        txtcantidad.setText(tablalistado.getValueAt(fila, 3).toString());
        txtdescripcion.setText(tablalistado.getValueAt(fila, 4).toString());
        datefecha_ingreso.setDate(Date.valueOf(tablalistado.getValueAt(fila, 5).toString()));
        txtvalorventa.setText(tablalistado.getValueAt(fila, 6).toString());
    }//GEN-LAST:event_tablalistadoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmProducto().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frmProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscaproveedor;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private com.toedter.calendar.JDateChooser datefecha_ingreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtean;
    private javax.swing.JTextField txtidproducto;
    public static javax.swing.JTextField txtidproveedor;
    private javax.swing.JTextField txtvalorventa;
    // End of variables declaration//GEN-END:variables
}
