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
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindro;
    private int capacidadGas = 40;
    //constructores de la clase.
    public Auto() {
    }

    public Auto(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    
    
    
    //getter and setter
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindro() {
        return cilindro;
    }

    public void setCilindro(double cilindro) {
        this.cilindro = cilindro;
    }

    public int getCapacidadGas() {
        return capacidadGas;
    }

    public void setCapacidadGas(int capacidadGas) {
        this.capacidadGas = capacidadGas;
    }
    
    //Metodos de la clase Auto
    public String detalle() {

        return this.getFabricante() + "\n"
                + this.modelo + "\n"
                + this.color + "\n"
                + this.getCilindro();

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
