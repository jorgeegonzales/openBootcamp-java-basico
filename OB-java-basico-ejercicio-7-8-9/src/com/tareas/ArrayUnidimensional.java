package com.tareas;

public class ArrayUnidimensional {
    /**
     * Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
     * @author Jorge Gonzales
     */
    public static void main(String[] args) {
        String[] array = new String[] { "Livia","Julieta","Katherine","Cristina"};

        for(String nombre: array) {
            System.out.println(nombre);
        }
    }
}
