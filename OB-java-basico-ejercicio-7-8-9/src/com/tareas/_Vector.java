package com.tareas;

import java.util.Vector;

public class _Vector {
    /**
     * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra
     * el resultado final.
     * @author Jorge Gonzales
     */
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5};
        Vector<Integer> vector = crearVector(array);
        Vector<Integer> vectorResultado = eliminarElementos(vector, 1, 2);
        System.out.println(vectorResultado);

    }

    public static Vector<Integer> crearVector(int[] array) {
        Vector<Integer> vector = new Vector<Integer>();
        for (int i = 0; i < array.length; i++) {
            vector.add(array[i]);
        }
        return vector;
    }

    public static Vector<Integer> eliminarElementos(Vector<Integer> vector, int index1, int index2) {
        Vector<Integer> vectorE = new Vector<Integer>();
        Vector<Integer> vectorEliminar = vector;
        for (int i = 0; i < vector.size(); i++) {
            if (index1 == i || index2 == i) {
                vectorE.add(vector.get(i));
            }
        }

        for (int i = 0; i < vectorE.size(); i++) {
            int number = vectorE.get(i);
            for (int j = 0; j < vector.size(); j++) {
                if (number == vector.get(j)) {
                    for (int k = 0; k < vectorEliminar.size(); k++) {
                        if (vectorEliminar.get(k) == number) {
                            vectorEliminar.remove(k);
                            break;
                        }
                    }
                }
            }
        }

        return vectorEliminar;
    }

}
