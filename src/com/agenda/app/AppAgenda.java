package com.agenda.app;

import com.agenda.dominio.Agenda;
import com.agenda.dominio.Contacto;
import java.util.Scanner;

public class AppAgenda {
    public static void main(String[] args) {
        System.out.println("El programa funciona");

        Contacto user2 = new Contacto("Will", "smith", 3333);
        Contacto user3 = new Contacto("Selena", "Quintanilla", 4444);
        Contacto user4 = new Contacto("Jose", "Jose", 5555);
        Contacto user5 = new Contacto("Leo", "Dan", 6666);

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Crear un nuevo contacto.");
            System.out.println("2. Eliminar un contacto.");
            System.out.println("3. Buscar un contacto por su nombre.");
            System.out.println("4. Buscar un contacto por su apellido.");
            System.out.println("5. Buscar un contacto por su Telefono.");
            System.out.println("6. Cambiar el celular de un contacto.");
            System.out.println("7. Ordenar los contactos en orden alfabético");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Crear un nuevo contacto.");
                    int clse = 0;
                    while (clse<5){
                        Scanner Scanner = new Scanner(System.in);
                        System.out.print("Por favor ingrese el nombre: ");
                        String nombre = scanner.nextLine();
                        scanner.close();
                        Contacto user1 = new Contacto(nombre, "apellido", 5555);
                        clse++;
                    }
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
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                case 6:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                case 7:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                case 8:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 8);

        scanner.close();
    }
}
