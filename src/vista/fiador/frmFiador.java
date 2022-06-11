/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
 */
package vista.fiador;

import logica.controladores.ControllerFiador;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.accesodatos.FiadorDao;
import modelos.Vfiador;

public class frmFiador extends javax.swing.JInternalFrame {
     private Vfiador dts; 
     private ControllerFiador func;
     private String accion ="Guardar";  
   
    public frmFiador() throws SQLException {
        dts = new Vfiador();
        func = new ControllerFiador();
        initComponents();
        inhabilitar();
        mostrar("");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnombre = new javax.swing.JTextField();
        txtingreso_mensual = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnum_documento = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtidpersona = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtdireccion_laboral = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        datefecha_registro = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lbltotal_registros = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        cboestado = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Fiador");

        txtingreso_mensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtingreso_mensualActionPerformed(evt);
            }
        });

        jLabel8.setText("Correo:");

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        jLabel1.setText("Id  Fiador:");

        txtdireccion_laboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccion_laboralActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha Ingreso:");

        jLabel7.setText("Dirección:");

        jLabel3.setText("Nombres:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Clientes"));

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha Ingreso", "Nombres", "Numero documento", "Dirección", "Correo", "Teléfono", "Ingresos Mensuales", "Direccion Laboral", "Estado"
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

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbltotal_registros))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnbuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnsalir)
                        .addGap(0, 280, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(btneliminar)
                    .addComponent(btnsalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotal_registros)
                .addGap(22, 22, 22))
        );

        jLabel14.setText("Ingresos Mensuales:");

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jLabel15.setText("Estado:");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel16.setText("Direccion Laboral");

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Numero Documento:");

        jLabel17.setText("Numero Teléfono:");

        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceptado", "Rechazado" }));

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
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txtnombre)
                            .addComponent(txtcorreo)
                            .addComponent(txtnum_documento)
                            .addComponent(datefecha_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtidpersona)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnnuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btnguardar)
                                .addGap(22, 22, 22)
                                .addComponent(btncancelar))
                            .addComponent(txtingreso_mensual, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdireccion_laboral, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(datefecha_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtnum_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtingreso_mensual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdireccion_laboral))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncancelar)
                            .addComponent(btnguardar)
                            .addComponent(btnnuevo))))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtingreso_mensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtingreso_mensualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtingreso_mensualActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtdireccion_laboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccion_laboralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccion_laboralActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        btnguardar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion="editar";
        int fila=tablalistado.rowAtPoint(evt.getPoint());
        txtidpersona.setText(tablalistado.getValueAt(fila, 0).toString()); //No se muestra la columna
        datefecha_registro.setDate(Date.valueOf(tablalistado.getValueAt(fila, 1).toString()));
        txtnombre.setText(tablalistado.getValueAt(fila, 2).toString());
        txtnum_documento.setText(tablalistado.getValueAt(fila, 3).toString());
        txtdireccion.setText(tablalistado.getValueAt(fila, 4).toString());
        txtcorreo.setText(tablalistado.getValueAt(fila, 5).toString());
        txttelefono.setText(tablalistado.getValueAt(fila, 6).toString());
        txtingreso_mensual.setText(tablalistado.getValueAt(fila, 7).toString());
        cboestado.setSelectedItem(tablalistado.getValueAt(fila, 8));
        txtdireccion_laboral.setText(tablalistado.getValueAt(fila, 9).toString());

        
        
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            callEliminar("Estas seguro de que quiere eliminar el registro fiador?");
        } catch (SQLException ex) {
            Logger.getLogger(frmFiador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        verificaEnfoque();
        empaquetaDatos();
        if(!(func.existePersonaController(dts.getNum_documento()))){
            if(accion.equals("guardar")){
                if(func.insertarFiadorController(dts)){
                     JOptionPane.showConfirmDialog(rootPane, "Registro trabajador almacenado con éxito");
                     mostrar("");  //muestra el modelo de la tabla
                     inhabilitar();
                }
           }else if(accion.equals("editar")){
                      dts.setIdpersona(Integer.parseInt(txtidpersona.getText()));
                      func.editarFiadorController(dts);
                      mostrar("");  //muestra el modelo de la tabla
                     inhabilitar();
                }
        }
    }//GEN-LAST:event_btnguardarActionPerformed
    private void empaquetaDatos(){
        int sel;
        int d,m,a;
        Calendar cal;

        cal = datefecha_registro.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFecha_registro(new Date(a,m,d));

        //dts.setIdpersona(Integer.parseInt(txtidpersona.getText()));
        dts.setNombres(txtnombre.getText());
        dts.setNum_documento(txtnum_documento.getText());
        dts.setDireccion(txtdireccion.getText());
        dts.setEmail(txtcorreo.getText());
        dts.setTelefono(txttelefono.getText());
        
        sel = cboestado.getSelectedIndex();
        dts.setEstado(cboestado.getItemAt(sel));
        dts.setIngreso_mensual(Float.parseFloat(txtingreso_mensual.getText()));
        dts.setDireccion_laboral(txtdireccion_laboral.getText());
    }
    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed
    private void inhabilitar(){
        txtidpersona.setEnabled(false);
        datefecha_registro.setEnabled(false);
        txtidpersona.setEnabled(false);
        txtnombre.setEnabled(false);
        txtnum_documento.setEnabled(false);
        txtdireccion.setEnabled(false);
        txttelefono.setEnabled(false);
        txtcorreo.setEnabled(false);
        txtingreso_mensual.setEnabled(false);
        btnguardar.setEnabled(false);
        btneliminar.setEnabled(false);
        btncancelar.setEnabled(false);
        txtdireccion_laboral.setEnabled(false);
        txtidpersona.setText("");
        txtnombre.setText("");
        txtnum_documento.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtcorreo.setText("");
        txtdireccion_laboral.setText("");
        txtingreso_mensual.setText("");
        
    } 
    public void habilitar(){
        datefecha_registro.setEnabled(true);
        txtidpersona.setEnabled(false);
        txtnombre.setEnabled(true);
        txtnum_documento.setEnabled(true);
        txtdireccion.setEnabled(true);
        txttelefono.setEnabled(true);
        txtcorreo.setEnabled(true);
        txtingreso_mensual.setEnabled(true);
        btnguardar.setEnabled(true);
        btneliminar.setEnabled(true);
        btncancelar.setEnabled(true);
        txtdireccion_laboral.setEnabled(true);
        txtidpersona.setText("");
        txtnombre.setText("");
        txtnum_documento.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtcorreo.setText("");
        txtdireccion_laboral.setText("");
        txtingreso_mensual.setText("");
    }
    private void ocultarColumna(){
       // tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
      //  tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
       // tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    private void mostrar(String buscar){
        try{
            DefaultTableModel modelo;
            modelo =  func.mostrarFiadorController(buscar);
            tablalistado.setModel(modelo);
            ocultarColumna();
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Error al mostrar los registros en la tabla mostrar");
        }
    } 
    
    private void verificaEnfoque(){
        if(txtnombre.getText().length()==0){
            JOptionPane.showConfirmDialog(null,"Debes ingresar el nombre del fiador ");
            txtnombre.requestFocus();
            return;
        }
        
        if(txtnum_documento.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el número del documento");
            txtnum_documento.requestFocus();
            return;
        }
        if(txtdireccion.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una direccion");
            txtdireccion.requestFocus();
            return;
        }
        if(txttelefono.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un número telefónico");
            txttelefono.requestFocus();
            return;
        }
        if(txtcorreo.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un correo");
            txtcorreo.requestFocus();
            return;
        }
        if(txtingreso_mensual.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un ingreso mensual");
            txtingreso_mensual.requestFocus();
            return;
        }
        if(txtdireccion_laboral.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar la dirección laboral");
            txtdireccion_laboral.requestFocus();
            return;
        }
        
    }   
    
    private void callEliminar(String mensage) throws SQLException{
       if(!(txtidpersona.getText().toString()=="")){
            int confir = JOptionPane.showConfirmDialog(null, mensage);
            if(confir==0){
                Vfiador dts = new Vfiador();
                dts.setIdpersona(Integer.parseInt(txtidpersona.getText()));  //Se crea la instancia para mandar el idtrabajador a eliminar
                boolean flag = func.eliminarFiadorController(dts);
                mostrar("");
                if(flag==true){
                    JOptionPane.showConfirmDialog(rootPane, "Registro del trabajador eliminado con éxito");
                }
                   inhabilitar();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cboestado;
    private com.toedter.calendar.JDateChooser datefecha_registro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltotal_registros;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdireccion_laboral;
    private javax.swing.JTextField txtidpersona;
    private javax.swing.JTextField txtingreso_mensual;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnum_documento;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
