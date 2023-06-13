/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanadb.bo;

import appasadosumanadb.dao.ProductDAO;
import appasadosumanadb.db.Conexion;
import appasadosumanadb.entity.Product;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author osmel
 */
public class ProductBO {
    private String mensaje = "";
    private ProductDAO pDAO = new ProductDAO();
    
    public String agregarProducto(Product prod) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = pDAO.agregarProducto(conn, prod);
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
    
    public String modificarProducto(Product prod) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = pDAO.modificarProducto(conn, prod);
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
    
    public String eliminarProducto(String codigo) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = pDAO.eliminarProducto(conn, codigo);
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
    
    public void mostrarProducto(JTable tabla) {
        Connection conn = Conexion.getConnection();
        pDAO.mostrarProducto(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void buscarProducto(JTable tabla, String x) {
        Connection conn = Conexion.getConnection();
        pDAO.buscarProducto(conn, tabla, x);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
