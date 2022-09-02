package com.tareas;

public class ArrayBidimensional {
    /**
     * Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
     * @author Jorge Gonzales
     */

    public static void main(String[] args) {
        int[][] array =  {{1, 2, 3, 4},{10,20,30,40},{100,200,300,400}};

        for (int i = 0; i < array.length; i++) {
            System.out.println("valor de i: "+ i);
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("estoy en i:"+i+" j:"+j+"\n "+ array[i][j]);
            }

        }


    }
}
