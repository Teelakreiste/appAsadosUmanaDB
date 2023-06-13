/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanadb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author osmel
 */
public class Conexion {
    private static Connection conn = null;
    private static String login = "uAsados";
    private static String password = "asados";
    private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, login, password);
            conn.setAutoCommit(false);
            if (conn != null) {
                System.out.println("Conexión Exitosa");
            }else {
                System.out.println("Conexión Fallida");
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexión Fallida." + e.getMessage());
        }
        return conn;
    }
    
    public void desconexion() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar la base de datos...");
        }
    }
    
    public static void main(String[] arg) {
        Conexion c = new Conexion();
        c.getConnection();
    }
}
