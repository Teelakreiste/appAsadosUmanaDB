/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanadb.dao;

import appasadosumanadb.entity.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author osmel
 */
public class ClienteDAO {

    private String mensaje = "";
    
    public String agregarCliente(Connection con, Cliente cli) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO clientes (id, nombre) "
                + "VALUES (?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cli.getId());
            pst.setString(2, cli.getNombre());
            mensaje = "Guardado correctamente.";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje = "No sé pudo guardar el empleado. \nError: " + e.getMessage();
        }
        return mensaje;
    }
}
