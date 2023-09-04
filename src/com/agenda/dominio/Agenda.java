package com.agenda.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Agenda {
    private List<Contacto> contactos;
    public Agenda() {
        this.contactos = new ArrayList<>();
    }
    public void crearContacto(String nombre, String apellido, long celular){
        if (this.contactos.size() < 50 && buscarPorContaco(celular) == null) {
            Contacto agregarContacto = new Contacto(nombre, apellido, celular);
            this.contactos.add(agregarContacto);
            System.out.println("Contacto Agregado Exitosamente...");
        }else{
            System.out.println("El Contacto no pudo ser agregado..."); //Esto debido a que ya existe o superó capacidad
        }
    }
    public void borrarContacto(long celularABorrar){
        if (buscarPorContaco(celularABorrar) != null) {
            this.contactos.remove(buscarPorContaco(celularABorrar));
            System.out.println("El contacto ha sido eliminado.");
        }else {
            System.out.println("El contacto no existe en la agenda.");
        }
    }
    public List<Contacto> buscarPorNombre(String nombreABuscar) {
        return this.contactos.stream()
                .filter(contact -> contact.getNombre().equalsIgnoreCase(nombreABuscar)).toList();
    }
    public List<Contacto> buscarPorApellido(String apellidoABuscar) {
        return this.contactos.stream()
                .filter(contact -> contact.getApellido().equalsIgnoreCase(apellidoABuscar))//compararDatos
                .toList();
    }
    public Contacto buscarPorContaco(long contactoABuscar) {
        return this.contactos.stream()
                .filter(contact -> contact.getCelular() == contactoABuscar).findFirst().orElse(null);
    }
    public void cambiarTelefono(long telefonoActual, long telefonoNuevo) {
        if (this.buscarPorContaco(telefonoActual) != null) {
            this.buscarPorContaco(telefonoActual).celular = telefonoNuevo;
            System.out.println("Telefono Cambiado con exito... ");
        }else{
            System.out.println("El contacto no existe en la Agenda. ");
        }
    }
    public void ordenarContactosAlfabeticamente() {
        Collections.sort(contactos, new Comparator<Contacto>() {
            @Override
            public int compare(Contacto contacto1, Contacto contacto2) {
                return contacto1.getNombre().compareToIgnoreCase(contacto2.getNombre());
            }
        });
    }
    //Extras
    public List<Contacto> getContactos() {
        return this.contactos;
    }
    //Interfaz -> Se busca facilitar el ingreso de los datos al programa
    public String pedirDatosTipoStr(String nombreOApellido){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa el " + nombreOApellido + ": ");
        String nombreOApell = scanner.nextLine();
        return nombreOApell;
    }
    public long pedirDatosTipoLong(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número: ");
        long numero = scanner.nextLong();
        return numero;
    }
    public boolean pedirDatosTipoBoolean(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Desea continuar?(0/1): ");
        int bol = scanner.nextInt();
        if (bol == 1)return true;
        else return false;
    }
}