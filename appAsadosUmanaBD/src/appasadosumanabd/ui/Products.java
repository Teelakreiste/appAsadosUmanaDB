/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanabd.ui;
import appasadosumanadb.bo.ProductBO;
import appasadosumanadb.entity.Controlador;
import appasadosumanadb.entity.Product;
import appasadosumanadb.entity.TextPrompt;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author osmel
 */
public class Products extends javax.swing.JFrame implements Runnable{
    private Thread hilo;
    private Controlador control;
    private int x, y;
    public Products(Controlador control) {
        initComponents();
        //setOpacity(0.9f);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/logo/Logo_500x500.png")).getImage());
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        etiquetas();
        this.control = control;
        hilo = new Thread(this);
        hilo.start();
        mostrar();
        jTableProductos.setDefaultEditor(Object.class, null);
    }
    
    private void etiquetas() {
        TextPrompt id = new TextPrompt(" Código", jTextFieldID);
        TextPrompt descripcion = new TextPrompt(" Nombre", jTextFieldDescripcion);
        TextPrompt precio = new TextPrompt(" Precio", jTextFieldPrecio);
        TextPrompt buscar = new TextPrompt(" Buscar...", jTextFieldBuscar);
    }
    
    public void ocultar() {
        jLabelID.setVisible(false);
        jLabelDescripcion.setVisible(false);
        jLabelPrecio.setVisible(false);
        jTextFieldID.setVisible(false);
        jTextFieldDescripcion.setVisible(false);
        jTextFieldPrecio.setVisible(false);
        jButtonAgregar.setVisible(false);
        jButtonEliminar.setVisible(false);
        jButtonCFacturar.setVisible(false);
        jButtonCUsers.setVisible(false);
        jButtonExit.setVisible(false);
        jButtonCerrarSesion.setVisible(false);
        jButtonModificar.setVisible(true);
        jButtonModificar.setEnabled(true);
    }
    
    public void run() {
        while (true) {
            estadoUsuario();
            try {
                if (jTextFieldID.getText() != null && !jTextFieldID.getText().equals("")) {
                    jLabelID.setVisible(true);
                } else {
                    jLabelID.setVisible(false);
                }
                if (jTextFieldDescripcion.getText() != null && !jTextFieldDescripcion.getText().equals("")) {
                    jLabelID.setVisible(true);
                } else {
                    jLabelDescripcion.setVisible(false);
                }
                if (jTextFieldPrecio.getText() != null && !jTextFieldPrecio.getText().equals("")) {
                    jLabelDescripcion.setVisible(true);
                } else {
                    jLabelPrecio.setVisible(false);
                }
                hilo.sleep(50);
            } catch (Exception ex) {
            }
        }
    }
    
