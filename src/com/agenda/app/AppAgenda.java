package com.agenda.app;

import com.agenda.dominio.Agenda;
import com.agenda.dominio.Contacto;

import java.util.List;
import java.util.Scanner;

public class AppAgenda {
    public static void main(String[] args) {
        System.out.println("El programa funciona");
        Agenda biblioteca = new Agenda();
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
                    System.out.println("*********** Crear un nuevo contacto. ***********");
                    biblioteca.crearContacto("Tomas","Marin",55555);
                    biblioteca.crearContacto("Valen","Marin",88888);
                    biblioteca.crearContacto("laura","agudelo",22222);
                    break;
                case 2://No Funciona
                    System.out.println("*********** Eliminar un contacto. ***********");

                    break;
                case 3:
                    System.out.println("*********** Buscar un contacto por su nombre.***********");
                    String nombreABuscar = "Tomas";
                    List<Contacto> contactosConNomEncontrados = biblioteca.buscarPorNombre(nombreABuscar);
                    if (!contactosConNomEncontrados.isEmpty()) {
                        System.out.println("Contactos encontrados con el nombre '" + nombreABuscar + "':");
                        for (Contacto contacto : contactosConNomEncontrados) {
                            System.out.println("Nombre: " + contacto.getNombre() + ", Apellido: " + contacto.getApellido() + ", Celular: " + contacto.getCelular());
                        }
                    } else {
                        System.out.println("No se encontraron contactos con el nombre '" + nombreABuscar + "'.");
                    }
                    break;
                case 4:
                    System.out.println("*********** Buscar un contacto por su Apellido.***********");
                    String apellidoABuscar = "Marin";
                    List<Contacto> contactosConApellEncontrados = biblioteca.buscarPorApellido(apellidoABuscar);
                    if (!contactosConApellEncontrados.isEmpty()) {
                        System.out.println("Contactos encontrados con el Apellido '" + nombreABuscar + "':");
                        for (Contacto contacto : contactosConApellEncontrados) {
                            System.out.println("Apellido: " + contacto.getApellido() +", Nombre " + contacto.getNombre() +  ", Celular: " + contacto.getCelular());
                        }
                    } else {
                        System.out.println("No se encontraron contactos con el apellido '" + apellidoABuscar + "'.");
                    }
                    break;
                case 5: //No Funciona
                    System.out.println("*********** Buscar un contacto por su telefono.***********");
                    long telefono = 22222;
                    biblioteca.buscarPorContaco(telefono);
                    if (true) {
                        //Proceso para mostrar y verificar que si exista
                    } else {
                        System.out.println("No se encontraron contactos con el nombre '" + nombreABuscar + "'.");
                    }
                    break;
                case 6:
                    System.out.println("*********** Cambiar el celular de un contacto. ***********");
                    break;
                case 7:
                    System.out.println("*********** Ordenar los contactos en orden alfabético ***********");
                    break;
                case 8:
                    System.out.println("*********** Cerrando la aplicacion... ***********");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 8);
        scanner.close();
    }
}
