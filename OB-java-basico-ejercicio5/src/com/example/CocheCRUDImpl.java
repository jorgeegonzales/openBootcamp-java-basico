package com.example;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    List<Coche> coches = new ArrayList<>();

    @Override
    public void save(Coche coche) {
        System.out.println("save");
        coches.add(coche);
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("findAll");

        return coches;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("delete");
        coches.remove(coche);
    }
}