    private void estadoUsuario() {
        if (!control.isEstado()) {
            jButtonCUsers.setVisible(false);
            jButtonCUsers.setEnabled(false);
            jButtonCFacturar.setVisible(false);
            jButtonCFacturar.setEnabled(false);
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
        jButtonCFacturar = new javax.swing.JButton();
        jButtonCUsers = new javax.swing.JButton();
        jMoverVentana = new javax.swing.JLabel();
        jPanelbar1 = new javax.swing.JPanel();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jTextFieldID = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonVaciar = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();

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

        jButtonCFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/factura.png"))); // NOI18N
        jButtonCFacturar.setBorderPainted(false);
        jButtonCFacturar.setFocusPainted(false);
        jButtonCFacturar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/factura.png"))); // NOI18N
        jButtonCFacturar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/factura_1.png"))); // NOI18N
        jButtonCFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCFacturarActionPerformed(evt);
            }
        });
        jPanelTopBar.add(jButtonCFacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 24, 24));

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
        jPanelTopBar.add(jButtonCUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 24, 24));

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

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gestión de productos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 180, 20));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 101, 0));
        jLabel2.setText("ASADOS UMAÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        jTableProductos.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 470, 270));

        jTextFieldID.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jPanel1.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 250, 30));

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
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 24, 24));

        jTextFieldBuscar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 330, 24));

        jLabelID.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID.setText("Código");
        jPanel1.add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 40, 20));

        jTextFieldDescripcion.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldDescripcion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jPanel1.add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 250, 30));

        jLabelDescripcion.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion.setText("Descripción");
        jPanel1.add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 80, 20));

        jLabelPrecio.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setText("Precio");
        jPanel1.add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 40, 20));

        jTextFieldPrecio.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jPanel1.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 250, 30));

        jButtonAgregar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, 30));

        jButtonEliminar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 80, 30));

        jButtonModificar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 370, 80, 30));

        jButtonVaciar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonVaciar.setText("Vaciar");
        jButtonVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVaciarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 250, 20));

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/Logo 3000x3000.png"))); // NOI18N
        jPanel1.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 240, 220));

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

    private void jButtonCFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCFacturarActionPerformed
        this.dispose();
        if (control.getvBill()== null) {
            control.setvBill(new Bill(control));
        }
        control.getvBill().setVisible(true);
    }//GEN-LAST:event_jButtonCFacturarActionPerformed

    private void jButtonCUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCUsersActionPerformed
        this.dispose();
        if (control.getvUsers() == null) {
            control.setvUsers(new Users(control));
        }
        control.getvUsers().setVisible(true);
    }//GEN-LAST:event_jButtonCUsersActionPerformed

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

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        if (jTextFieldID.getText().isEmpty() || jTextFieldDescripcion.getText().isEmpty() || jTextFieldPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos");
        } else {
            agregar();
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        if (jTextFieldID.getText().isEmpty() || jTextFieldDescripcion.getText().isEmpty() || jTextFieldPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos");
        } else {
            modificar();
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if (jTextFieldID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el código a borrar");
        } else {
            eliminar(jTextFieldID.getText());
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if (jTextFieldBuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el ID o Nombre a buscar");
            mostrar();
        } else {
            buscar();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyPressed
        buscar();
    }//GEN-LAST:event_jTextFieldBuscarKeyPressed

    private void jTableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductosMouseClicked
        int seleccion = jTableProductos.rowAtPoint(evt.getPoint());
        jTextFieldID.setText(jTableProductos.getValueAt(seleccion, 0) + "");
        jTextFieldDescripcion.setText(jTableProductos.getValueAt(seleccion, 1) + "");
        jTextFieldPrecio.setText(jTableProductos.getValueAt(seleccion, 2) + "");
    }//GEN-LAST:event_jTableProductosMouseClicked

    private void jButtonVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVaciarActionPerformed
        vaciar();
    }//GEN-LAST:event_jButtonVaciarActionPerformed
    
    public void buscar() {
        control.buscarProdcuto(jTableProductos, jTextFieldBuscar.getText());
    }
    
    public void mostrar() {
        control.mostrarProdcuto(jTableProductos);
    }
    
    private void eliminar(String codigo) {
        try {
            control.eliminarProducto(codigo);
            mostrar();
            vaciar();
        } catch (Exception e) {
        }
    }
    
    private void modificar() {
        try {
            control.setProd(jTextFieldID.getText(), jTextFieldDescripcion.getText(), Double.parseDouble(jTextFieldPrecio.getText()));
            control.modificarProducto();
            mostrar();
            vaciar();
        } catch (Exception e) {
        }
    }
    
    private void agregar () {
        try {
            control.setProd(jTextFieldID.getText(), jTextFieldDescripcion.getText(), Double.parseDouble(jTextFieldPrecio.getText()));
            control.insetarProducto();
            mostrar();
            vaciar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void vaciar() {
        jTextFieldID.setText("");
        jTextFieldDescripcion.setText("");
        jTextFieldPrecio.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCFacturar;
    private javax.swing.JButton jButtonCUsers;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonMinimize;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonVaciar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelLogo;
    public javax.swing.JLabel jLabelLogotipo;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jMoverVentana;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanelTopBar;
    public javax.swing.JPanel jPanelbar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
