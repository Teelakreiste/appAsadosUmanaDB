/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanabd.ui;

import appasadosumanadb.db.SqlClass;
import appasadosumanadb.entity.Controlador;
import appasadosumanadb.entity.PasswordGenerate;
import appasadosumanadb.entity.TextPrompt;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author osmel
 */
public class Users extends javax.swing.JFrame implements Runnable {

    private Thread hilo;
    private Controlador control;
    private int x, y;

    public Users(Controlador control) {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/logo/Logo_500x500.png")).getImage());
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        this.control = control;
        hilo = new Thread(this);
        hilo.start();
        etiquetas();
    }

    private void etiquetas() {
        TextPrompt id = new TextPrompt(" *Cédula", jTextFieldID);
        TextPrompt usuario = new TextPrompt(" *Usuario", jTextFieldUsuario);
        TextPrompt nombre = new TextPrompt(" *Nombre", jTextFieldNombre);
        TextPrompt apellido = new TextPrompt(" *Apellido", jTextFieldApellido);
        TextPrompt direccion = new TextPrompt(" Dirección", jTextFieldDireccion);
        TextPrompt telefono = new TextPrompt(" Teléfono", jTextFieldTelefono);
        TextPrompt celular = new TextPrompt(" *Celular", jTextFieldCelular);
        TextPrompt contra = new TextPrompt(" *Contraseña", jPassword);
    }

