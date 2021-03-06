/*
 * Trabajo presentado Por:
 * Leidy Castaño
 * Yuly Albear
 * Omar Torres
 */
package vista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.ventas.frmVenta;
import vista.cliente.frmCliente;
import vista.compra.frmCompra;
import vista.credito.frmCredito;
import vista.credito.frmCuota;
import vista.empleado.frmEmpleado;
import vista.fiador.frmFiador;
import vista.cuentasporpagar.frmCuentasPorPagar;
import vista.producto.frmProducto;

import vista.proveedor.frmProveedor;
import vista.reportes.frmReporte;

public class SistemaVentas extends javax.swing.JFrame {

    public SistemaVentas() {
        initComponents();
        this.setExtendedState(SistemaVentas.MAXIMIZED_BOTH);
        this.setTitle("Sistema de gestión de ventas Eelectrodomesticos de Caucasia");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        Proveedor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        Cuotas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ECG.png"))); // NOI18N
        escritorio.add(jLabel1);
        jLabel1.setBounds(30, 30, 300, 205);

        editMenu.setBackground(new java.awt.Color(204, 255, 255));
        editMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editMenu.setForeground(new java.awt.Color(0, 51, 102));
        editMenu.setMnemonic('e');
        editMenu.setText("Usuarios");
        editMenu.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(0, 51, 102));
        jMenuItem6.setText("Fiador");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem6);

        jMenuItem1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 51, 102));
        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem1);

        jMenuItem7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(0, 51, 102));
        jMenuItem7.setText("Empleados");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem7);

        Proveedor.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Proveedor.setForeground(new java.awt.Color(0, 51, 102));
        Proveedor.setText("Proveedor");
        Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorActionPerformed(evt);
            }
        });
        editMenu.add(Proveedor);

        menuBar.add(editMenu);

        jMenu2.setBackground(new java.awt.Color(204, 255, 255));
        jMenu2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu2.setForeground(new java.awt.Color(0, 51, 102));
        jMenu2.setText("Productos");
        jMenu2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 51, 102));
        jMenuItem3.setText("Ver Productos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        menuBar.add(jMenu2);

        jMenu4.setBackground(new java.awt.Color(204, 255, 255));
        jMenu4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu4.setForeground(new java.awt.Color(0, 51, 102));
        jMenu4.setText("Operaciones");
        jMenu4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(0, 51, 102));
        jMenuItem2.setText("Compras");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(0, 51, 102));
        jMenuItem8.setText("Creditos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem5.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(0, 51, 102));
        jMenuItem5.setText("Ventas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        Cuotas.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Cuotas.setForeground(new java.awt.Color(0, 51, 102));
        Cuotas.setText("Cuotas");
        Cuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuotasActionPerformed(evt);
            }
        });
        jMenu4.add(Cuotas);

        menuBar.add(jMenu4);

        jMenu3.setBackground(new java.awt.Color(204, 255, 255));
        jMenu3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu3.setForeground(new java.awt.Color(0, 51, 102));
        jMenu3.setText("Cuentas");
        jMenu3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(0, 51, 102));
        jMenuItem4.setText("Cuentas por pagar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        menuBar.add(jMenu3);

        jMenu5.setBackground(new java.awt.Color(204, 255, 255));
        jMenu5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu5.setForeground(new java.awt.Color(0, 51, 102));
        jMenu5.setText("Reportes");
        jMenu5.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(0, 51, 102));
        jMenuItem9.setText("Reporte Cliente");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        menuBar.add(jMenu5);

        jMenu1.setBackground(new java.awt.Color(204, 255, 255));
        jMenu1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu1.setForeground(new java.awt.Color(0, 51, 102));
        jMenu1.setText("Exit");
        jMenu1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        menuBar.add(jMenu1);

        helpMenu.setBackground(new java.awt.Color(204, 255, 255));
        helpMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        helpMenu.setForeground(new java.awt.Color(0, 51, 102));
        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");
        helpMenu.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        frmProducto form=null;
        try {
            form = new frmProducto();
        } catch (SQLException ex) {
            Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        frmFiador form=null;
        try {
            form = new frmFiador();
        } catch (SQLException ex) {
            Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
     frmEmpleado form = null;
        try {
            form = new frmEmpleado();
        } catch (SQLException ex) {
            Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
     escritorio.add(form);
     form.toFront();
     form.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmCliente form=null;
        try {
            form = new frmCliente();
        } catch (SQLException ex) {
            Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        escritorio.add(form);
        form.toFront();
     
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorActionPerformed
        frmProveedor form=null;
        try {
            form = new frmProveedor();
        } catch (SQLException ex) {
            Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_ProveedorActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        frmVenta form=null;
        try {
            form = new frmVenta();
        } catch (SQLException ex) {
            Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        frmCredito form=null;
        try {
              form = new frmCredito();
                
        } catch (SQLException ex) {
            Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
             
        }
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
   
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frmCompra form=null;
        try {
            form = new frmCompra();
        } catch (SQLException ex) {
            Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        frmCuentasPorPagar form=null;
        try {
            form = new frmCuentasPorPagar();
        } catch (SQLException ex) {
            Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void CuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuotasActionPerformed
        frmCuota form=null;
        
        try {
              form = new frmCuota();
                
        } catch (SQLException ex) {
            Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
             
        }
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_CuotasActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       frmReporte form=null;
        form = new frmReporte();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cuotas;
    private javax.swing.JMenuItem Proveedor;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
