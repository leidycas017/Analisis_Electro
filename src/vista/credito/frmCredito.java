/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
 */
package vista.credito;

import logica.controladores.ControllerCredito;
import logica.controladores.ControllerProducto;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Vcredito;
import vista.cliente.frmVistaCliente;
import vista.cliente.frmVistaClienteFiador;
import vista.compra.frmCompra;
import vista.fiador.frmFiador;
import vista.fiador.frmVistaFiador;
import vista.producto.frmVistaProducto;
import vista.ventas.frmVenta;
import vista.ventas.frmVistaVenta;


/**
 *
 * @author Usuario
 */
public class frmCredito extends javax.swing.JInternalFrame {
     private String accion ="Guardar";  
     private Vcredito dtscredito; 
     private ControllerCredito func;
    
     public frmCredito() throws SQLException {
        initComponents();
        func = new ControllerCredito();
        dtscredito = new Vcredito();
        inhabilitar();
        mostrar("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        txtvalorcredito = new javax.swing.JTextField();
        txtidcredito = new javax.swing.JTextField();
        txtidventa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtnumerocuotas = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtidfiador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtvalorcuotainicial = new javax.swing.JTextField();
        datefechacredito = new com.toedter.calendar.JDateChooser();
        cboestado = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Créditos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/credit.png"))); // NOI18N

        jLabel2.setText("ID Venta:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Créditos"));

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Credito", "ID Venta", "ID Cliente", "Id Fiador", "Fecha Credito", "Estado", "Número de Cuotas", "Valor del Crédito", "Couta Inicial"
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(btneliminar)
                    .addComponent(btnsalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtvalorcredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorcreditoActionPerformed(evt);
            }
        });

        txtidventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidventaActionPerformed(evt);
            }
        });

        jLabel12.setText("Valor Crédito:");

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Numero Cuotas:");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado");

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jLabel3.setText("ID Cliente:");

        jLabel1.setText("ID Crédito:");

        jLabel7.setText("Fecha Credito:");

        jButton7.setText("....");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("....");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel8.setText("ID Fiador");

        txtidfiador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidfiadorActionPerformed(evt);
            }
        });

        jLabel10.setText("Cuota Inicial:");

        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paz y salvo", "Atrasado" }));

        jButton9.setText("....");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(44, 44, 44)
                                        .addComponent(txtvalorcuotainicial))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(66, 66, 66)
                                        .addComponent(txtidfiador, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel12))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtvalorcredito)
                                            .addComponent(txtnumerocuotas)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel4))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cboestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(datefechacredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtidcredito, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidcliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(txtidventa, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnguardar)
                        .addGap(18, 18, 18)
                        .addComponent(btncancelar)
                        .addGap(18, 18, 18)))
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
                            .addComponent(txtidcredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtidventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtidfiador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(datefechacredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnumerocuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtvalorcredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtvalorcuotainicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnguardar)
                            .addComponent(btncancelar)
                            .addComponent(btnnuevo)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
          mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtvalorcreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorcreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorcreditoActionPerformed

    private void txtidventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidventaActionPerformed
    private void empaquetaDatos(){
        int sel;
        int d,m,a;
        Calendar cal;
       
        cal = datefechacredito.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        sel = cboestado.getSelectedIndex();
        dtscredito.setIdventa(Integer.parseInt(txtidventa.getText())); //importado
        dtscredito.setIdcliente(Integer.parseInt(txtidcliente.getText()));
        dtscredito.setIdfiador(Integer.parseInt(txtidfiador.getText())); //Importao
        dtscredito.setEstado(cboestado.getItemAt(sel));
        dtscredito.setNumerocuotas(Integer.parseInt(txtnumerocuotas.getText()));
        dtscredito.setValor_credito(Float.parseFloat(txtvalorcredito.getText()));
        dtscredito.setValor_couta_inicial(Float.parseFloat(txtvalorcuotainicial.getText()));
        dtscredito.setFechacredito(new Date(a,m,d));
    }
    
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        verificaEnfoque();
        empaquetaDatos();
        int ingreso = 0;
        if(!(func.existeCreditoController(ingreso))){
            if(accion.equals("guardar")){
                if(func.insertarCreditoController(dtscredito)){
                    JOptionPane.showConfirmDialog(rootPane, "Registro Crédito insertado con éxito"); 
                    mostrar("");  
                    inhabilitar();
                 }
            }else if(accion.equals("editar")){
                   dtscredito.setIdcredito(Integer.parseInt(txtidcredito.getText()));
                   if(func.editarCreditoController(dtscredito)){
                        JOptionPane.showConfirmDialog(rootPane, "Registro Crédito editado con éxito"); 
                        mostrar(""); 
                        inhabilitar();    
                   }
               }
        }
    }//GEN-LAST:event_btnguardarActionPerformed
    private void mostrar(String buscar){
        try{
            DefaultTableModel modelo;
            modelo =  func.mostrarCreditoController(buscar);
            tablalistado.setModel(modelo);
            ocultarColumna();
          }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Error al mostrar los registros en la tabla cliente");
        }
    }  
    private void ocultarColumna(){
       // tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        //tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        //tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);
    } 
     private void inhabilitar(){
        txtidcredito.setEnabled(false); 
        txtidventa.setEnabled(false);
        txtidcliente.setEnabled(false);
        txtidcliente.setEnabled(false);
        txtidfiador.setEnabled(false);
        datefechacredito.setEnabled(false);
        cboestado.setEnabled(false);
        txtnumerocuotas.setEnabled(false);
        txtvalorcredito.setEnabled(false);
        txtvalorcuotainicial.setText("");
        
        txtidcredito.setText(""); 
        txtidventa.setText("");
        txtidcliente.setText("");
        txtidcliente.setText("");
        txtidfiador.setText("");
        datefechacredito.setEnabled(false); //Como
        cboestado.setEnabled(false);       //Como
        txtnumerocuotas.setText("");
        txtvalorcredito.setText("");
        txtvalorcuotainicial.setText("");
        
    } 
    private void habilitar(){
        txtidcredito.setEnabled(false); 
        txtidventa.setEnabled(false);
        txtidcliente.setEnabled(false);
        txtidfiador.setEnabled(false);
        datefechacredito.setEnabled(true);
        cboestado.setEnabled(true);
        txtnumerocuotas.setEnabled(true);
        txtvalorcredito.setEnabled(false);
        txtvalorcuotainicial.setText("");
        txtidcredito.setText(""); 
        txtidventa.setText("");
        txtidcliente.setText("");
        txtidcliente.setText("");
        txtidfiador.setText("");
        datefechacredito.setEnabled(true); //Como
        cboestado.setEnabled(true);       //Como
        txtnumerocuotas.setText("");
        txtvalorcredito.setText("");
        txtvalorcuotainicial.setText("");
        
    }
    private void verificaEnfoque(){
        if(datefechacredito.getCalendar().getTime().toString()==""){
            JOptionPane.showConfirmDialog(null,"Debes ingresar una fecha");
            datefechacredito.requestFocus();
            return;
        }
        
        if(cboestado.getSelectedItem().toString().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un estado");
            cboestado.requestFocus();
            return;
        }
        if(txtnumerocuotas.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el número de cuotas");
            txtnumerocuotas.requestFocus();
            return;
        }
        if((txtvalorcredito.getText().length()==0)){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el valor del crédito");
            txtvalorcredito.requestFocus();
            return;
        }
        if((txtvalorcuotainicial.getText().length()==0)){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el valor de la couta inicial");
            txtvalorcredito.requestFocus();
            return;
        }
    }
    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         frmVistaVenta vista = null;
          try { 
              vista = new frmVistaVenta();
          } catch (SQLException ex) {
              Logger.getLogger(frmCredito.class.getName()).log(Level.SEVERE, null, ex);
          }
        vista.toFront();
        vista.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        frmVistaClienteFiador vista = null;
          try { 
              vista = new frmVistaClienteFiador();
          } catch (SQLException ex) {
              Logger.getLogger(frmCredito.class.getName()).log(Level.SEVERE, null, ex);
          }
        vista.toFront();
        vista.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txtidfiadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidfiadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidfiadorActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
           frmVistaFiador vista = null;
          try { 
              vista = new frmVistaFiador();
          } catch (SQLException ex) {
              Logger.getLogger(frmCredito.class.getName()).log(Level.SEVERE, null, ex);
          }
        vista.toFront();
        vista.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        btnguardar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion="editar";
        int fila=tablalistado.rowAtPoint(evt.getPoint());
        txtidcredito.setText(tablalistado.getValueAt(fila, 0).toString()); //No se muestra la columna
        txtidventa.setText(tablalistado.getValueAt(fila, 1).toString()); //No se muestra la columna
        txtidcliente.setText(tablalistado.getValueAt(fila, 2).toString()); //No se muestra la columna
        txtidfiador.setText(tablalistado.getValueAt(fila, 3).toString()); //No se muestra la columna
        datefechacredito.setDate(Date.valueOf(tablalistado.getValueAt(fila, 4).toString()));
        cboestado.setSelectedItem(tablalistado.getValueAt(fila, 5));
        txtnumerocuotas.setText(tablalistado.getValueAt(fila, 6).toString());
        txtvalorcredito.setText(tablalistado.getValueAt(fila, 7).toString());
        txtvalorcuotainicial.setText(tablalistado.getValueAt(fila, 8).toString());
       
    }//GEN-LAST:event_tablalistadoMouseClicked
    
    
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
           try {
            callEliminar("Estas seguro de que quiere eliminar el registro de crédito?");
        } catch (SQLException ex) {
            Logger.getLogger(frmCredito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed
     private void callEliminar(String mensage) throws SQLException{
        if(!(txtidcredito.getText().toString()=="")){
            int confir = JOptionPane.showConfirmDialog(null, mensage);
            if(confir==0){
                dtscredito.setIdcredito(Integer.parseInt(txtidcredito.getText()));
                boolean flag = func.eliminarCreditoController(dtscredito);
                mostrar("");
                if(flag==true){
                    JOptionPane.showConfirmDialog(rootPane, "Registro del credito eliminado con éxito");
                }
                   inhabilitar();
            }
        }
    } 
    
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
            java.util.logging.Logger.getLogger(frmCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmCredito().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frmCredito.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cboestado;
    private com.toedter.calendar.JDateChooser datefechacredito;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    public static javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtidcredito;
    public static javax.swing.JTextField txtidfiador;
    public static javax.swing.JTextField txtidventa;
    private javax.swing.JTextField txtnumerocuotas;
    public static javax.swing.JTextField txtvalorcredito;
    private javax.swing.JTextField txtvalorcuotainicial;
    // End of variables declaration//GEN-END:variables
}
