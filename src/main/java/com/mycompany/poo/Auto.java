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

    //Metodos de la clase Auto
    public void detalle() {
        System.out.println(
                this.fabricante + "\n"
                + this.modelo + "\n"
                + this.color + "\n"
                + this.cilindro
        );
    }
}

//this hace referencia un atributo de la clase de manera explicita. 