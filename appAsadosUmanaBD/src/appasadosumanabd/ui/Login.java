/*
 * jdbc:oracle:thin:@localhost:1521:XE [uAsados on Default schema]
 */
package appasadosumanabd.ui;

import appasadosumanadb.db.SqlClass;
import appasadosumanadb.entity.Controlador;
import appasadosumanadb.entity.TextPrompt;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author osmel
 */
public class Login extends javax.swing.JFrame implements Runnable {

    private Thread hilo;

    public Login() {
        initComponents();
        //Esteblecer transparencia al Jframe
        //setOpacity(0.9f);
        //Quitar fondo del Jframe
        AWTUtilities.setWindowOpaque(this, false);
        //Centrar Jframe
        setLocationRelativeTo(null);
        //Establecer un icono al Jframe
        setIconImage(new ImageIcon(getClass().getResource("/logo/Logo_500x500.png")).getImage());
        //Redondear las esquinas del Jframe
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        TextPrompt user = new TextPrompt(" Usuario", jTextFieldUser);
        TextPrompt password = new TextPrompt(" Contraseña", jPassword);
        //jLabelLogo.setVisible(false);
        //jLabelLogo.setEnabled(false);
        jLabelLogotipo.setVisible(false);
        jSeparator1.setVisible(false);
        jLabelUser.setVisible(false);
        jLabelPassword.setVisible(false);
        jCheckBoxShowPasswordN.setEnabled(false);
        jCheckBoxShowPasswordN.setVisible(false);
        hilo = new Thread(this);
        hilo.start();
    }

    private Controlador control = new Controlador();
    private SqlClass query = new SqlClass();

    private int x, y;

    public void run() {
        while (true) {
            try {
                if (jTextFieldUser.getText() != null && !jTextFieldUser.getText().equals("")) {
                    jLabelUser.setVisible(true);
                } else {
                    jLabelUser.setVisible(false);
                }
                if (jPassword.getText() != null && !jPassword.getText().equals("")) {
                    jLabelPassword.setVisible(true);
                } else {
                    jLabelPassword.setVisible(false);
                }

                hilo.sleep(100);
            } catch (Exception ex) {
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelTopBar = new javax.swing.JPanel();
        jButtonMinimize = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabelLogotipo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMoverVentana = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jCheckBoxShowPasswordB = new javax.swing.JCheckBox();
        jPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPanelBottomBar = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jCheckBoxShowPasswordN = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabelPassword = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelBackground.setBackground(new java.awt.Color(34, 34, 34));
        jPanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanelBackground.add(jPanelTopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 101, 0));
        jLabel2.setText("ASADOS UMAÑA");
        jPanelBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jTextFieldUser.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jTextFieldUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jTextFieldUser.setSelectionColor(new java.awt.Color(255, 101, 0));
        jTextFieldUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUserKeyTyped(evt);
            }
        });
        jPanelBackground.add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 240, 40));

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
        jPanelBackground.add(jCheckBoxShowPasswordB, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 325, 10, 10));

        jPassword.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 101, 0)));
        jPassword.setEchoChar('\u2022');
        jPassword.setSelectionColor(new java.awt.Color(255, 101, 0));
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordKeyTyped(evt);
            }
        });
        jPanelBackground.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 240, 40));

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bievenidos a");
        jPanelBackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 100, 20));

        jPanelBottomBar.setBackground(new java.awt.Color(255, 101, 0));
        jPanelBottomBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelBackground.add(jPanelBottomBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 800, 30));

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/Logo 3000x3000.png"))); // NOI18N
        jPanelBackground.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 220, 220));

        jCheckBoxShowPasswordN.setFocusPainted(false);
        jCheckBoxShowPasswordN.setFocusable(false);
        jCheckBoxShowPasswordN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/unhide10x10.png"))); // NOI18N
        jCheckBoxShowPasswordN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/unhide10x10_1.png"))); // NOI18N
        jCheckBoxShowPasswordN.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/hide10x10_1.png"))); // NOI18N
        jCheckBoxShowPasswordN.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/hide10x10.png"))); // NOI18N
        jCheckBoxShowPasswordN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowPasswordNActionPerformed(evt);
            }
        });
        jPanelBackground.add(jCheckBoxShowPasswordN, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 325, 10, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/login.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/login.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/login_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 50, 50));

        jLabelPassword.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Contraseña");
        jPanelBackground.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 294, -1, -1));

        jLabelUser.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.setText("Usuario");
        jPanelBackground.add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 234, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizeActionPerformed
        //Minimizar ventana
        setState(this.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizeActionPerformed

    private void jCheckBoxShowPasswordNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPasswordNActionPerformed
        hideUnhide(jCheckBoxShowPasswordN);
    }//GEN-LAST:event_jCheckBoxShowPasswordNActionPerformed

    private void hideUnhide(JCheckBox x) {
        if (x.isSelected()) {
            jPassword.setEchoChar((char) 0);
        } else {
            jPassword.setEchoChar('\u2022');
        }
    }

    private void jCheckBoxShowPasswordBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPasswordBActionPerformed
        hideUnhide(jCheckBoxShowPasswordB);
    }//GEN-LAST:event_jCheckBoxShowPasswordBActionPerformed

    //Obtener la posición X y Y del Mouse
    private void jMoverVentanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMoverVentanaMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jMoverVentanaMousePressed
    //Mover la localicación del Jframe a las posiciones X y Y
    private void jMoverVentanaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMoverVentanaMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jMoverVentanaMouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jTextFieldUser.getText().isEmpty() && !jPassword.getText().isEmpty()) {
            validar();
        } else {
            if (jTextFieldUser.getText().isEmpty()) {
                jTextFieldUser.setBackground(Color.decode("#FF9966"));
            }
            if (jPassword.getText().isEmpty()) {
                jCheckBoxShowPasswordB.setVisible(false);
                jPassword.setBackground(Color.decode("#FF9966"));
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUserKeyTyped
        if (!jTextFieldUser.getText().isEmpty()) {
            jTextFieldUser.setBackground(Color.white);
        }
    }//GEN-LAST:event_jTextFieldUserKeyTyped

    private void jPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyTyped
        if (!jPassword.getText().isEmpty()) {
            jPassword.setBackground(Color.white);
            jCheckBoxShowPasswordB.setVisible(true);
        }
    }//GEN-LAST:event_jPasswordKeyTyped
    
    private void validar() {
        try {
            String consulta = "select contra, id, cargo from accesos inner join empleados on id = empleadoId where usuario = '"
                    + jTextFieldUser.getText() + "'";
            LinkedList<String> result = query.query(consulta);
            char[] arrayC = jPassword.getPassword();
            String pass = new String(arrayC);
            if (pass.equals(result.getFirst())) {
                control.setEmp(result.get(1));
                this.dispose();
                control.setvLogin(this);
                if (result.getLast().equals("Gerente")) {
                    control.setvAdmin(new Admin(control));
                    control.setEstado(true);
                    control.getvAdmin().setVisible(true);
                } else {
                    control.setvBill(new Bill(control));
                    control.setEstado(false);
                    control.getvBill().setVisible(true);
                }
                jTextFieldUser.setText("");
                jPassword.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos...");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El usuario no existe...");
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonMinimize;
    private javax.swing.JCheckBox jCheckBoxShowPasswordB;
    private javax.swing.JCheckBox jCheckBoxShowPasswordN;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelLogo;
    public javax.swing.JLabel jLabelLogotipo;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jMoverVentana;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelBottomBar;
    private javax.swing.JPanel jPanelTopBar;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
