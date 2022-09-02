package com.tareas;

import java.util.Vector;

public class CapacidadVector {
    /**
     * Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos
     * al mismo.
     * @author Jorge Gonzales
     */
    public static void main(String[] args) {

        Vector<Integer> vector = crearVector(1000);
       int capacidad =  vector.capacity();
       System.out.println("Capacidad:" + capacidad);
        System.out.println(vector);
       //Se incrementaria su capacidad por defecto de 10 a 1280.

    }

    public static Vector<Integer> crearVector(int limite){
        Vector<Integer> vector = new Vector<Integer>();
        for (int i = 1; i <= limite; i++){
            vector.add(i);
        }
        return vector;
    }

}
