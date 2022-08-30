package com.example;

public class SmartWatch extends SmartDevice{

    String pantalla;
    String cronometro;
    String temporizador;
    String camara;
    int capacidadBateria_mAh;

    public SmartWatch(){

    }

    public SmartWatch(String marca, String modelo, String color, int peso, double precio, String pantalla, String cronometro, String temporizador, String camara, int capacidadBateria_mAh) {
        super(marca, modelo, color, peso, precio);
        this.pantalla = pantalla;
        this.cronometro = cronometro;
        this.temporizador = temporizador;
        this.camara = camara;
        this.capacidadBateria_mAh = capacidadBateria_mAh;
    }
}
