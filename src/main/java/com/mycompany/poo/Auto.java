/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author luisjc
 */
public class Auto {

    //Atributos de la clase Auto
    String fabricante;
    String modelo;
    String color;
    double cilindro;
    int capacidadGas = 40;

    //Metodos de la clase Auto
    public String detalle() {

        return this.fabricante + "\n"
                + this.modelo + "\n"
                + this.color + "\n"
                + this.cilindro;

    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelerta a: " + rpm + " rpm";
    }

    public String frenar() {
        return this.fabricante + " frenado ";
    }

    public String acelerarFrenar(int rpm) {
        //variables locales del metodo
        String acelerar = this.acelerar(rpm); //this tambien se puede usar para metodos dentro de la clase
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajedegas) {
        return km / (porcentajedegas * this.capacidadGas);
    }
    public float calcularConsumo(int km, int porcentajedegas) {
        return km / (this.capacidadGas * (porcentajedegas/100f));
    }
}

//this hace referencia un atributo de la clase de manera explicita. 
