package com.agenda.dominio;

public class Contacto {
    private String nombre;
    private String apellido;
    public long celular;

    public Contacto(String nombre, String apellido, long celular) { //Constructor
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

    public String getNombre() { //Getters
        return nombre;
    }

    public String getApellido() { //Getters
        return apellido;
    }

    public long getCelular() { //Getters
        return celular;
    }
}
