package com.tareas;

public class CadenaAlReves {
    /**
     * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
     * @author Jorge Gonzales
     */
    public static void main(String[] args) {

        String alReves = reverse("Hola mundo");
        System.out.println(alReves);
    }

    public static String reverse(String texto){
        String palabra = texto;
        String reverseTexto = " ";
        for(int contador = palabra.length()-1;contador >= 0;contador--){
            reverseTexto = reverseTexto + palabra.charAt(contador);
        }
        return reverseTexto;
    }
}
