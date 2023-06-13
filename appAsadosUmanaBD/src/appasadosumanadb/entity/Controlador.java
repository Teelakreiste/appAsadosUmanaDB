/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanadb.entity;

import appasadosumanabd.ui.Admin;
import appasadosumanabd.ui.Bill;
import appasadosumanabd.ui.Login;
import appasadosumanabd.ui.Products;
import appasadosumanabd.ui.Users;
import appasadosumanadb.bo.ClienteBO;
import appasadosumanadb.bo.ProductBO;
import appasadosumanadb.bo.UserBO;
import javax.swing.JTable;

public class Controlador {

    private Admin vAdmin;
    private Bill vBill;
    private Login vLogin;
    private Products vProducts;
    private Users vUsers;
    private boolean estado;
    private ProductBO pBO;
    private Product prod;
    private UserBO uBO;
    private User us;
    private ClienteBO cBO;
    private Cliente cli;
    private String Emp = "";
    private String mensaje = "";

    public Controlador() {
        vAdmin = null;
        vBill = null;
        vLogin = null;
        vProducts = null;
        vUsers = null;
        estado = false;
        pBO = new ProductBO();
        prod = new Product();
        uBO = new UserBO();
        us = new User();
        cBO = new ClienteBO();
        cli = new Cliente();

    }

    public String getEmp() {
        return Emp;
    }

    public void setEmp(String Emp) {
        this.Emp = Emp;
    }

    public Admin getvAdmin() {
        return vAdmin;
    }

    public void setvAdmin(Admin vAdmin) {
        this.vAdmin = vAdmin;
    }

    public Bill getvBill() {
        return vBill;
    }

    public void setvBill(Bill vBill) {
        this.vBill = vBill;
    }

    public Login getvLogin() {
        return vLogin;
    }

    public void setvLogin(Login vLogin) {
        this.vLogin = vLogin;
    }

    public Products getvProducts() {
        return vProducts;
    }

    public void setvProducts(Products vProducts) {
        this.vProducts = vProducts;
    }

    public Users getvUsers() {
        return vUsers;
    }

    public void setvUsers(Users vUsers) {
        this.vUsers = vUsers;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setProd(String cod, String nombre, double precio) {
        this.prod.setCodigo(cod);
        this.prod.setNombre(nombre);
        this.prod.setPrecio(precio);
    }

    public void insetarProducto() {
        mensaje = pBO.agregarProducto(prod);
        System.out.println(mensaje);
    }

    public void modificarProducto() {
        mensaje = pBO.modificarProducto(prod);
        System.out.println(mensaje);
    }

    public void eliminarProducto(String codigo) {
        mensaje = pBO.eliminarProducto(codigo);
        System.out.println(mensaje);
    }

    public void mostrarProdcuto(JTable tabla) {
        pBO.mostrarProducto(tabla);
    }

    public void buscarProdcuto(JTable tabla, String x) {
        pBO.buscarProducto(tabla, x);
    }

    public void setUser(String id, String nombre, String apellido, String direccion,
            String celular, String telefono, String cargo, String usuario, String contra) {
        this.us.setId(id);
        this.us.setNombre(nombre);
        this.us.setApellido(apellido);
        this.us.setDireccion(direccion);
        this.us.setCelular(celular);
        this.us.setTelefono(telefono);
        this.us.setCargo(cargo);
        this.us.setUsuario(usuario);
        this.us.setContra(contra);
    }

    public void insetarUser() {
        mensaje = uBO.agregarUser(us);
        System.out.println(mensaje);
    }

    public void insetarAccUser() {
        mensaje = uBO.agregarAccUser(us);
        System.out.println(mensaje);
    }

    public void modificarUser() {
        mensaje = uBO.modificarUser(us);
        System.out.println(mensaje);
    }

    public void eliminarUsuario(String id) {
        mensaje = uBO.eliminarUser(id);
        System.out.println(mensaje);
    }

    public void desactivarUsuario(String id) {
        mensaje = uBO.desactivarUser(id);
        System.out.println(mensaje);
    }

    public void mostrarUser(JTable tabla) {
        uBO.mostrarUser(tabla);
    }

    public void buscarUser(JTable tabla, String x) {
        uBO.buscarUser(tabla, x);
    }

    public void setCliente(String id, String nombre) {
        this.cli.setId(id);
        this.cli.setNombre(nombre);
    }

    public void insetarCliente() {
        mensaje = cBO.agregarCliente(cli);
        System.out.println(mensaje);
    }
}
