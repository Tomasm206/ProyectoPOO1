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
                    System.out.println("\n*********** Crear un nuevo contacto. ***********");
                    boolean terminar = true;
                    while (biblioteca.getContactos().size() < 50 && terminar){
                        biblioteca.crearContacto(biblioteca.pedirDatosTipoStr("Nombre"), biblioteca.pedirDatosTipoStr("apellido"), biblioteca.pedirDatosTipoLong());
                        terminar = biblioteca.pedirDatosTipoBoolean();
                    }
                    //Para agregar multiples contactos instantaneamente cambiar terminar por false
                    //biblioteca.crearContacto("Nombre","Apellido",9999);
                    System.out.println("*************************************************\n");
                    break;
                case 2:
                    System.out.println("\n*********** Eliminar un contacto. ***********");
                    biblioteca.borrarContacto(biblioteca.pedirDatosTipoLong());
                    System.out.println("*************************************************\n");
                    break;
                case 3:
                    System.out.println("\n*********** Buscar un contacto por su nombre. ***********");
                    String nombreABuscar = biblioteca.pedirDatosTipoStr("Nombre");
                    List<Contacto> contactosConNomEncontrados = biblioteca.buscarPorNombre(nombreABuscar);
                    if (!contactosConNomEncontrados.isEmpty()) {
                        System.out.println("Contactos encontrados con el nombre '" + nombreABuscar + "':");
                        for (Contacto contacto : contactosConNomEncontrados) {
                            System.out.println("Nombre: " + contacto.getNombre() + ", Apellido: " + contacto.getApellido() + ", Celular: " + contacto.getCelular());
                        }
                    } else {
                        System.out.println("No se encontraron contactos con el nombre '" + nombreABuscar + "'.");
                    }
                    System.out.println("*************************************************\n");
                    break;
                case 4:
                    System.out.println("\n*********** Buscar un contacto por su Apellido. ***********");
                    String apellidoABuscar = biblioteca.pedirDatosTipoStr("Apellido");
                    List<Contacto> contactosConApellEncontrados = biblioteca.buscarPorApellido(apellidoABuscar);
                    if (!contactosConApellEncontrados.isEmpty()) {
                        System.out.println("Contactos encontrados con el Apellido '" + apellidoABuscar + "':");
                        for (Contacto contacto : contactosConApellEncontrados) {
                            System.out.println("Apellido: " + contacto.getApellido() +", Nombre " + contacto.getNombre() +  ", Celular: " + contacto.getCelular());
                        }
                    } else {
                        System.out.println("No se encontraron contactos con el apellido '" + apellidoABuscar + "'.");
                    }
                    System.out.println("*************************************************\n");
                    break;
                case 5:
                    System.out.println("\n*********** Buscar un contacto por su telefono. ***********");
                    long telefono = biblioteca.pedirDatosTipoLong();
                    Contacto contactoEncontrado = biblioteca.buscarPorContaco(telefono);
                    if (contactoEncontrado != null) {
                        System.out.println("Contacto encontrado:");
                        System.out.println("Nombre: " + contactoEncontrado.getNombre() + "Apellido: " + contactoEncontrado.getApellido() + "Celular: " + contactoEncontrado.getCelular());
                    } else {
                        System.out.println("No se encontró un contacto con el número de teléfono ");
                    }System.out.println("*************************************************\n");
                    break;
                case 6:
                    System.out.println("\n*********** Cambiar el celular de un contacto. ***********");
                    System.out.println("*********** Ingresar datos del telefono actual ***********");
                    long actual = biblioteca.pedirDatosTipoLong();
                    System.out.println("*********** Ingresar datos del telefono a renovar ***********");
                    long nuevo = biblioteca.pedirDatosTipoLong();
                    biblioteca.cambiarTelefono(actual, nuevo);
                    System.out.println("*************************************************\n");
                    break;
                case 7:
                    System.out.println("\n*********** Ordenar los contactos en orden alfabético. ***********");
                    biblioteca.ordenarContactosAlfabeticamente();
                    List<Contacto> contactosOrdenados = biblioteca.getContactos();
                    for (Contacto contacto : contactosOrdenados) {
                        System.out.println("Nombre: " + contacto.getNombre() + " - Apellido: " + contacto.getApellido() + " - Celular: " + contacto.getCelular());
                    }
                    System.out.println("*************************************************\n");
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
