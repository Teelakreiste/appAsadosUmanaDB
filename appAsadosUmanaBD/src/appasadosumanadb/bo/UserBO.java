/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanadb.bo;

import appasadosumanadb.dao.UserDAO;
import appasadosumanadb.db.Conexion;
import appasadosumanadb.entity.User;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author osmel
 */
public class UserBO {
    private String mensaje = "";
    private UserDAO uDAO = new UserDAO();
    
    public String agregarUser(User us) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = uDAO.agregarUser(conn, us);
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
    
    public String agregarAccUser(User us) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = uDAO.agregarAccUser(conn, us);
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
    
    public String modificarUser(User us) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = uDAO.modificarUser(conn, us);
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
    
    public String eliminarUser(String id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = uDAO.eliminarUser(conn, id);
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
    
    public String desactivarUser(String id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = uDAO.desactivarUser(conn, id);
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
    
    public void mostrarUser(JTable tabla) {
        Connection conn = Conexion.getConnection();
        uDAO.mostrarUser(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void buscarUser(JTable tabla, String x) {
        Connection conn = Conexion.getConnection();
        uDAO.buscarUser(conn, tabla, x);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
