/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanadb.entity;

import appasadosumanadb.db.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author osmel
 */
public class reporte implements JRDataSource {

    private Object[][] productos;
    private int index = - 1;
    private String numFac;
    private String nomEmp;
    private String nomCli;
    private String fecha;
    private String total;

    public reporte() {
        index = -1;
        detalles();
        listaProductos();

    }

    private void listaProductos() {
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
            int j = 0;
            LinkedList<String> result = new LinkedList<>();
            while (rs.next()) {
                for (int i = 0; i < 4; i++) {
                    result.add(rs.getString(i + 1));
                }
                j++;
            }
            System.out.println(j);
            productos = new String[j][4];
            int f = 0;
            for (int i = 0; i < j; i++) {
                for (int k = 0; k < 4; k++) {
                    productos[i][k] = result.get(f);
                    f++;
                }
                System.out.println("");
            }
            //System.out.println(result);
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
                nomEmp = cst.getString(2) + " " + cst.getString(3);
                fecha = cst.getString(4);
                total = cst.getString(5);
                nomCli = cst.getString(6);
                cst.close();
                con.close();
            } catch (Exception e) {
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public boolean next() throws JRException {
        index++;
        return (index < productos.length);
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object value = null;
        String fieldName = jrf.getName();
        switch (fieldName) {
            case "numeroFactura":
                value = numFac;
                break;
            case "empleado":
                value = nomEmp;
                break;
            case "cliente":
                value = nomCli;
                break;
            case "fecha":
                value = fecha;
                break;
            case "producto":
                value = productos[index][0];
                break;
            case "cantidad":
                value = productos[index][1];
                break;
            case "precio":
                value = productos[index][2];
                break;
            case "importe":
                value = productos[index][3];
                break;
            case "total":
                value = total;
                break;
        }
        return value;
    }
    
    public static JRDataSource getDataSource() {
        return new reporte();
    }   
}
