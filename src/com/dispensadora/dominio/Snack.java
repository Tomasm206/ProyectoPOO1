package com.dispensadora.dominio;

public class Snack {
    protected String producto;
    protected int codigo;
    protected int cantidad;
    protected long precio;

    public Snack(String producto, int codigo, int cantidad, long precio) {
        this.producto = producto;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public long getPrecio() {
        return precio;
    }
    public void setPrecio(long precio) {
        this.precio = precio;
    }
}
