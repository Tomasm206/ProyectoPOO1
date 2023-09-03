package com.agenda.dominio;

import java.util.ArrayList;
import java.util.List;

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
        }
    }
}
