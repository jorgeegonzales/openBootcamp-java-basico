package com.tareas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _ArrayList_LinkedList {
    /**
     * Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor
     * de cada elemento.
     * @author Jorge Gonzales
     */
    public static void main(String[] args) {

        String[] array = new String[]{"a", "b", "c", "d"};
        List<String> ArrayList = crearArrayList(array);
        List<String> LinkedList = new LinkedList<String>();
        LinkedList.addAll(ArrayList);
        System.out.println("ArrayList: " + ArrayList);
        System.out.println("LinkedList: " + LinkedList);

        System.out.println("ArrayList: ");
        for(String arrayList: ArrayList) {
            System.out.println(arrayList);
        }

        System.out.println("LinkedList: ");
        for(String linkedList: LinkedList) {
            System.out.println(linkedList);
        }

    }

    public static List<String> crearArrayList(String[] array) {
        List<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }
}