    private void estadoUsuario() {
        if (!control.isEstado()) {
            jButtonCFacturar.setVisible(false);
            jButtonCFacturar.setEnabled(false);
            jButtonCProducts.setVisible(false);
            jButtonCProducts.setEnabled(false);
        }
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
                if (jTextFieldUsuario.getText() != null && !jTextFieldUsuario.getText().equals("")) {
                    jLabelUsuario.setVisible(true);
                } else {
                    jLabelUsuario.setVisible(false);
                }
                if (jTextFieldNombre.getText() != null && !jTextFieldNombre.getText().equals("")) {
                    jLabelNombre.setVisible(true);
                } else {
                    jLabelNombre.setVisible(false);
                }
                if (jTextFieldApellido.getText() != null && !jTextFieldApellido.getText().equals("")) {
                    jLabelApellido.setVisible(true);
                } else {
                    jLabelApellido.setVisible(false);
                }
                if (jTextFieldDireccion.getText() != null && !jTextFieldDireccion.getText().equals("")) {
                    jLabelDireccion.setVisible(true);
                } else {
                    jLabelDireccion.setVisible(false);
                }
                if (jTextFieldTelefono.getText() != null && !jTextFieldTelefono.getText().equals("")) {
                    jLabelTelefono.setVisible(true);
                } else {
                    jLabelTelefono.setVisible(false);
                }
                if (jTextFieldCelular.getText() != null && !jTextFieldCelular.getText().equals("")) {
                    jLabelCelular.setVisible(true);
                } else {
                    jLabelCelular.setVisible(false);
                }
                if (jPassword.getPassword() != null && !jPassword.getPassword().equals("")) {
                    jLabelContra.setVisible(true);
                } else {
                    jLabelContra.setVisible(false);
                }
                hilo.sleep(100);
            } catch (Exception ex) {
            }
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
        jButtonCFacturar = new javax.swing.JButton();
        jMoverVentana = new javax.swing.JLabel();
        jPanelbar1 = new javax.swing.JPanel();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonVaciar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonDesactivar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonEditarUsu = new javax.swing.JButton();
        jLabelContra = new javax.swing.JLabel();
        jCheckBoxShowPasswordB = new javax.swing.JCheckBox();
        jPassword = new javax.swing.JPasswordField();
        jButtonEditarContra = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        jLabelCargo = new javax.swing.JLabel();
        jTextFieldCelular = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();

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
        jLabel4.setText("Gestión de usuarios");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 180, 20));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 101, 0));
        jLabel2.setText("ASADOS UMAÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 82, -1, -1));

        jPanel2.setBackground(new java.awt.Color(34, 34, 34));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBuscar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 30));

        jButtonVaciar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonVaciar.setText("Vaciar");
        jButtonVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVaciarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 30));

        jButtonCrear.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonCrear.setText("Crear");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 30));

        jButtonModificar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, 30));

        jButtonEliminar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, 30));

        jButtonDesactivar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButtonDesactivar.setText("Desactivar");
        jButtonDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesactivarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDesactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 160, 270));

        jPanel3.setBackground(new java.awt.Color(34, 34, 34));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsuario.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario");
        jPanel3.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 20));

        jTextFieldUsuario.setEditable(false);
        jTextFieldUsuario.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jPanel3.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, 30));

        jButtonEditarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/editarUsuaria.png"))); // NOI18N
        jButtonEditarUsu.setBorderPainted(false);
        jButtonEditarUsu.setFocusPainted(false);
        jButtonEditarUsu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/editarUsuaria.png"))); // NOI18N
        jButtonEditarUsu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/editarUsuaria_1.png"))); // NOI18N
        jButtonEditarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarUsuActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonEditarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 24, 24));

        jLabelContra.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelContra.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContra.setText("Contraseña");
        jPanel3.add(jLabelContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 70, 20));

        jCheckBoxShowPasswordB.setFocusPainted(false);
        jCheckBoxShowPasswordB.setFocusable(false);
        jCheckBoxShowPasswordB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/unhide_b.png"))); // NOI18N
        jCheckBoxShowPasswordB.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/unhide_b_1.png"))); // NOI18N
        jCheckBoxShowPasswordB.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/hide_b_1.png"))); // NOI18N
        jCheckBoxShowPasswordB.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/hide_b.png"))); // NOI18N
        jCheckBoxShowPasswordB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowPasswordBActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBoxShowPasswordB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 10, 10));

        jPassword.setEditable(false);
        jPassword.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jPassword.setEchoChar('\u2022');
        jPassword.setSelectionColor(new java.awt.Color(255, 101, 0));
        jPanel3.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 250, 30));

        jButtonEditarContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/editar.png"))); // NOI18N
        jButtonEditarContra.setBorderPainted(false);
        jButtonEditarContra.setFocusPainted(false);
        jButtonEditarContra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/editar.png"))); // NOI18N
        jButtonEditarContra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/editar_1.png"))); // NOI18N
        jButtonEditarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarContraActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonEditarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 24, 24));

        jTextFieldID.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jTextFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIDKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, 30));

        jLabelID.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID.setText("Cédula");
        jPanel3.add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 20));

        jTextFieldNombre.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 250, 30));

        jLabelNombre.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");
        jPanel3.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 80, 20));

        jLabelApellido.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellido.setText("Apellido");
        jPanel3.add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 20));

        jTextFieldApellido.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 250, 30));

        jTextFieldTelefono.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jPanel3.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 250, 30));

        jLabelTelefono.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefono.setText("Teléfono");
        jPanel3.add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 50, 20));

        jTextFieldDireccion.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldDireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jPanel3.add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 530, 30));

        jLabelDireccion.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDireccion.setText("Dirección");
        jPanel3.add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 60, 20));

        jComboBoxCargo.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Establecer cargo", "Chef", "Cajero", "Mesero", "Gerente" }));
        jComboBoxCargo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jPanel3.add(jComboBoxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 250, -1));

        jLabelCargo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelCargo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCargo.setText("Cargo");
        jPanel3.add(jLabelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, 20));

        jTextFieldCelular.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldCelular.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jTextFieldCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCelularKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 250, 30));

        jLabelCelular.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelCelular.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCelular.setText("Celular");
        jPanel3.add(jLabelCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 50, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 570, 310));

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

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        this.dispose();
        control.getvLogin().setVisible(true);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jButtonCFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCFacturarActionPerformed
        this.dispose();
        if (control.getvBill() == null) {
            control.setvBill(new Bill(control));
        }
        control.getvBill().setVisible(true);
    }//GEN-LAST:event_jButtonCFacturarActionPerformed

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
    private SearchUser vSUser;
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        vSUser = new SearchUser(this, true, control);
        vSUser.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private String[] datos = null;

    public void setDatos(String[] datos) {
        this.datos = datos;
    }

    public void asignar() {
        if (datos != null) {
            jTextFieldID.setText(datos[0]);
            jTextFieldNombre.setText(datos[1]);
            jTextFieldApellido.setText(datos[2]);
            jTextFieldDireccion.setText(datos[3]);
            jTextFieldCelular.setText(datos[4]);
            jTextFieldTelefono.setText(datos[5]);
            jComboBoxCargo.setSelectedItem(datos[6]);
            if (datos[7] == null) {
                jTextFieldUsuario.setText("");
            } else {
                jTextFieldUsuario.setText(datos[7]);
            }
            if (datos[8] == null) {
                jPassword.setText("");
            } else {
                jPassword.setText(datos[8]);
            }
        }
    }

    private void camposObligatorios() {
        jTextFieldID.setBackground(Color.decode("#FF9966"));
        jTextFieldNombre.setBackground(Color.decode("#FF9966"));
        jTextFieldApellido.setBackground(Color.decode("#FF9966"));
        jTextFieldCelular.setBackground(Color.decode("#FF9966"));
        jComboBoxCargo.setBackground(Color.decode("#FF9966"));
    }
    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        if (jTextFieldID.getText().isEmpty() || jTextFieldNombre.getText().isEmpty() || jTextFieldApellido.getText().isEmpty()
                || jTextFieldCelular.getText().isEmpty() || jComboBoxCargo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos");
            camposObligatorios();
        } else {
            userGenerate();
            PasswordGenerate pw = new PasswordGenerate();
            jPassword.setText(pw.passwordGenerate());
            agregar();
        }
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        if (jTextFieldID.getText().isEmpty() || jTextFieldNombre.getText().isEmpty() || jTextFieldApellido.getText().isEmpty()
                || jTextFieldCelular.getText().isEmpty() || jComboBoxCargo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos");
            camposObligatorios();
        } else {
            modificar();
        }
        if (!jTextFieldID.getText().isEmpty()) {
            if (comprobarAcc()) {
                control.insetarAccUser();
            }
        }
        vaciar();
    }//GEN-LAST:event_jButtonModificarActionPerformed
    public boolean comprobarAcc() {
        boolean validar = false;
        SqlClass query = new SqlClass();
        String consulta = "select id from accesos where id = '"
                + jTextFieldID.getText() + "'";
        LinkedList<String> result = query.query(consulta);
        try {
            if (result == null) {
                validar = true;
            } else {
                validar = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return validar;
    }

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if (jTextFieldID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el id");
            jTextFieldID.setBackground(Color.decode("#FF9966"));
        } else {
            eliminar(jTextFieldID.getText());
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVaciarActionPerformed
        vaciar();
    }//GEN-LAST:event_jButtonVaciarActionPerformed

    private void jCheckBoxShowPasswordBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPasswordBActionPerformed
        hideUnhide(jCheckBoxShowPasswordB);
    }//GEN-LAST:event_jCheckBoxShowPasswordBActionPerformed

    private void jButtonEditarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarContraActionPerformed
        if (confirmacion()) {
            jPassword.setEditable(true);
        } else {
            jPassword.setEditable(false);
        }
    }//GEN-LAST:event_jButtonEditarContraActionPerformed

    private void jButtonEditarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarUsuActionPerformed
        if (confirmacion()) {
            jTextFieldUsuario.setEditable(true);
        } else {
            jTextFieldUsuario.setEditable(false);
        }
    }//GEN-LAST:event_jButtonEditarUsuActionPerformed

    private void jButtonDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesactivarActionPerformed
        if (jTextFieldID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el id");
            jTextFieldID.setBackground(Color.decode("#FF9966"));
        } else {
            desactivar(jTextFieldID.getText());
        }
    }//GEN-LAST:event_jButtonDesactivarActionPerformed

    private void jTextFieldIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDKeyTyped
        if (!jTextFieldID.getText().isEmpty()) {
            jTextFieldID.setBackground(Color.white);
        }
    }//GEN-LAST:event_jTextFieldIDKeyTyped

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        if (!jTextFieldNombre.getText().isEmpty()) {
            jTextFieldNombre.setBackground(Color.white);
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
        if (!jTextFieldApellido.getText().isEmpty()) {
            jTextFieldApellido.setBackground(Color.white);
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    private void jTextFieldCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCelularKeyTyped
        if (!jTextFieldCelular.getText().isEmpty()) {
            jTextFieldCelular.setBackground(Color.white);
        }
    }//GEN-LAST:event_jTextFieldCelularKeyTyped

    public boolean confirmacion() {
        boolean validar = false;
        SqlClass query = new SqlClass();
        String consulta = "select contra from accesos where empleadoId = '"
                + control.getEmp() + "'";
        LinkedList<String> result = query.query(consulta);
        String pass = JOptionPane.showInputDialog(this, "Ingrese su contraseña", "Confirmación", JOptionPane.PLAIN_MESSAGE);
        if (pass.equals(result.getFirst())) {
            validar = true;
        } else {
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta...");
            validar = false;
        }
        return validar;
    }

    private void hideUnhide(JCheckBox x) {
        if (x.isSelected()) {
            jPassword.setEchoChar((char) 0);
        } else {
            jPassword.setEchoChar('\u2022');
        }
    }

    private void eliminar(String id) {
        try {
            control.eliminarUsuario(id);
            vaciar();
        } catch (Exception e) {
        }
    }

    private void desactivar(String id) {
        try {
            control.desactivarUsuario(id);
            vaciar();
        } catch (Exception e) {
        }
    }

    private void modificar() {
        try {
            control.setUser(jTextFieldID.getText(), jTextFieldNombre.getText(), jTextFieldApellido.getText(), jTextFieldDireccion.getText(),
                    jTextFieldCelular.getText(), jTextFieldTelefono.getText(), jComboBoxCargo.getSelectedItem().toString(), jTextFieldUsuario.getText(),
                    jPassword.getText());
            control.modificarUser();
        } catch (Exception e) {
        }
    }

    private void userGenerate() {
        try {
            String usuario = "";
            Random rnd = new Random();
            boolean x = false;
            int max = jTextFieldNombre.getText().length() + jTextFieldApellido.getText().length();
            if (max < 15) {
                usuario = jTextFieldNombre.getText() + jTextFieldApellido.getText();
                max = 15 - max;
                x = true;
            } else {
                max = 15;
            }
            for (int i = 0; i < max; i++) {
                if (i < 3 && !x) {
                    usuario += jTextFieldNombre.getText().charAt(i);
                } else if (i < 8 && !x) {
                    usuario += jTextFieldApellido.getText().charAt(i);
                } else if (i < 15) {
                    usuario += rnd.nextInt(10);
                }
            }
            //System.out.println(usuario);
            jTextFieldUsuario.setText(usuario);
        } catch (Exception e) {
        }
    }

    private void agregar() {
        try {
            control.setUser(jTextFieldID.getText(), jTextFieldNombre.getText(), jTextFieldApellido.getText(), jTextFieldDireccion.getText(),
                    jTextFieldCelular.getText(), jTextFieldTelefono.getText(), jComboBoxCargo.getSelectedItem().toString(), jTextFieldUsuario.getText(),
                    jPassword.getText());

            control.insetarUser();
            vaciar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void vaciar() {
        jTextFieldID.setText("");
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldCelular.setText("");
        jTextFieldTelefono.setText("");
        jComboBoxCargo.setSelectedIndex(0);
        jTextFieldUsuario.setText("");
        jPassword.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCFacturar;
    private javax.swing.JButton jButtonCProducts;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonDesactivar;
    private javax.swing.JButton jButtonEditarContra;
    private javax.swing.JButton jButtonEditarUsu;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonMinimize;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonVaciar;
    private javax.swing.JCheckBox jCheckBoxShowPasswordB;
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelContra;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelID;
    public javax.swing.JLabel jLabelLogotipo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jMoverVentana;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanelTopBar;
    public javax.swing.JPanel jPanelbar1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
