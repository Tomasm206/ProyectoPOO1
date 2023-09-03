package com.dispensadora.app;

import java.util.Scanner;

public class AppDispensadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar opciones del menú
            System.out.println("Menú Principal:");
            System.out.println("1. AgregarSnack");
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
                    System.out.println("Has seleccionado la Opción 1.");
                    // Realiza la acción correspondiente a la Opción 1
                    break;
                case 2:
                    System.out.println("Has seleccionado la Opción 2.");
                    // Realiza la acción correspondiente a la Opción 2
                    break;
                case 3:
                    System.out.println("Has seleccionado la Opción 3.");
                    // Realiza la acción correspondiente a la Opción 3
                    break;
                case 4:
                    System.out.println("Has seleccionado la Opción 3.");
                    // Realiza la acción correspondiente a la Opción 3
                    break;
                case 5:
                    System.out.println("Has seleccionado la Opción 3.");
                    // Realiza la acción correspondiente a la Opción 3
                    break;
                case 6:
                    System.out.println("Has seleccionado la Opción 3.");
                    // Realiza la acción correspondiente a la Opción 3
                    break;
                case 7:
                    System.out.println("Has seleccionado la Opción 3.");
                    // Realiza la acción correspondiente a la Opción 3
                    break;
                case 8:
                    System.out.println("Has seleccionado la Opción 3.");
                    // Realiza la acción correspondiente a la Opción 3
                    break;
                case 9:
                    System.out.println("Has seleccionado la Opción 3.");
                    // Realiza la acción correspondiente a la Opción 3
                    break;
                case 10:
                    System.out.println("Has seleccionado la Opción 3.");
                    // Realiza la acción correspondiente a la Opción 3
                    break;
                case 11:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 11);

        scanner.close();


    }
}
