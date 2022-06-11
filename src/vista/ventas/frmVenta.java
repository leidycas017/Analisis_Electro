/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
 */
package vista.ventas;

import logica.controladores.ControllerCompra;
import logica.controladores.ControllerProducto;
import logica.controladores.ControllerVenta;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Vdetalleventa;
import modelos.Vproducto;
import modelos.Vventa;
import operaciongeneral.CalculosVenta;
import vista.cliente.frmVistaCliente;
import vista.compra.frmCompra;
import vista.empleado.frmVistaEmpleado;
import vista.producto.frmVistaProducto;

public class frmVenta extends javax.swing.JInternalFrame {
     private String accion ="Guardar";  
     private Vventa dtsventa; 
     public static Vproducto dtsproducto;
     private Vdetalleventa dtsventad;
     private ControllerVenta func;
     private ControllerProducto funcpro;
     private CalculosVenta total;
    
    public frmVenta() throws SQLException {
        initComponents();
        dtsventa = new Vventa();
        dtsventad = new Vdetalleventa();
        dtsproducto = new Vproducto();
        func = new ControllerVenta();
        funcpro = new ControllerProducto();
        total = new CalculosVenta();
        inhabilitar();
        mostrar("");
    }
    private void mostrar(String buscar){
        try{
            DefaultTableModel modelo;
            modelo =  func.mostrarVentaController(buscar);
            tablalistado.setModel(modelo);
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Error al mostrar los registros en la tabla cliente");
        }
    }  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        txtidproducto = new javax.swing.JTextField();
        txtidempleado = new javax.swing.JTextField();
        txtidventa = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        btnproducto = new javax.swing.JButton();
        btnempleado = new javax.swing.JButton();
        btncliente = new javax.swing.JButton();
        cbotipoventa = new javax.swing.JComboBox<>();
        datefechaventa = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcantidadbodega = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtvalorunidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ventas");
        setToolTipText("");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1300, 547));
        setRequestFocusEnabled(false);

        jLabel5.setText("ID Producto:");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Venta:");

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jLabel3.setText("Id Empleado");

        jLabel2.setText("Id Cliente");

        jLabel1.setText("Id Venta:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista ventas"));

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Venta", "ID Cliente", "ID Empleado", "Tipo Venta", "Fecha Venta", "ID Producto", "Cantidad", "Valor"
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(btnsalir))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproductoActionPerformed(evt);
            }
        });

        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });

        jLabel12.setText("Tipo Venta:");

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Cantidad Comprada:");

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcantidadKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });

        btnproducto.setText("....");
        btnproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductoActionPerformed(evt);
            }
        });

        btnempleado.setText("....");
        btnempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempleadoActionPerformed(evt);
            }
        });

        btncliente.setText("....");
        btncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclienteActionPerformed(evt);
            }
        });

        cbotipoventa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contado", "Crédito" }));

        jLabel7.setText("Total:");

        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        jLabel8.setText("Cantad Existente:");

        jLabel10.setText("Valor Unitario:");

        txtvalorunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorunidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbotipoventa, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(datefechaventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtidventa, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidempleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(txtidcliente, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btncliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnempleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtvalorunidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(txtidproducto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcantidadbodega, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(10, 10, 10)
                                .addComponent(btnproducto))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txttotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addComponent(txtcantidad, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 30, Short.MAX_VALUE)
                                .addComponent(btnnuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btnguardar)
                                .addGap(18, 18, 18)
                                .addComponent(btncancelar)))
                        .addGap(59, 59, 59)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtidventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnempleado))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(datefechaventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cbotipoventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btnproducto))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtcantidadbodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtvalorunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnuevo)
                            .addComponent(btnguardar)
                            .addComponent(btncancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        verificaEnfoque();
        empaquetaDatos();
        int ingreso = 0;
        if(!(func.existeVentaController(ingreso))){
            if(accion.equals("guardar")){
                if(func.insertarVentaController(dtsventa,dtsventad)){
                    if(funcpro.editarCantidadProductoController(dtsproducto)){
                        JOptionPane.showConfirmDialog(rootPane, "Registro Venta almacenado con éxito");
                    }
                    mostrar("");  
                    inhabilitar();
                 }
            }else if(accion.equals("editar")){
                     dtsventa.setIdventa(Integer.parseInt(txtidventa.getText()));
                     func.editarVentaController(dtsventa, dtsventad);
                      mostrar(""); 
                      inhabilitar();
               }
        }
    }//GEN-LAST:event_btnguardarActionPerformed
    private void empaquetaDatos(){
        int sel;
        int d,m,a;
        Calendar cal;
       
        cal = datefechaventa.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        sel = cbotipoventa.getSelectedIndex();
        dtsventa.setIdcliente(Integer.parseInt(txtidcliente.getText())); //Importao
        dtsventa.setIdempleado(Integer.parseInt(txtidempleado.getText())); //importado
        dtsventa.setTipoventa(cbotipoventa.getItemAt(sel));
        dtsventa.setFecha_venta(new Date(a,m,d));
        dtsventad.setIdproducto(Integer.parseInt(txtidproducto.getText())); //Importao
        dtsventad.setCantidadcomprada(Integer.parseInt(txtcantidad.getText()));
        dtsventad.setValor(Float.parseFloat(txttotal.getText()));
             
    }
    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
          mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproductoActionPerformed

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void btnempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempleadoActionPerformed
       frmVistaEmpleado vista = null;
          try {
              vista = new frmVistaEmpleado();
          } catch (SQLException ex) {
              Logger.getLogger(frmVenta.class.getName()).log(Level.SEVERE, null, ex);
          }
       vista.toFront();
       vista.setVisible(true);
    }//GEN-LAST:event_btnempleadoActionPerformed

    private void btnclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclienteActionPerformed
        frmVistaCliente vista = null;
          try { 
              vista = new frmVistaCliente();
          } catch (SQLException ex) {
              Logger.getLogger(frmVenta.class.getName()).log(Level.SEVERE, null, ex);
          }
        vista.toFront();
        vista.setVisible(true);
    }//GEN-LAST:event_btnclienteActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
           try {
            callEliminar("Estas seguro de que quiere eliminar el registro de compra?");
        } catch (SQLException ex) {
            Logger.getLogger(frmCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneliminarActionPerformed
    private void callEliminar(String mensage) throws SQLException{
        if(!(txtidventa.getText().toString()=="")){
            int confir = JOptionPane.showConfirmDialog(null, mensage);
            if(confir==0){
                dtsventa.setIdventa(Integer.parseInt(txtidventa.getText()));
                dtsventad.setNumventa(Integer.parseInt(txtidventa.getText()));
                boolean flag = func.eliminarVentaController(dtsventa, dtsventad);
                mostrar("");
                if(flag==true){
                    JOptionPane.showConfirmDialog(rootPane, "Registro del trabajador eliminado con éxito");
                }
                   inhabilitar();
            }
        }
    }
    private void btnproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductoActionPerformed
        frmVistaProducto vista = null;
         try {
             vista = new frmVistaProducto();
         } catch (SQLException ex) {
             Logger.getLogger(frmCompra.class.getName()).log(Level.SEVERE, null, ex);
         }
        vista.toFront();
        vista.setVisible(true);
    }//GEN-LAST:event_btnproductoActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
       btnguardar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion="editar";
        int fila=tablalistado.rowAtPoint(evt.getPoint());
        txtidventa.setText(tablalistado.getValueAt(fila, 0).toString()); //No se muestra la columna
        txtidcliente.setText(tablalistado.getValueAt(fila, 1).toString()); //No se muestra la columna
        txtidempleado.setText(tablalistado.getValueAt(fila, 2).toString()); //No se muestra la columna
        cbotipoventa.setSelectedItem(tablalistado.getValueAt(fila, 3));
        datefechaventa.setDate(Date.valueOf(tablalistado.getValueAt(fila, 4).toString()));
        txtidproducto.setText(tablalistado.getValueAt(fila, 5).toString());
        txtcantidad.setText(tablalistado.getValueAt(fila, 6).toString());
        txttotal.setText(tablalistado.getValueAt(fila, 7).toString());
        
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void txtvalorunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorunidadActionPerformed

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
       
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtcantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyPressed
       
    }//GEN-LAST:event_txtcantidadKeyPressed

    private void txtcantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyReleased
       float totales,valorunitario;
       int cantidadcomprada;
       int viejacantidadbodega=0;
       int nuevacantidadbodega=0;
        try{
            valorunitario = Float.parseFloat(txtvalorunidad.getText());
            cantidadcomprada = Integer.parseInt(txtcantidad.getText());
            totales=total.totalVenta(cantidadcomprada, valorunitario);
            txttotal.setText(Float.toString(totales));
             viejacantidadbodega = Integer.parseInt(txtcantidadbodega.getText());
             if(viejacantidadbodega >= cantidadcomprada){
                 nuevacantidadbodega = viejacantidadbodega - cantidadcomprada;
             }
             else{
               JOptionPane.showConfirmDialog(null, "No tiene suficientes productos para la venta");
             }
            dtsproducto.setCantidad(nuevacantidadbodega);
            dtsproducto.setIdProducto(Integer.parseInt(txtidproducto.getText()));
        }catch(Exception e){
            System.out.println("Error calculos de totales");
        }
    }//GEN-LAST:event_txtcantidadKeyReleased
   
   
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
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmVenta().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frmVenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
     private void inhabilitar(){
        txtcantidadbodega.setEnabled(false);
        txtvalorunidad.setEnabled(false);
        txttotal.setEnabled(false);
        txtidventa.setEnabled(false);
        txtidcliente.setEnabled(false);
        txtidempleado.setEnabled(false);
        cbotipoventa.setEnabled(false);
        datefechaventa.setEnabled(false);
        txtidproducto.setEnabled(false);
        txtcantidad.setEnabled(false);
        txttotal.setEnabled(false);
        txtcantidad.setText("");
        txttotal.setText("");
        
    } 
    private void habilitar(){
        txtcantidadbodega.setEnabled(false);
        txtvalorunidad.setEnabled(false);
        txttotal.setEnabled(false);
        txtidventa.setEnabled(false);
        txtidcliente.setEnabled(false);
        txtidempleado.setEnabled(false);
        cbotipoventa.setEnabled(true);
        datefechaventa.setEnabled(true);
        txtidproducto.setEnabled(false);
        txtcantidad.setEnabled(true);
        
        txtcantidad.setText("");
        txttotal.setText("");
        txtidventa.setText("");
        txtidcliente.setText("");
        txtidempleado.setText("");
        txtidproducto.setText("");
        
    }
    private void verificaEnfoque(){
        if(datefechaventa.getCalendar().getTime().toString()==""){
            JOptionPane.showConfirmDialog(null,"Debes ingresar una fecha");
            datefechaventa.requestFocus();
            return;
        }
        
        if(txtcantidad.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar la cantidad");
            txtcantidad.requestFocus();
            return;
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncliente;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnempleado;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnproducto;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbotipoventa;
    private com.toedter.calendar.JDateChooser datefechaventa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcantidad;
    public static javax.swing.JTextField txtcantidadbodega;
    public static javax.swing.JTextField txtidcliente;
    public static javax.swing.JTextField txtidempleado;
    public static javax.swing.JTextField txtidproducto;
    private javax.swing.JTextField txtidventa;
    public static javax.swing.JTextField txttotal;
    public static javax.swing.JTextField txtvalorunidad;
    // End of variables declaration//GEN-END:variables
}
