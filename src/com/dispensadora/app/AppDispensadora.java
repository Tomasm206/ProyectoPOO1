package com.dispensadora.app;

import com.dispensadora.dominio.Dispensadora;
import com.dispensadora.dominio.Snack;

import java.util.Scanner;

public class AppDispensadora {
    public static void main(String[] args) {
        System.out.println("El programa funciona.");
        Dispensadora inventario = new Dispensadora();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar opciones del menú
            System.out.println("Menú Principal:");
            System.out.println("1. Agregar Snack");
            System.out.println("2. Sacar Snack Por Codigo");
            System.out.println("3. Sacar Snack Por Nombre");
            System.out.println("4. Aumentar Unidades a un Snack Por Codigo o Nombre");
            System.out.println("5. Quitar un Snack");
            System.out.println("6. Obtener unidades disponibles de un Snack");
            System.out.println("7. Obtener Nombre de Unidades Agotadas de un Snack");
            System.out.println("8. Obtener el nombre y la cantidad de unidades disponibles en el dispensador");
            System.out.println("9. Obtener la lista de snacks ordenada por su valor de mayor a menor.");
            System.out.println("10. Obtener la lista de snacks ordenada por su cantidad de menor a mayor.");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Realizar acciones según la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("********** Agregar Snack **********");
                    inventario.agregarSnack("Gaseosa",432, 6, 2000);
                    inventario.agregarSnack("Cheetos",578, 4, 1500);
                    inventario.agregarSnack("Doritos",864, 5, 1800);
                    inventario.agregarSnack("CocaCola",712, 2, 2200);
                    inventario.agregarSnack("Sanduches",468, 3, 4000);
                    break;
                case 2:
                    System.out.println("********** Sacar Snack Por Codigo **********");
                    inventario.sacarSnackPorCod(578);
                    System.out.println(inventario.buscarSnackPorCod(578).getCantidad());
                    break;
                case 3:
                    System.out.println("********** Sacar Snack Por Nombre **********");
                    inventario.sacarSnackPorNombre("Doritos");
                    break;
                case 4:
                    System.out.println("********** Aumentar Unidades a un Snack Por Codigo o Nombre **********");
                    inventario.aumentarSnackPorCodONom(468, "vacio");
                    inventario.aumentarSnackPorCodONom(0, "CocaCola");
                    break;
                case 5:
                    System.out.println("********** Quitar un Snack **********");
                    inventario.quitarSnack("CocaCola");
                    break;
                case 6:
                    System.out.println("********** Obtener unidades disponibles de un Snack **********");
                    inventario.obtenerUnidadesDisponiblesDeUnSnack("Gaseosa");
                    break;
                case 7:
                    System.out.println("********** Obtener Nombre de Unidades Agotadas de un Snack **********");
                    // Código
                    break;
                case 8:
                    System.out.println("********** Obtener el nombre y la cantidad de unidades disponibles en el dispensador **********");
                    // Código
                    break;
                case 9:
                    System.out.println("********** Obtener la lista de snacks ordenada por su valor de mayor a menor. **********");
                    inventario.obtenerSnacksOrdenadosPorValorAcendente().forEach(precio -> System.out.println(precio.getProducto() + " -> " + precio.getPrecio()));
                    break;
                case 10:
                    System.out.println("********** Obtener la lista de snacks ordenada por su cantidad de menor a mayor. **********");
                    inventario.obtenerSnacksOrdenadosPorCantidadDecendente().forEach(cantid -> System.out.println(cantid.getProducto() + " -> " + cantid.getCantidad() + " Und."));
                    break;
                case 11:
                    System.out.println("Saliendo del programa... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 11);

        scanner.close();


    }
}
