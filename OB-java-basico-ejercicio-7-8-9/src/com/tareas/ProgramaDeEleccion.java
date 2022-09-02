package com.tareas;

import java.io.*;
import java.net.URL;
import java.util.*;

/**
 * el programa recibe un archivo de entrada el cual contiene cadenas de texto, las lee linea por linea
 * asignadolas a un list para despues añadrilas a un map en le que se mostrara la palabra como clave
 * y el numeros de veces que se repite la palabra como valor.
 */
public class ProgramaDeEleccion {

    private static final String ARCHIVO_DE_ENTRADA = "files/entrada.txt" ;
    private static final String ARCHIVO_DE_SALIDA ="files/salida.txt";

    public static void main(String[] args) {
        URL urlArchivoDeEntrada = ProgramaDeEleccion.class.getClassLoader().getResource(ARCHIVO_DE_ENTRADA);
        URL urlArchivoDeSalida = ProgramaDeEleccion.class.getClassLoader().getResource(ARCHIVO_DE_SALIDA);

        Map palabrasConNumeroDeRepeticiones = leerFichero(urlArchivoDeEntrada.getPath());
        escribirSalida(palabrasConNumeroDeRepeticiones, urlArchivoDeSalida.getPath());
    }

    public static void escribirSalida(Map<String,Integer> mapa, String archivoDeSalida){
        PrintStream salida;
        try {
            salida = new PrintStream(new FileOutputStream(archivoDeSalida));
            mapa.forEach((k,v) -> {
                System.out.println(k + ":" + v);
                salida.println(k + ":" + v);
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Map<String,Integer> leerFichero(String archivoDeEntrada){
        BufferedReader reader;
        List<String> arrayList = new ArrayList<String>();
        Map<String,Integer> map = new HashMap<String,Integer>();
        try {
            reader = new BufferedReader( new FileReader(archivoDeEntrada));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                for (String palabra : line.split(" ")){
                    if(map.containsKey(palabra)){
                        map.put(palabra, map.get(palabra) + 1);
                    }else{
                        map.put(palabra, 1);
                    }
                }
                // leer la siguiente línea
                line = reader.readLine();
            }
            reader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }
}
