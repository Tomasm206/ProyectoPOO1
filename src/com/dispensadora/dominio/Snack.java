package com.dispensadora.dominio;

public class Snack {
    private String producto;
    protected int codigo;
    public Snack(String producto, int codigo) {
        this.producto = producto;
        this.codigo = codigo;
    }
    public String getProducto() {
        return producto;
    }
    public int getCodigo() {
        return codigo;
    }
}
