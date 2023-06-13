/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanabd.ui;

import appasadosumanadb.db.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author osmel
 */
public class ViewBill extends javax.swing.JDialog {

    /**
     * Creates new form ViewBill
     *
     * @param parent
     * @param modal
     * @param nombre
     * @param emp
     * @param total
     */
    public ViewBill(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mostrarTodo();
    }
    String numFac = "";

    public void mostrarTodo() {
        try {
            detalles();
            productos(jTableProductos);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void detalles() {
        try {
            Connection con = Conexion.getConnection();
            CallableStatement cst = null;
            String sql = "{call datosFactura(?,?,?,?,?,?)}";
            try {
                cst = con.prepareCall(sql);
                cst.registerOutParameter(1, java.sql.Types.VARCHAR);
                cst.registerOutParameter(2, java.sql.Types.VARCHAR);
                cst.registerOutParameter(3, java.sql.Types.VARCHAR);
                cst.registerOutParameter(4, java.sql.Types.VARCHAR);
                cst.registerOutParameter(5, java.sql.Types.VARCHAR);
                cst.registerOutParameter(6, java.sql.Types.VARCHAR);
                cst.execute();
                numFac = cst.getString(1);
                jTextFieldNumFac.setText(numFac);
                jTextFieldEmp.setText(cst.getString(2) + " " + cst.getString(3));
                jTextFieldFecha.setText(cst.getString(4));
                jTextFieldTotalAPagar.setText(cst.getString(5));
                jTextFieldCliente.setText(cst.getString(6));
                cst.close();
                con.close();
            } catch (Exception e) {
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void productos(JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"Nombre", "Cantidad", "Precio", "Importe"};
        model = new DefaultTableModel(null, columnas);

        String sql = "select nombre, cantidad, precio, cantidad * precio "
                + "from detalles_ordenes inner join productos on cod = codproducto "
                + "where numeroOrden = '" + numFac + "'";
        Connection con = Conexion.getConnection();
        String[] filas = new String[4];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 4; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelTopBar = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();
        jLabelLogotipo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelbar1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldNumFac = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldEmp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTotalAPagar = new javax.swing.JTextField();
        jLabelLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTopBar.setBackground(new java.awt.Color(255, 101, 0));
        jPanelTopBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jPanelTopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanelbar1.setBackground(new java.awt.Color(255, 101, 0));
        jPanelbar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(34, 34, 34));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gracias por escoger Asados Umaña.");
        jPanelbar1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jPanel1.add(jPanelbar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 800, 30));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 101, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRODUCTOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 470, -1));

        jTableProductos.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 470, 240));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cliente:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 50, 20));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 40, 20));

        jTextFieldCliente.setEditable(false);
        jTextFieldCliente.setBackground(new java.awt.Color(34, 34, 34));
        jTextFieldCliente.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jTextFieldCliente.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCliente.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextFieldCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 101, 0), 2, true));
        jPanel1.add(jTextFieldCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 170, 30));

        jTextFieldNumFac.setEditable(false);
        jTextFieldNumFac.setBackground(new java.awt.Color(34, 34, 34));
        jTextFieldNumFac.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jTextFieldNumFac.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNumFac.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextFieldNumFac.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 101, 0), 2, true));
        jPanel1.add(jTextFieldNumFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 50, 30));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Atendido por:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 80, 20));

        jTextFieldFecha.setEditable(false);
        jTextFieldFecha.setBackground(new java.awt.Color(34, 34, 34));
        jTextFieldFecha.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jTextFieldFecha.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldFecha.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextFieldFecha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 101, 0), 2, true));
        jPanel1.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 120, 30));

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("N°");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 20, 20));

        jTextFieldEmp.setEditable(false);
        jTextFieldEmp.setBackground(new java.awt.Color(34, 34, 34));
        jTextFieldEmp.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jTextFieldEmp.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEmp.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextFieldEmp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 101, 0), 2, true));
        jPanel1.add(jTextFieldEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 170, 30));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 375, 40, 20));

        jTextFieldTotalAPagar.setEditable(false);
        jTextFieldTotalAPagar.setBackground(new java.awt.Color(255, 102, 51));
        jTextFieldTotalAPagar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jTextFieldTotalAPagar.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldTotalAPagar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextFieldTotalAPagar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 101, 0), 2, true));
        jPanel1.add(jTextFieldTotalAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 200, 30));

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appasadosumanabd/img/Logo 3000x3000.png"))); // NOI18N
        jPanel1.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 240, 220));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 101, 0));
        jLabel3.setText("ASADOS UMAÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Facturación");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 180, 20));

        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Lista de");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 98, 470, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLogo;
    public javax.swing.JLabel jLabelLogotipo;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanelTopBar;
    public javax.swing.JPanel jPanelbar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldEmp;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNumFac;
    private javax.swing.JTextField jTextFieldTotalAPagar;
    // End of variables declaration//GEN-END:variables
}
