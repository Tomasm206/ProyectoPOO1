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
    public void sacarSnackPorNombre(String producto){
        // Codigo a escribir
    }
    public void aumentarSnackPorCodONom(int codigo, String nombre){
        // Codigo a escribir
    }
    public void quitarSnack(String producto){
        // Codigo a escribir
    }
    public int unidadesDisponiblesDeUnSnack(String producto){
        // Codigo
        return 0;
    }
    //Funciones Extras
    public int cantidadMaxima(int cantidad){
        return 0;
    }
    public List<Snack> buscarPorNombre(String producto){
        return this.productos.stream()
            .filter(product -> product.getProducto().equalsIgnoreCase(producto)).toList();
    }
    public Snack buscarSnackPorCod(int codigo){
        return this.productos.stream()
            .filter(cod -> cod.getCodigo() == codigo)
            .findFirst().orElse(null);
        }
}
