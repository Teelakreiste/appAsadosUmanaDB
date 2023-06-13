/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanadb.dao;

import appasadosumanadb.entity.User;
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
public class UserDAO {

    private String mensaje = "";

    public String agregarUser(Connection con, User us) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO empleados (id, nombre, apellido, direccion, celular, telefono, cargo) "
                + "VALUES (?,?,?,?,?,?,?)";
        String sql1 = "INSERT INTO accesos (empleadoId, usuario, contra) VALUES (?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, us.getId());
            pst.setString(2, us.getNombre());
            pst.setString(3, us.getApellido());
            pst.setString(4, us.getDireccion());
            pst.setString(5, us.getCelular());
            pst.setString(6, us.getTelefono());
            pst.setString(7, us.getCargo());
            mensaje = "Guardado correctamente.";
            pst.execute();
            pst.close();
            pst = con.prepareStatement(sql1);
            pst.setString(1, us.getId());
            pst.setString(2, us.getUsuario());
            pst.setString(3, us.getContra());
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje = "No sé pudo guardar el empleado. \nError: " + e.getMessage();
        }
        return mensaje;
    }

    public String agregarAccUser(Connection con, User us) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO accesos (empleadoId, usuario, contra) VALUES (?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, us.getId());
            pst.setString(2, us.getUsuario());
            pst.setString(3, us.getContra());
            mensaje = "Guardado correctamente.";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje = "No sé pudo guardar el empleado. \nError: " + e.getMessage();
        }
        return mensaje;
    }

    public String modificarUser(Connection con, User us) {
        PreparedStatement pst = null;
        String sql = "UPDATE empleados SET id = ?, nombre = ?, apellido = ?, direccion = ?, celular = ?, telefono = ?, cargo = ?"
                + " WHERE id = ?";
        String sql1 = "UPDATE accesos SET empleadoId = ?, usuario = ?, contra = ? WHERE empleadoId = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, us.getId());
            pst.setString(2, us.getNombre());
            pst.setString(3, us.getApellido());
            pst.setString(4, us.getDireccion());
            pst.setString(5, us.getCelular());
            pst.setString(6, us.getTelefono());
            pst.setString(7, us.getCargo());
            pst.setString(8, us.getId());
            mensaje = "Actualizado correctamente.";
            pst.execute();
            pst.close();
            pst = con.prepareStatement(sql1);
            pst.setString(1, us.getId());
            pst.setString(2, us.getUsuario());
            pst.setString(3, us.getContra());
            pst.setString(4, us.getId());
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje = "No sé pudo actualizar el empleado. \nError: " + e.getMessage();
        }
        return mensaje;
    }

    public String eliminarUser(Connection con, String id) {
        PreparedStatement pst = null;
        String sql1 = "DELETE FROM empleados WHERE id = ?";
        String sql = "DELETE FROM accesos WHERE empleadoId = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, id);
            mensaje = "Empleado eliminado correctamente.";
            pst.execute();
            pst.close();
            pst = con.prepareStatement(sql1);
            pst.setString(1, id);
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje = "No sé pudo eliminar el empleado. \nError: " + e.getMessage();
        }
        return mensaje;
    }

    public String desactivarUser(Connection con, String id) {
        PreparedStatement pst = null;
        String sql = "DELETE FROM accesos WHERE empleadoId = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, id);
            mensaje = "Empleado desactivado correctamente.";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje = "No sé pudo desactivar el empleado. \nError: " + e.getMessage();
        }
        return mensaje;
    }

    public void mostrarUser(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"Id", "Nombre", "Apellido", "Direccion", "Celular", "Teléfono", "Cargo", "Usuario", "Contraseña"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT id, nombre, apellido, direccion, celular, telefono, cargo, usuario, contra "
                + "FROM empleados FULL OUTER JOIN accesos ON empleadoId = id ORDER BY id ASC";
        String[] filas = new String[9];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 9; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
    }

    public void buscarUser(Connection con, JTable tabla, String x) {
        DefaultTableModel model;
        String[] columnas = {"Id", "Nombre", "Apellido", "Direccion", "Celular", "Teléfono", "Cargo", "Usuario", "Contraseña"};
        model = new DefaultTableModel(null, columnas);
        String sql = "SELECT id, nombre, apellido, direccion, celular, telefono, cargo, usuario, contra "
                + "FROM empleados FULL OUTER JOIN accesos ON empleadoId = id "
                + "WHERE id Like '" + x + "%' or nombre Like '" + x + "%' or apellido Like '" + x + "%' or cargo Like '" + x + "%' ORDER BY id ASC";
        String[] filas = new String[9];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 9; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
    }
}
