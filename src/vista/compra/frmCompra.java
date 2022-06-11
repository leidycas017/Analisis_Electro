/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
 */
package vista.compra;


import logica.controladores.ControllerCompra;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Vcompra;
import modelos.VproductoComprado;
import operaciongeneral.CalculosCompra;
import vista.producto.frmProducto;
import vista.producto.frmVistaProducto;
import vista.producto.frmVistaProductoCompra;
import vista.proveedor.frmVistaProveedor;
import vista.proveedor.frmVistaProveedorCompra;


public class frmCompra extends javax.swing.JInternalFrame {
     private String accion ="Guardar";  
     private Vcompra dts; 
     private VproductoComprado dtspc;
     private ControllerCompra func;
    
    public frmCompra() throws SQLException {
        initComponents();
        dts = new Vcompra();
        dtspc = new VproductoComprado();
        func = new ControllerCompra();
        inhabilitar();
        mostrar("");
    }
    private void mostrar(String buscar){
        try{
            DefaultTableModel modelo;
            modelo =  func.mostrarCompraController(buscar);
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
        jLabel4 = new javax.swing.JLabel();
        txtidcompra = new javax.swing.JTextField();
        txtidproveedor = new javax.swing.JTextField();
        datefechacompra = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtidproducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        txtvalorcompra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtidcompra1 = new javax.swing.JTextField();
        txtidproveedor1 = new javax.swing.JTextField();
        datefechacompra1 = new com.toedter.calendar.JDateChooser();
        jButton8 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtidprocomprado1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtcantidad1 = new javax.swing.JTextField();
        cboestado1 = new javax.swing.JComboBox<>();
        txtvalorcomprado1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablalistado1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtidcompra2 = new javax.swing.JTextField();
        txtidproveedor2 = new javax.swing.JTextField();
        datefechacompra2 = new com.toedter.calendar.JDateChooser();
        jButton15 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtidprocomprado2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtcantidad2 = new javax.swing.JTextField();
        cboestado2 = new javax.swing.JComboBox<>();
        txtvalorcomprado2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistado2 = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtidcompra3 = new javax.swing.JTextField();
        txtidproveedor3 = new javax.swing.JTextField();
        datefechacompra3 = new com.toedter.calendar.JDateChooser();
        jButton22 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        txtidprocomprado3 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtcantidad3 = new javax.swing.JTextField();
        cboestado3 = new javax.swing.JComboBox<>();
        txtvalorcomprado3 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablalistado3 = new javax.swing.JTable();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Compras");
        setPreferredSize(new java.awt.Dimension(1050, 510));
        setRequestFocusEnabled(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jLabel1.setText("ID Compra:");

        jLabel2.setText("ID Proveedor:");

        jLabel3.setText("Estado:");

        jLabel4.setText("Fecha:");

        txtidcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcompraActionPerformed(evt);
            }
        });

        txtidproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproveedorActionPerformed(evt);
            }
        });

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Id Pro comp:");

        txtidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproductoActionPerformed(evt);
            }
        });

        jLabel7.setText("Cantidad");

        jLabel11.setText("Valor Comprado");

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Compra", " ID Proveedor", "Estado", "Fecha", "Id Producto", "Cantidad", "Valor Compra"
            }
        ));
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        tablalistado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablalistadoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablalistado);

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        jLabel6.setText("Buscar:");

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnexit.setText("Salir");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setTitle("Compras");

        jLabel8.setText("ID Compra:");

        jLabel9.setText("ID Proveedor:");

        jLabel10.setText("Estado:");

        jLabel12.setText("Fecha:");

        txtidcompra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcompra1ActionPerformed(evt);
            }
        });

        txtidproveedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproveedor1ActionPerformed(evt);
            }
        });

        jButton8.setText("...");

        jLabel13.setText("Id Pro comp:");

        txtidprocomprado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidprocomprado1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Cantidad");

        cboestado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Valor Comprado");

        tablalistado1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Compra", "Title Proveedor", "Estado", "Fecha Comp", "Cantidad", "Valor Compra"
            }
        ));
        jScrollPane2.setViewportView(tablalistado1);

        jButton9.setText("jButton1");

        jButton10.setText("jButton3");

        jButton11.setText("jButton4");

        jLabel16.setText("Buscar:");

        jButton12.setText("Buscar");

        jButton13.setText("Borrar ");

        jButton14.setText("Salir");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addGap(48, 48, 48)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtidcompra1)
                            .addComponent(txtidprocomprado1)
                            .addComponent(cboestado1, 0, 119, Short.MAX_VALUE)
                            .addComponent(txtvalorcomprado1))
                        .addGap(95, 95, 95)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(33, 33, 33)
                                .addComponent(txtidproveedor1))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jButton9))
                                .addGap(27, 27, 27)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(datefechacompra1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addComponent(txtcantidad1))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jButton10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton11)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addGap(350, 350, 350))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(28, 28, 28)
                                .addComponent(jButton12)
                                .addGap(18, 18, 18)
                                .addComponent(jButton13)
                                .addGap(18, 18, 18)
                                .addComponent(jButton14))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtidcompra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtidproveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboestado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(datefechacompra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtidprocomprado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtvalorcomprado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(jButton9))
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton10)
                        .addComponent(jButton11)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jInternalFrame2.setClosable(true);
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setTitle("Compras");

        jLabel17.setText("ID Compra:");

        jLabel18.setText("ID Proveedor:");

        jLabel19.setText("Estado:");

        jLabel20.setText("Fecha:");

        txtidcompra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcompra2ActionPerformed(evt);
            }
        });

        txtidproveedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproveedor2ActionPerformed(evt);
            }
        });

        jButton15.setText("...");

        jLabel21.setText("Id Pro comp:");

        txtidprocomprado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidprocomprado2ActionPerformed(evt);
            }
        });

        jLabel22.setText("Cantidad");

        cboestado2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel23.setText("Valor Comprado");

        tablalistado2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Compra", "Title Proveedor", "Estado", "Fecha Comp", "Cantidad", "Valor Compra"
            }
        ));
        jScrollPane3.setViewportView(tablalistado2);

        jButton16.setText("jButton1");

        jButton17.setText("jButton3");

        jButton18.setText("jButton4");

        jLabel24.setText("Buscar:");

        jButton19.setText("Buscar");

        jButton20.setText("Borrar ");

        jButton21.setText("Salir");

        jInternalFrame3.setClosable(true);
        jInternalFrame3.setIconifiable(true);
        jInternalFrame3.setMaximizable(true);
        jInternalFrame3.setTitle("Compras");

        jLabel25.setText("ID Compra:");

        jLabel26.setText("ID Proveedor:");

        jLabel27.setText("Estado:");

        jLabel28.setText("Fecha:");

        txtidcompra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcompra3ActionPerformed(evt);
            }
        });

        txtidproveedor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproveedor3ActionPerformed(evt);
            }
        });

        jButton22.setText("...");

        jLabel29.setText("Id Pro comp:");

        txtidprocomprado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidprocomprado3ActionPerformed(evt);
            }
        });

        jLabel30.setText("Cantidad");

        cboestado3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel31.setText("Valor Comprado");

        tablalistado3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Compra", "Title Proveedor", "Estado", "Fecha Comp", "Cantidad", "Valor Compra"
            }
        ));
        jScrollPane4.setViewportView(tablalistado3);

        jButton23.setText("jButton1");

        jButton24.setText("jButton3");

        jButton25.setText("jButton4");

        jLabel32.setText("Buscar:");

        jButton26.setText("Buscar");

        jButton27.setText("Borrar ");

        jButton28.setText("Salir");

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29)
                            .addComponent(jLabel31))
                        .addGap(48, 48, 48)
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtidcompra3)
                            .addComponent(txtidprocomprado3)
                            .addComponent(cboestado3, 0, 119, Short.MAX_VALUE)
                            .addComponent(txtvalorcomprado3))
                        .addGap(95, 95, 95)
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(33, 33, 33)
                                .addComponent(txtidproveedor3))
                            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel30)
                                    .addComponent(jButton23))
                                .addGap(27, 27, 27)
                                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(datefechacompra3, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addComponent(txtcantidad3))
                                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                        .addComponent(jButton24)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton25)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton22)
                        .addGap(350, 350, 350))
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(28, 28, 28)
                                .addComponent(jButton26)
                                .addGap(18, 18, 18)
                                .addComponent(jButton27)
                                .addGap(18, 18, 18)
                                .addComponent(jButton28))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtidcompra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(txtidproveedor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel27)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboestado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(datefechacompra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton22))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(txtidprocomprado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcantidad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30)))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtvalorcomprado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)
                        .addComponent(jButton23))
                    .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton24)
                        .addComponent(jButton25)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jButton26)
                    .addComponent(jButton27)
                    .addComponent(jButton28))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23))
                        .addGap(48, 48, 48)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtidcompra2)
                            .addComponent(txtidprocomprado2)
                            .addComponent(cboestado2, 0, 119, Short.MAX_VALUE)
                            .addComponent(txtvalorcomprado2))
                        .addGap(95, 95, 95)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(33, 33, 33)
                                .addComponent(txtidproveedor2))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel22)
                                    .addComponent(jButton16))
                                .addGap(27, 27, 27)
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(datefechacompra2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addComponent(txtcantidad2))
                                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                        .addComponent(jButton17)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton18)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton15)
                        .addGap(350, 350, 350))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(28, 28, 28)
                                .addComponent(jButton19)
                                .addGap(18, 18, 18)
                                .addComponent(jButton20)
                                .addGap(18, 18, 18)
                                .addComponent(jButton21))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtidcompra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txtidproveedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboestado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(datefechacompra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton15))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(txtidprocomprado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtvalorcomprado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)
                        .addComponent(jButton16))
                    .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton17)
                        .addComponent(jButton18)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jButton19)
                    .addComponent(jButton20)
                    .addComponent(jButton21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtidcompra, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(txtidproducto)
                                    .addComponent(txtvalorcompra))
                                .addGap(36, 36, 36)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidproveedor)
                                    .addComponent(datefechacompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtcantidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(btnnuevo)
                                .addGap(27, 27, 27)
                                .addComponent(btnguardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnsalir)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 34, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 517, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 518, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 517, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 518, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtidcompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datefechacompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)))))
                    .addComponent(jButton2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtvalorcompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(btnnuevo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnguardar)
                        .addComponent(btnsalir)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton5)
                    .addComponent(btneliminar)
                    .addComponent(btnexit)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 241, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 240, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 241, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 240, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcompraActionPerformed

    private void txtidproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproveedorActionPerformed

    private void txtidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproductoActionPerformed

    private void txtidcompra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcompra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcompra1ActionPerformed

    private void txtidproveedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproveedor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproveedor1ActionPerformed

    private void txtidprocomprado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidprocomprado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidprocomprado1ActionPerformed

    private void txtidcompra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcompra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcompra2ActionPerformed

    private void txtidproveedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproveedor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproveedor2ActionPerformed

    private void txtidprocomprado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidprocomprado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidprocomprado2ActionPerformed

    private void txtidcompra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcompra3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcompra3ActionPerformed

    private void txtidproveedor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproveedor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproveedor3ActionPerformed

    private void txtidprocomprado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidprocomprado3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidprocomprado3ActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        verificaEnfoque();
        empaquetaDatos();
        if(!(func.existeCompraController(Integer.parseInt(txtidcompra.getText())))){
             if(accion.equals("guardar")){
                 if(func.insertarCompraController(dts,dtspc)){
                    JOptionPane.showConfirmDialog(rootPane, "Registro trabajador almacenado con éxito");
                    mostrar("");  
                    inhabilitar();
                 }
            }else if(accion.equals("editar")){
                      dts.setIdpreveedor(Integer.parseInt(txtidproveedor.getText()));
                      func.editarCompraController(dts, dtspc);
                      mostrar(""); 
                      inhabilitar();
               }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
          try {
            callEliminar("Estas seguro de que quiere eliminar el registro de compra?");
        } catch (SQLException ex) {
            Logger.getLogger(frmCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneliminarActionPerformed
    private void empaquetaDatos(){
        int sel;
        int d,m,a;
        Calendar cal;
        float total;
        cal = datefechacompra.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFechacopmpra(new Date(a,m,d));
        dts.setIdpreveedor(Integer.parseInt(txtidproveedor.getText())); //Importao
        dts.setEstado(txtestado.getText());
        dts.setIdcompra(Integer.parseInt(txtidcompra.getText()));
        dtspc.setIdproducto(Integer.parseInt(txtidproducto.getText())); //Importao
        dtspc.setCantidad(Integer.parseInt(txtcantidad.getText()));
        total = calcularTotal(Integer.parseInt(txtcantidad.getText()),Float.parseFloat(txtvalorcompra.getText()));
        dtspc.setValorcompra(total);
  }
    
    private float  calcularTotal(int cantidad, float valorunitario){
        CalculosCompra calculo = new CalculosCompra();
        return calculo.totalCompra(cantidad, valorunitario);
    }
    private void callEliminar(String mensage) throws SQLException{
        if(!(txtidcompra.getText().toString()=="")){
            int confir = JOptionPane.showConfirmDialog(null, mensage);
            if(confir==0){
                dts.setIdcompra(Integer.parseInt(txtidcompra.getText()));
                boolean flag = func.eliminarCompraController(dts);
                mostrar("");
                if(flag==true){
                    JOptionPane.showConfirmDialog(rootPane, "Registro del trabajador eliminado con éxito");
                }
                   inhabilitar();
            }
        }
    }
    private void tablalistadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablalistadoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablalistadoKeyPressed
    
    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        btnguardar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion="editar";
        int fila=tablalistado.rowAtPoint(evt.getPoint());
        
        txtidcompra.setText(tablalistado.getValueAt(fila, 0).toString()); //No se muestra la columna
        txtidproveedor.setText(tablalistado.getValueAt(fila, 1).toString());
        txtestado.setText(tablalistado.getValueAt(fila, 2).toString());
        datefechacompra.setDate(Date.valueOf(tablalistado.getValueAt(fila, 3).toString()));
        txtidproducto.setText(tablalistado.getValueAt(fila, 4).toString());
        txtcantidad.setText(tablalistado.getValueAt(fila, 5).toString());
        txtvalorcompra.setText(tablalistado.getValueAt(fila, 6).toString());
        
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frmVistaProveedorCompra vista = null;
        vista = new frmVistaProveedorCompra();
        vista.toFront();
        vista.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        frmVistaProductoCompra vista = null;
         try {
             vista = new frmVistaProductoCompra();
         } catch (SQLException ex) {
             Logger.getLogger(frmCompra.class.getName()).log(Level.SEVERE, null, ex);
         }
        vista.toFront();
        vista.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void inhabilitar(){
        txtidproveedor.setEnabled(false);
        datefechacompra.setEnabled(false);
        txtidcompra.setEnabled(false);  //Se genera auto
        txtestado.setEnabled(false);
        txtidproducto.setEnabled(false);
        txtidcompra.setEnabled(false);
        txtcantidad.setEnabled(false);
        txtvalorcompra.setEnabled(false);
        txtestado.setText("");
        txtcantidad.setText("");
        txtvalorcompra.setText("");
        
    } 
    private void habilitar(){
        txtidproveedor.setEnabled(false);
        datefechacompra.setEnabled(true);
        txtidcompra.setEnabled(false);  //Se genera auto
        txtestado.setEnabled(true);
        txtidproducto.setEnabled(false);
        txtidcompra.setEnabled(false);
        txtcantidad.setEnabled(false);
        txtvalorcompra.setEnabled(true);
        txtidcompra.setText("0000");
        txtestado.setText("");
        txtcantidad.setText("");
        txtvalorcompra.setText("");
    }
    private void verificaEnfoque(){
        if(txtestado.getText().length()==0){
            JOptionPane.showConfirmDialog(null,"Debes ingresar el estado ");
            txtestado.requestFocus();
            return;
        }
        
        if(txtcantidad.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar la cantidad");
            txtcantidad.requestFocus();
            return;
        }
        if(txtvalorcompra.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar valor deal producto");
            txtvalorcompra.requestFocus();
            return;
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cboestado1;
    private javax.swing.JComboBox<String> cboestado2;
    private javax.swing.JComboBox<String> cboestado3;
    private com.toedter.calendar.JDateChooser datefechacompra;
    private com.toedter.calendar.JDateChooser datefechacompra1;
    private com.toedter.calendar.JDateChooser datefechacompra2;
    private com.toedter.calendar.JDateChooser datefechacompra3;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTable tablalistado1;
    private javax.swing.JTable tablalistado2;
    private javax.swing.JTable tablalistado3;
    private javax.swing.JTextField txtbuscar;
    public static javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcantidad1;
    private javax.swing.JTextField txtcantidad2;
    private javax.swing.JTextField txtcantidad3;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtidcompra;
    private javax.swing.JTextField txtidcompra1;
    private javax.swing.JTextField txtidcompra2;
    private javax.swing.JTextField txtidcompra3;
    private javax.swing.JTextField txtidprocomprado1;
    private javax.swing.JTextField txtidprocomprado2;
    private javax.swing.JTextField txtidprocomprado3;
    public static javax.swing.JTextField txtidproducto;
    public static javax.swing.JTextField txtidproveedor;
    private javax.swing.JTextField txtidproveedor1;
    private javax.swing.JTextField txtidproveedor2;
    private javax.swing.JTextField txtidproveedor3;
    private javax.swing.JTextField txtvalorcompra;
    private javax.swing.JTextField txtvalorcomprado1;
    private javax.swing.JTextField txtvalorcomprado2;
    private javax.swing.JTextField txtvalorcomprado3;
    // End of variables declaration//GEN-END:variables
}
