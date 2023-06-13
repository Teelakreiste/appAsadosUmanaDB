/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanadb.bo;

import appasadosumanadb.dao.ClienteDAO;
import appasadosumanadb.db.Conexion;
import appasadosumanadb.entity.Cliente;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author osmel
 */
public class ClienteBO {
    private String mensaje = "";
    private ClienteDAO cDAO = new ClienteDAO();
    
    public String agregarCliente(Cliente cli) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cDAO.agregarCliente(conn, cli);
            conn.commit();
        } catch (Exception e) {
            mensaje += " " + e.getMessage();
            try {
                conn.rollback();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje += " " + e.getMessage();
            }
        }
        return mensaje;
    }
}
