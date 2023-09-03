package com.agenda.app;

import com.agenda.dominio.Agenda;
import com.agenda.dominio.Contacto;

public class AppAgenda {
    public static void main(String[] args) {
        System.out.println("El programa funciona");



        Contacto user1 = new Contacto("Tomas", "Marin", 2222);
        Contacto user2 = new Contacto("Will", "smith", 3333);
        Contacto user3 = new Contacto("Selena", "Quintanilla", 4444);
        Contacto user4 = new Contacto("Jose", "Jose", 5555);
        Contacto user5 = new Contacto("Leo", "Dan", 6666);
    }
}
