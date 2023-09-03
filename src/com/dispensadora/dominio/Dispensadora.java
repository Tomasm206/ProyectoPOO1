package com.dispensadora.dominio;

import java.util.List;

public class Dispensadora {
    private List<Snack> productos;
    public void agregarSnack(String producto,int codigo) {
        if (buscarSnackPorCod(codigo) == null) {
            Snack agregarSnack = new Snack(producto, codigo);
            this.productos.add(agregarSnack);
        }
    }
    public void sacarSnackPorCod(int codigo){
        if(buscarSnackPorCod(codigo) != null){
            //Restarle 1 a algun producto
        }
    }
    public Snack buscarSnackPorCod(int codigo){
        return this.productos.stream()
        .filter(cod -> cod.getCodigo() == codigo)
        .findFirst().orElse(null);
        }
}
