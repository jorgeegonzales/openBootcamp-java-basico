package com.tareas;

import java.io.*;

public class CopiaDelFichero {

    public static void main(String[] args) throws FileNotFoundException {
        copiarFichero(
                new FileInputStream("D:\\open-bootcamp\\Java-Basico\\tareas\\openBootcamp-java-basico\\OB-java-basico-ejercicio-7-8-9\\src\\files\\fileIn.txt"),
                new PrintStream("D:\\open-bootcamp\\Java-Basico\\tareas\\openBootcamp-java-basico\\OB-java-basico-ejercicio-7-8-9\\src\\files\\fileOut.txt"));

    }

    public static void copiarFichero(InputStream fileIn, PrintStream fileOut){
        try{
            int dato = fileIn.read();
            while (dato != -1) {
                System.out.print((char)dato);
                fileOut.write(dato);
                dato = fileIn.read();
            }
        }catch (IOException e) {
            System.out.println("No puedo leer el fichero: "+e.getMessage());
        }
    }
}
