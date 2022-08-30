package com.example;


public class Main {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("REALME","9i","Negro",190,1159.00,"Qualcommm SnapDragon 680",2.4,"Android 11",6,128,5000);

        System.out.println("SmartPhone:");
        System.out.println("Caracteristicas Tecnicas:");
        System.out.println("Marca:" + " " + smartPhone.marca);
        System.out.println("Modelo:" + " " + smartPhone.modelo);
        System.out.println("Color:"+ " " + smartPhone.color);
        System.out.println("Peso:" + " " + smartPhone.peso);
        System.out.println("Precio:" + " " + smartPhone.precio);
        System.out.println("Procesador:" + " " + smartPhone.procesador);
        System.out.println("Velocidad del procesador:"+ " " + smartPhone.velocidadProcesador_GHz);
        System.out.println("Sistema operativo:" + " " + smartPhone.sistemaOperativo);
        System.out.println("Memoria Ram:" + " " + smartPhone.memoriaRam_GB);
        System.out.println("Memoria interna:"+ " " + smartPhone.memoriaInterna_GB);
        System.out.println("Capacidad de Bateria:" + " " + smartPhone.capacidadBateria_mAh);

        SmartWatch smartWatch = new SmartWatch("MIRAY","RPMS-30PU","Negro",25,299.00,"Touch","SI","SI","SI",100);

        System.out.println("SmartWatch");
        System.out.println("Caracteristicas tecnicas");
        System.out.println("marca:" + " " + smartWatch.marca);
        System.out.println("Modelo:" + " " + smartWatch.modelo);
        System.out.println("Color:" + " " + smartWatch.color);
        System.out.println("Peso:" + " " + smartWatch.peso);
        System.out.println("Precio:" + " " + smartWatch.precio);
        System.out.println("Pantalla:" + " "+ smartWatch.pantalla);
        System.out.println("Cronometro:" + " " + smartWatch.cronometro);
        System.out.println("temporizador" + " " + smartWatch.temporizador);
        System.out.println("Camara" + " " + smartWatch.camara);
        System.out.println("Capacidad Bateria" + " " + smartWatch.capacidadBateria_mAh);







    }
}
