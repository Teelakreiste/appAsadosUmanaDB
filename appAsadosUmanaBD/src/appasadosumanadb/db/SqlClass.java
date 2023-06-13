/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanadb.db;

/**
 *
 * @author osmel
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

public class SqlClass {

    public SqlClass() {
    }

    public Statement conn() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("Conectando con la base de datos...");
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE","uAsados","asados");
            Statement statement = connection.createStatement();
            return statement;
        } catch (Exception e) {
            System.out.println("The exception raised is:" + e);
            return null;
        }
    }

    public LinkedList<String> query(String from) {
        try {
            Statement st = conn();
            ResultSet resultSet = st.executeQuery(from);

            LinkedList<String> result = new LinkedList();
            while (resultSet.next()) {
                for (int i = 1; i < resultSet.getMetaData().getColumnCount()+1; i++) {
                    result.add(resultSet.getString(i));
                }
            }
            return result;
        } catch (Exception e) {
            return null;
        }
    }
}
