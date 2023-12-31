package com.dispensadora.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dispensadora {
    private List<Snack> productos;
    public Dispensadora() {this.productos = new ArrayList<>();}

    public void agregarSnack(String producto,int codigo,int cantidad, long precio) {
        if (buscarSnackPorCod(codigo) == null || buscarSnackPorCod(codigo).getCantidad() < 6) {
            Snack agregarSnack = new Snack(producto, codigo, cantidad, precio);
            this.productos.add(agregarSnack);
        }
        System.out.println("Se han agregado los productos correctamente...");
    }
    public void sacarSnackPorCod(int codigo){
        if(buscarSnackPorCod(codigo) != null && buscarSnackPorCod(codigo).getCantidad() > 0){
            buscarSnackPorCod(codigo).setCantidad(buscarSnackPorCod(codigo).getCantidad() - 1);
            System.out.println("Has sacado " + buscarSnackPorCod(codigo).getProducto());
        }else {
            System.out.println("No hay unidades disponibles. ");
        }
    }
    public void sacarSnackPorNombre(String producto){
        List<Snack> snacksEncontrados = buscarPorNombre(producto);
        if(buscarPorNombre(producto).isEmpty()){
            System.out.println("El producto no existe en el inventario");
        }else{
            Snack snackEncontrado = snacksEncontrados.get(0);
            int cantidadActual = snackEncontrado.getCantidad();
            if (cantidadActual > 0) {
                snackEncontrado.setCantidad(cantidadActual - 1);
                System.out.println("Has sacado -> " + producto + "\nUnidades disponibles -> " + snackEncontrado.getCantidad());
            } else {
                System.out.println("No hay unidades disponibles de " + producto);
            }
        }
    }
    public void aumentarSnackPorCodONom(int codigo, String nombre){
        List<Snack> snacksEncontrados = buscarPorNombre(nombre); //snacksEncontrados es una lista -- es diferente a snackEncontrado
        if (buscarSnackPorCod(codigo) != null && buscarSnackPorCod(codigo).getCantidad() < 6 && codigo != 0) {
            if (buscarSnackPorCod(codigo).getCantidad() < 6){
                buscarSnackPorCod(codigo).setCantidad(buscarSnackPorCod(codigo).getCantidad() + 1); //Falta Mostrar en pantalla cuando esté a su maxima capacidad
                System.out.println("Has aumentado ->" + buscarSnackPorCod(codigo).getProducto() + "\nUnidades disponibles ->" + buscarSnackPorCod(codigo).getCantidad());
            }else System.out.println("Has llegado al maximo de unidades...");
        } else if (!buscarPorNombre(nombre).isEmpty() && nombre != "vacio") {
            Snack snackLocalizado = snacksEncontrados.get(0);
            int cantidadActual = snackLocalizado.getCantidad();
            if (cantidadActual < 6) {
                snackLocalizado.setCantidad(cantidadActual + 1);
                System.out.println("Has aumentado -> " + nombre + "\nUnidades disponibles -> " + snackLocalizado.getCantidad());
            } else {
                System.out.println("El producto " + nombre + " esta a su maxima capacidad");
            }
        }else System.out.println("El producto no existe en el inventario");
    }
    public void quitarSnack(String producto){
        if (!buscarPorNombre(producto).isEmpty()){
            this.productos.removeIf(product -> product.getProducto().equalsIgnoreCase(producto));
            System.out.println(producto + " Ha sido eliminado...");
        }else System.out.println("Este producto no existe en el inventario");
    }
    public void obtenerUnidadesDisponiblesDeUnSnack(String producto){
        List<Snack> snakEncontrados = buscarPorNombre(producto);
        if (!buscarPorNombre(producto).isEmpty()){
            for (Snack snack : snakEncontrados) {
                System.out.println(producto + " cuenta con -> " + snack.getCantidad());
            }
        }
    }
    public List<Snack> obtenerNombreProductosAgotados(){
        for (Snack snack : this.productos){
            if (snack.getCantidad()==0){
                System.out.println(snack.getProducto() + " Se encuentra agotado.");
            }
        }
        return this.productos; //Creo que esto es inecesario
    }
    public List<Snack> obtenerNombreYUnidadesDisponibles(){
        for (Snack productosSnack : this.productos){
            if (productosSnack.getCantidad() > 0){
                System.out.println(productosSnack.getProducto() + " Posee una cantidad de -> "+ productosSnack.getCantidad() + " Unidades");
            }
        }
        return this.productos; //Creo que esto es inecesario
    }
    public List<Snack> obtenerSnacksOrdenadosPorValorAcendente(){
        this.productos.sort(Comparator.comparingLong(Snack::getPrecio).reversed());
        return this.productos;
    }
    public List<Snack> obtenerSnacksOrdenadosPorCantidadDecendente(){
        this.productos.sort(Comparator.comparingInt(Snack::getCantidad));
        return this.productos;
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
