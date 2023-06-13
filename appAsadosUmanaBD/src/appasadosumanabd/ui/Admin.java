/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanabd.ui;

import appasadosumanadb.entity.Controlador;
import appasadosumanadb.entity.TextPrompt;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;

/**
 *
 * @author osmel
 */
public class Admin extends javax.swing.JFrame {

    private Controlador control;
    private int x, y;

    public Admin(Controlador control) {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/logo/Logo_500x500.png")).getImage());
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelTopBar = new javax.swing.JPanel();
        jButtonMinimize = new javax.swing.JButton();
        jButtonExit1 = new javax.swing.JButton();
        jLabelLogotipo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMoverVentana = new javax.swing.JLabel();
        jPanelbar1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jButtonBill = new javax.swing.JButton();
        jButtonUsers = new javax.swing.JButton();
        jButtonProducts = new javax.swing.JButton();
        jButtonTotalSales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTopBar.setBackground(new java.awt.Color(255, 101, 0));
        jPanelTopBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/minimizar_icon.png"))); // NOI18N
        jButtonMinimize.setBorderPainted(false);
        jButtonMinimize.setFocusable(false);
        jButtonMinimize.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/minimizar_icon.png"))); // NOI18N
        jButtonMinimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/minimizar_icon_1.png"))); // NOI18N
        jButtonMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizeActionPerformed(evt);
            }
        });
        jPanelTopBar.add(jButtonMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 20, 20));

        jButtonExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/close_icon.png"))); // NOI18N
        jButtonExit1.setFocusPainted(false);
        jButtonExit1.setFocusable(false);
        jButtonExit1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/close_icon.png"))); // NOI18N
        jButtonExit1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/close_icon_1.png"))); // NOI18N
        jButtonExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExit1ActionPerformed(evt);
            }
        });
        jPanelTopBar.add(jButtonExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 20, 20));

        jLabelLogotipo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelLogotipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/Logo 50x50.png"))); // NOI18N
        jLabelLogotipo.setText("<html>Asados Umañana<html>");
        jPanelTopBar.add(jLabelLogotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 60));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelTopBar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 20, 60));

        jMoverVentana.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMoverVentanaMouseDragged(evt);
            }
        });
        jMoverVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMoverVentanaMousePressed(evt);
            }
        });
        jPanelTopBar.add(jMoverVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 360, 60));

        jPanel1.add(jPanelTopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanelbar1.setBackground(new java.awt.Color(255, 101, 0));
        jPanelbar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanelbar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 800, 30));

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Panel de");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 100, 20));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 101, 0));
        jLabel2.setText("ADMINISTRACIÓN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        jButtonExit.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonExit.setText("Cerrar sesión");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 190, 30));

        jButtonBill.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonBill.setText("Facturar");
        jButtonBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBillActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 410, 30));

        jButtonUsers.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonUsers.setText("Usuarios");
        jButtonUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsersActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 410, 30));

        jButtonProducts.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonProducts.setText("Productos");
        jButtonProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductsActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 410, 30));

        jButtonTotalSales.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonTotalSales.setText("Total de ventas");
        jButtonTotalSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalSalesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTotalSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 468));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizeActionPerformed
        //Minimizar ventana
        setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizeActionPerformed

    private void jButtonExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExit1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExit1ActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        this.dispose();
        control.getvLogin().setVisible(true);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBillActionPerformed
        this.dispose();
        control.setvBill(new Bill(control));
        control.getvBill().setVisible(true);
    }//GEN-LAST:event_jButtonBillActionPerformed

    private void jMoverVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMoverVentanaMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jMoverVentanaMouseDragged

    private void jMoverVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMoverVentanaMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jMoverVentanaMousePressed

    private void jButtonUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsersActionPerformed
        this.dispose();
        control.setvUsers(new Users(control));
        control.getvUsers().setVisible(true);
    }//GEN-LAST:event_jButtonUsersActionPerformed

    private void jButtonProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductsActionPerformed
        this.dispose();
        control.setvProducts(new Products(control));
        control.getvProducts().setVisible(true);
    }//GEN-LAST:event_jButtonProductsActionPerformed

    private void jButtonTotalSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalSalesActionPerformed
        try {
            Ventas vVentas = new Ventas(this, true);
            vVentas.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonTotalSalesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBill;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonExit1;
    private javax.swing.JButton jButtonMinimize;
    private javax.swing.JButton jButtonProducts;
    private javax.swing.JButton jButtonTotalSales;
    private javax.swing.JButton jButtonUsers;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabelLogotipo;
    private javax.swing.JLabel jMoverVentana;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanelTopBar;
    public javax.swing.JPanel jPanelbar1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
