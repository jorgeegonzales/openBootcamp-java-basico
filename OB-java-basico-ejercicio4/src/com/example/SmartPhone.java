package com.example;

public class SmartPhone extends SmartDevice {

    String procesador;
    double velocidadProcesador_GHz;
    String sistemaOperativo;
    int memoriaRam_GB;
    int memoriaInterna_GB;
    int capacidadBateria_mAh;

    public SmartPhone() {

    }

    public SmartPhone(String marca, String modelo, String color, int peso, double precio, String procesador, double velocidadProcesador_GHz, String sistemaOperativo, int memoriaRam_GB, int memoriaInterna_GB, int capacidadBateria_mAh) {
        super(marca, modelo, color, peso, precio);
        this.procesador = procesador;
        this.velocidadProcesador_GHz = velocidadProcesador_GHz;
        this.sistemaOperativo = sistemaOperativo;
        this.memoriaRam_GB = memoriaRam_GB;
        this.memoriaInterna_GB = memoriaInterna_GB;
        this.capacidadBateria_mAh = capacidadBateria_mAh;
    }
}
