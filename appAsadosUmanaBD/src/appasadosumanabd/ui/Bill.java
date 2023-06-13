/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanabd.ui;

import appasadosumanadb.db.Conexion;
import appasadosumanadb.db.SqlClass;
import appasadosumanadb.entity.Controlador;
import appasadosumanadb.entity.TextPrompt;
import appasadosumanadb.entity.reporte;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author osmel
 */
public class Bill extends javax.swing.JFrame implements Runnable {

    private Thread hilo;
    private Controlador control;
    private int x, y;

    public Bill(Controlador control) {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/logo/Logo_500x500.png")).getImage());
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        this.control = control;
        jButtonACliente.setEnabled(false);
        etiquetas();
        hilo = new Thread(this);
        hilo.start();
        //Hace que la tabla sea de solo lectura
        jTableOrders.setDefaultEditor(Object.class, null);
        tabla();
    }

    public void run() {
        while (true) {
            estadoUsuario();
            try {
                estadoUsuario();
                hilo.sleep(100);
            } catch (Exception ex) {
            }
        }
    }

    private void etiquetas() {
        TextPrompt id = new TextPrompt(" Código", jTextFieldID);
        TextPrompt descripcion = new TextPrompt(" Nombre", jTextFieldDescripcion);
        TextPrompt precio = new TextPrompt(" Precio", jTextFieldPrecio);
        TextPrompt cantidad = new TextPrompt(" Cantidad", jTextFieldCantidad);
    }

    private void estadoUsuario() {
        if (!control.isEstado()) {
            jButtonCUsers.setVisible(false);
            jButtonCUsers.setEnabled(false);
            jButtonCProducts.setVisible(false);
            jButtonCProducts.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelTopBar = new javax.swing.JPanel();
        jButtonMinimize = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabelLogotipo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonCProducts = new javax.swing.JButton();
        jButtonCUsers = new javax.swing.JButton();
        jMoverVentana = new javax.swing.JLabel();
        jPanelbar1 = new javax.swing.JPanel();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxMesa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOrders = new javax.swing.JTable();
        jButtonFacturar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTotalAPagar = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldIDCliente = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jButtonACliente = new javax.swing.JButton();

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

        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/close_icon.png"))); // NOI18N
        jButtonExit.setFocusPainted(false);
        jButtonExit.setFocusable(false);
        jButtonExit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/close_icon.png"))); // NOI18N
        jButtonExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/close_icon_1.png"))); // NOI18N
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanelTopBar.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 20, 20));

