package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        Coche mitsubishi = new Coche("Mitsubishi","ASX","Rojo",2022,1998.00,148,20.10);
        Coche hyundai= new Coche("Hyundai","New Accent","Gris",2021,1368.00,99,13.50);
        Coche ford = new Coche("Ford","Explorer","Negro",2020,1998.00,300,25.10);

        // Guardar Coche
        cocheCrud.save(mitsubishi);
        cocheCrud.save(hyundai);
        cocheCrud.save(ford);

        //Consultar Coche
        List<Coche> coches = cocheCrud.findAll();
        System.out.println(coches);

        //Remover Coche
        cocheCrud.delete(ford);
        System.out.println(coches);

    }
}
