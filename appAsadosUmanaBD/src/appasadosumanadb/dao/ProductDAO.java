/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanadb.dao;

import appasadosumanadb.entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author osmel
 */
public class ProductDAO {

    private String mensaje = "";

    public String agregarProducto(Connection con, Product prod) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO productos (cod, nombre, precio) VALUES (?,?,?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, prod.getCodigo());
            pst.setString(2, prod.getNombre());
            pst.setDouble(3, prod.getPrecio());
            mensaje = "Guardado correctamente.";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje = "No sé pudo guardar el producto. \nError: " + e.getMessage();
        }
        return mensaje;
    }

    public String modificarProducto(Connection con, Product prod) {
        PreparedStatement pst = null;
        String sql = "UPDATE productos SET cod = ?, nombre = ?, precio = ? WHERE cod = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, prod.getCodigo());
            pst.setString(2, prod.getNombre());
            pst.setDouble(3, prod.getPrecio());
            pst.setString(4, prod.getCodigo());
            mensaje = "Actualizado correctamente.";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje = "No sé pudo actualizar el producto. \nError: " + e.getMessage();
        }
        return mensaje;
    }

    public String eliminarProducto(Connection con, String codigo) {
        PreparedStatement pst = null;
        String sql = "DELETE FROM productos WHERE cod = ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, codigo);
            mensaje = "Producto eliminado correctamente.";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje = "No sé pudo eliminar el producto. \nError: " + e.getMessage();
        }
        return mensaje;
    }

    public void mostrarProducto(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"Código", "Descripción", "Precio"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM productos ORDER BY cod ASC";
        String[] filas = new String[3];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 3; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
    }
    
    public void buscarProducto(Connection con, JTable tabla, String x) {
        DefaultTableModel model;
        String[] columnas = {"Código", "Descripción", "Precio"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM productos WHERE cod Like '"+ x +"%' or nombre Like '"+ x +"%'";
        String[] filas = new String[3];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 3; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
    }
}
