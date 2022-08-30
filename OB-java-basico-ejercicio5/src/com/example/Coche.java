package com.example;

public class Coche {

    String marca;
    String modelo;
    String color;
    int year;
    double cilindrada;
    int maximaPotencia_HP;
    double maximoTorque_kgm;


    public Coche() {

    }

    public Coche(String marca, String modelo, String color, int year, double cilindrada, int maximaPotencia_HP, double maximoTorque_kgm) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.year = year;
        this.cilindrada = cilindrada;
        this.maximaPotencia_HP = maximaPotencia_HP;
        this.maximoTorque_kgm = maximoTorque_kgm;
    }


    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", cilindrada=" + cilindrada +
                ", maximaPotencia_HP=" + maximaPotencia_HP +
                ", maximoTorque_kgm=" + maximoTorque_kgm +
                '}';
    }
}