        jLabelLogotipo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelLogotipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/Logo 50x50.png"))); // NOI18N
        jLabelLogotipo.setText("<html>Asados Umañana<html>");
        jLabelLogotipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogotipoMouseClicked(evt);
            }
        });
        jPanelTopBar.add(jLabelLogotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 60));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelTopBar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 20, 60));

        jButtonCProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/producto.png"))); // NOI18N
        jButtonCProducts.setBorderPainted(false);
        jButtonCProducts.setFocusPainted(false);
        jButtonCProducts.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/producto.png"))); // NOI18N
        jButtonCProducts.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/producto_1.png"))); // NOI18N
        jButtonCProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCProductsActionPerformed(evt);
            }
        });
        jPanelTopBar.add(jButtonCProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 24, 24));

        jButtonCUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/usuario.png"))); // NOI18N
        jButtonCUsers.setBorderPainted(false);
        jButtonCUsers.setFocusPainted(false);
        jButtonCUsers.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/usuario.png"))); // NOI18N
        jButtonCUsers.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/usuario_1.png"))); // NOI18N
        jButtonCUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCUsersActionPerformed(evt);
            }
        });
        jPanelTopBar.add(jButtonCUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 24, 24));

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
        jPanelTopBar.add(jMoverVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 350, 60));

        jPanel1.add(jPanelTopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanelbar1.setBackground(new java.awt.Color(255, 101, 0));
        jPanelbar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/salir.png"))); // NOI18N
        jButtonCerrarSesion.setBorderPainted(false);
        jButtonCerrarSesion.setFocusPainted(false);
        jButtonCerrarSesion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/salir.png"))); // NOI18N
        jButtonCerrarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/salir_1.png"))); // NOI18N
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });
        jPanelbar1.add(jButtonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 2, 24, 24));

        jPanel1.add(jPanelbar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 800, 30));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 101, 0));
        jLabel2.setText("Facturación");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mesa:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 40, 20));

        jComboBoxMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboBoxMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jTableOrders.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTableOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOrdersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableOrders);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 620, 230));

        jButtonFacturar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonFacturar.setText("Facturar");
        jButtonFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFacturarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 100, 30));

        jButtonAgregar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 100, 30));

        jButtonEliminar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 100, 30));

        jButtonNuevo.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 100, 30));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 101, 0));
        jLabel5.setText("Total: $");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 50, 30));

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Panel de");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 130, 20));

        jTextFieldTotalAPagar.setEditable(false);
        jTextFieldTotalAPagar.setBackground(new java.awt.Color(34, 34, 34));
        jTextFieldTotalAPagar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jTextFieldTotalAPagar.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldTotalAPagar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextFieldTotalAPagar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 101, 0), 2, true));
        jPanel1.add(jTextFieldTotalAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 110, 30));

        jTextFieldID.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jTextFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIDKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 40, -1));

        jTextFieldDescripcion.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldDescripcion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jTextFieldDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescripcionKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 230, -1));

        jTextFieldPrecio.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jTextFieldPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 130, -1));

        jTextFieldCantidad.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldCantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jPanel1.add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 50, -1));

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/buscar.png"))); // NOI18N
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setFocusPainted(false);
        jButtonBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/buscar.png"))); // NOI18N
        jButtonBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/buscar_1.png"))); // NOI18N
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 24, 24));

        jTextFieldIDCliente.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldIDCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jTextFieldIDCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldIDClienteKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldIDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 100, -1));

        jLabelID.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID.setText("ID:");
        jPanel1.add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, 20));

        jLabelNombre.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Cliente:");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, 20));

        jTextFieldNombre.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 120, -1));

        jButtonBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/buscar.png"))); // NOI18N
        jButtonBuscarCliente.setBorderPainted(false);
        jButtonBuscarCliente.setFocusPainted(false);
        jButtonBuscarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/buscar.png"))); // NOI18N
        jButtonBuscarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/buscar_1.png"))); // NOI18N
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 24, 24));

        jButtonACliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/agregarCliente.png"))); // NOI18N
        jButtonACliente.setBorderPainted(false);
        jButtonACliente.setFocusPainted(false);
        jButtonACliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/agregarCliente.png"))); // NOI18N
        jButtonACliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/agregarCliente_1.png"))); // NOI18N
        jButtonACliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonACliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 24, 24));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 468));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizeActionPerformed
        //Minimizar ventana
        setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizeActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jMoverVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMoverVentanaMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jMoverVentanaMouseDragged

    private void jMoverVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMoverVentanaMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jMoverVentanaMousePressed

    private void jButtonCUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCUsersActionPerformed
        this.dispose();
        if (control.getvUsers() == null) {
            control.setvUsers(new Users(control));
        }
        control.getvUsers().setVisible(true);
    }//GEN-LAST:event_jButtonCUsersActionPerformed

    private void jButtonCProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCProductsActionPerformed
        this.dispose();
        if (control.getvProducts() == null) {
            control.setvProducts(new Products(control));
        }
        control.getvProducts().setVisible(true);
    }//GEN-LAST:event_jButtonCProductsActionPerformed

    private void jLabelLogotipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogotipoMouseClicked
        if (control.isEstado()) {
            this.dispose();
            control.getvAdmin().setVisible(true);
        }
    }//GEN-LAST:event_jLabelLogotipoMouseClicked

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        this.dispose();
        control.getvLogin().setVisible(true);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed
    private SearchProduct vSProd;
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        vSProd = new SearchProduct(this, true, control);
        vSProd.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClienteActionPerformed
        if (jTextFieldIDCliente.getText().isEmpty()) {
            jLabelID.setForeground(Color.decode("#FF9966"));
        } else {
            jLabelID.setForeground(Color.white);
            cliente();
        }
    }//GEN-LAST:event_jButtonBuscarClienteActionPerformed

    private void cliente() {
        try {
            String consulta = "SELECT * FROM clientes WHERE id = '" + jTextFieldIDCliente.getText()
                    + "' or nombre = '" + jTextFieldNombre.getText() + "' ORDER BY id ASC";
            SqlClass query = new SqlClass();
            LinkedList<String> result = query.query(consulta);
            if (result.isEmpty()) {
                try {
                    //
                    int op = JOptionPane.showConfirmDialog(this, "El usuario no existe en la BD.\n Desea añadirlo?");
                    System.out.println(op);
                    switch (op) {
                        case 0:
                            jButtonACliente.setEnabled(true);
                            if (jTextFieldIDCliente.getText().isEmpty() && jTextFieldNombre.getText().isEmpty()) {
                                JOptionPane.showMessageDialog(this, "Ingrese el id, nombre del cliente.");
                            }
                            break;
                        case 1:
                            jButtonACliente.setEnabled(false);
                            jTextFieldIDCliente.setText("0");
                            jTextFieldNombre.setText("Unknow");
                            break;
                    }
                    jLabelNombre.setForeground(Color.white);
                } catch (Exception e) {
                }

            }
            if (jTextFieldIDCliente.getText().equals(result.getFirst())
                    || jTextFieldNombre.getText().equals(result.getLast())) {
                jTextFieldIDCliente.setText(result.getFirst());
                jTextFieldNombre.setText(result.getLast());
            }
        } catch (Exception e) {
        }
    }

    private void jTextFieldIDClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDClienteKeyPressed
        jTextFieldNombre.setText("");
    }//GEN-LAST:event_jTextFieldIDClienteKeyPressed

    private void jButtonAClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAClienteActionPerformed
        if (!jTextFieldIDCliente.getText().isEmpty() && !jTextFieldNombre.getText().isEmpty()) {
            control.setCliente(jTextFieldIDCliente.getText(), jTextFieldNombre.getText());
            jLabelNombre.setForeground(Color.white);
            control.insetarCliente();
        } else {
            if (jTextFieldNombre.getText().isEmpty()) {
                jLabelNombre.setForeground(Color.decode("#FF9966"));
            }
        }
    }//GEN-LAST:event_jButtonAClienteActionPerformed

    private void jTextFieldIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDKeyTyped
        jTextFieldDescripcion.setText("");
        jTextFieldPrecio.setText("");
        if (!jTextFieldID.getText().isEmpty()) {
            jTextFieldID.setBackground(Color.white);
            autoCompletarProducto();
        }
    }//GEN-LAST:event_jTextFieldIDKeyTyped
    //private int contFilas = 0;
    private double total;
    private DefaultTableModel model = new DefaultTableModel();
    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        try {
            agregarOrden();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void agregarOrden() {
        if (!jTextFieldID.getText().isEmpty() && !jTextFieldDescripcion.getText().isEmpty()
                && !jTextFieldPrecio.getText().isEmpty()) {

            if (jTextFieldCantidad.getText().isEmpty()) {
                jTextFieldCantidad.setText("1");
            }
            boolean existe = false;
            int num_fila = 0;
            if (/*contFilas*/jTableOrders.getRowCount() == 0) {
                agregarProductos();
            } else {
                for (int i = 0; i < model.getRowCount(); i++) {
                    if (model.getValueAt(i, 0).equals(jTextFieldID.getText())) {
                        existe = true;
                        num_fila = i;
                    }
                }
                if (existe) {
                    int cantidad = (Integer.parseInt(model.getValueAt(num_fila, 3).toString())
                            + Integer.parseInt(jTextFieldCantidad.getText()));
                    model.setValueAt(String.valueOf(cantidad), num_fila, 3);
                    double importe = cantidad * Double.parseDouble(model.getValueAt(num_fila, 2).toString());
                    model.setValueAt(String.valueOf(importe), num_fila, 4);
                    vaciar();
                } else {
                    agregarProductos();
                }
            }
            calcularTotal();
        } else {
            if (jTextFieldID.getText().isEmpty()) {
                jTextFieldID.setBackground(Color.decode("#FF9966"));
            }
            if (jTextFieldDescripcion.getText().isEmpty()) {
                jTextFieldDescripcion.setBackground(Color.decode("#FF9966"));
            }
            if (jTextFieldPrecio.getText().isEmpty()) {
                jTextFieldPrecio.setBackground(Color.decode("#FF9966"));
            }
        }
    }

    private void calcularTotal() {
        total = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            total += Double.parseDouble(model.getValueAt(i, 4).toString());
        }
        jTextFieldTotalAPagar.setText(String.valueOf(total));
    }

    private void agregarProductos() {
        String[] datos = new String[5];
        datos[0] = jTextFieldID.getText();
        datos[1] = jTextFieldDescripcion.getText();
        datos[2] = jTextFieldPrecio.getText();
        datos[3] = jTextFieldCantidad.getText();
        datos[4] = (Double.parseDouble(datos[2]) * Double.parseDouble(datos[3])) + "";
        /*contFilas++;*/
        model.addRow(datos);
        vaciar();
    }

    private int seleccion;

    private void jTableOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOrdersMouseClicked
        seleccion = jTableOrders.rowAtPoint(evt.getPoint());
        jTextFieldID.setText((String) jTableOrders.getValueAt(seleccion, 0));
        jTextFieldDescripcion.setText((String) jTableOrders.getValueAt(seleccion, 1));
        jTextFieldPrecio.setText((String) jTableOrders.getValueAt(seleccion, 2));
        System.out.println(seleccion);
    }//GEN-LAST:event_jTableOrdersMouseClicked

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        try {
            model.removeRow(seleccion);
            /*contFilas--;*/
            calcularTotal();
            vaciar();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFacturarActionPerformed
        if (jTableOrders.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No hay productos.", "Aviso", JOptionPane.PLAIN_MESSAGE);
        } else {
            if (jTextFieldIDCliente.getText().isEmpty()) {
                jTextFieldIDCliente.setText("0");
                cliente();

            }
            procesoFacturacion();
//            ViewBill repo = new ViewBill(this, false);
//            repo.setVisible(true);
        }
        /*ViewBill vVBill = new ViewBill(this, false);
        vVBill.setVisible(true);*/
    }//GEN-LAST:event_jButtonFacturarActionPerformed

    private void jTextFieldDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionKeyTyped
        if (!jTextFieldDescripcion.getText().isEmpty()) {
            jTextFieldDescripcion.setBackground(Color.white);
        }
    }//GEN-LAST:event_jTextFieldDescripcionKeyTyped

    private void jTextFieldPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioKeyTyped
        if (!jTextFieldPrecio.getText().isEmpty()) {
            jTextFieldPrecio.setBackground(Color.white);
        }
    }//GEN-LAST:event_jTextFieldPrecioKeyTyped

    private void generarReporte() {
        try {
            JasperReport report = (JasperReport) JRLoader.loadObject(getClass().getResource("/report/Factura.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(report, null, reporte.getDataSource());

            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            view.setTitle("Visualización factura");
            view.setIconImage(new ImageIcon(getClass().getResource("/logo/Logo_500x500.png")).getImage());
            view.setVisible(true);

        } catch (JRException e) {
            e.getMessage();
        }
    }

    private void Orden() {
        Connection con = Conexion.getConnection();
        PreparedStatement pst = null;
        String sql = "call actualizarOrdenes(?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, jComboBoxMesa.getSelectedItem().toString());
            pst.setString(2, control.getEmp());
            pst.execute();
            //con.commit();
            pst.close();
            detalles(con);
        } catch (Exception e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + " Ordenes");
            }
        }
    }

    private void detalles(Connection con) {
        //Connection con = Conexion.getConnection();
        PreparedStatement pst = null;
        String sql = "call actualizarDetalles(?,?)";
        try {
            for (int i = 0; i < model.getRowCount(); i++) {
                pst = con.prepareStatement(sql);
                pst.setString(1, (String) model.getValueAt(i, 0));
                pst.setInt(2, Integer.parseInt((String) model.getValueAt(i, 3)));
                pst.execute();
            }
            //con.commit();
            pst.close();
            factura(con);
        } catch (Exception e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + " Detalles");
            }
        }
    }

    private void factura(Connection con) {
        //Connection con = Conexion.getConnection();
        PreparedStatement pst = null;
        String sql = "call crearFactura(?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, jTextFieldIDCliente.getText());
            pst.execute();
            con.commit();
            pst.close();
            nuevo();
            generarReporte();
        } catch (Exception e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + " Facturas");
            }
        }
    }

    private void procesoFacturacion() {
        Orden();
        //detalles();
        //factura();
        //nuevo();
        System.out.println("Factura generada con exito.");
    }

    private void nuevo() {
        try {
            jComboBoxMesa.setSelectedIndex(0);
            jTextFieldIDCliente.setText("");
            jTextFieldNombre.setText("");
            jTextFieldID.setText("");
            jTextFieldDescripcion.setText("");
            jTextFieldPrecio.setText("");
            jTextFieldCantidad.setText("");
            jTextFieldTotalAPagar.setText("");
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            //contFilas = 0;
        } catch (Exception e) {
        }
    }

    private void vaciar() {
        jTextFieldID.setText("");
        jTextFieldDescripcion.setText("");
        jTextFieldPrecio.setText("");
        jTextFieldCantidad.setText("");
    }

    private void tabla() {
        String[] columnas = {
            "ID", "DESCRIPCIÓN", "PRECIO", "CANTIDAD", "IMPORTE"
        };
        model = new DefaultTableModel(null, columnas);
        if (jTableOrders.getColumnModel().getColumnCount() > 0) {
            jTableOrders.getColumnModel().getColumn(0).setMinWidth(40);
            jTableOrders.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTableOrders.getColumnModel().getColumn(0).setMaxWidth(40);
            jTableOrders.getColumnModel().getColumn(1).setMinWidth(250);
            jTableOrders.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTableOrders.getColumnModel().getColumn(1).setMaxWidth(250);
            jTableOrders.getColumnModel().getColumn(3).setMinWidth(70);
            jTableOrders.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTableOrders.getColumnModel().getColumn(3).setMaxWidth(70);
        }
        jTableOrders.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        jTableOrders.setModel(model);
    }

    private void autoCompletarProducto() {
        try {
            String consulta = "SELECT * FROM productos WHERE cod = '" + jTextFieldID.getText()
                    + "'";
            SqlClass query = new SqlClass();
            LinkedList<String> rP = query.query(consulta);
            jTextFieldDescripcion.setText(rP.get(1));
            jTextFieldPrecio.setText(rP.get(2));
            jTextFieldDescripcion.setBackground(Color.white);
            jTextFieldPrecio.setBackground(Color.white);
        } catch (Exception e) {
        }
    }

    private String[] datos = null;

    public void setDatos(String[] datos) {
        this.datos = datos;
    }

    public void asignar() {
        if (datos != null) {
            jTextFieldID.setText(datos[0]);
            jTextFieldDescripcion.setText(datos[1]);
            jTextFieldPrecio.setText(datos[2]);
            jTextFieldID.setBackground(Color.white);
            jTextFieldDescripcion.setBackground(Color.white);
            jTextFieldPrecio.setBackground(Color.white);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonACliente;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonCProducts;
    private javax.swing.JButton jButtonCUsers;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonFacturar;
    private javax.swing.JButton jButtonMinimize;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JComboBox<String> jComboBoxMesa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelID;
    public javax.swing.JLabel jLabelLogotipo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jMoverVentana;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanelTopBar;
    public javax.swing.JPanel jPanelbar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableOrders;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldIDCliente;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldTotalAPagar;
    // End of variables declaration//GEN-END:variables
}
