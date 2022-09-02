package com.tareas;

import java.util.ArrayList;
import java.util.List;

public class _ArrayList_Int {
    /**
     * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle,
     * recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves,
     * puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
     * @author Jorge Gonzales
     */
    public static void main(String[] args) {
        List<Integer> ArrayList = crearArrayList(10);
       List<Integer> ArrayListResultado = eliminarElementos(ArrayList);
       System.out.println(ArrayListResultado);

    }

    public static List<Integer> crearArrayList(int limite){
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 1; i <= limite; i++){
            arrayList.add(i);
        }
        return arrayList;
    }

    public static List<Integer> eliminarElementos(List<Integer> arrayList) {
        List<Integer> arrayListE = new ArrayList<Integer>();
        List<Integer> arrayListEliminar = arrayList;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                arrayListE.add(arrayList.get(i));
            }
        }

        for (int i = 0; i < arrayListE.size(); i++) {
            int number = arrayListE.get(i);
            for (int j = 0; j < arrayList.size(); j++) {
                if (number == arrayList.get(j)) {
                    for (int k = 0; k < arrayListEliminar.size(); k++) {
                        if (arrayListEliminar.get(k) == number) {
                            arrayListEliminar.remove(k);
                            break;
                        }
                    }
                }
            }
        }

        return arrayListEliminar;
    }
}
