package com.example;

/**
 * Calculo del precio con iva a partir del precio base
 * Proporcione el precio base y el iva correspondiente
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        double precioMasIva = calculoDePrecioConIva(100.25,0.21);
        System.out.println(precioMasIva);

    }

    static double calculoDePrecioConIva(double precio,double iva){
        
        double precioIva = precio*iva;
        double precioConIva = precio + precioIva;
        return precioConIva;
    }
}
