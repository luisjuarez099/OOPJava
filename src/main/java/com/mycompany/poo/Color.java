/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author luisjc
 */
/**
 * enum sirve para coleccionar valores constantes se escriben en mayusculas
 */
public enum Color {
    ROJO("Rojo"),
    AZUL("Azul");

    private final String color;

    private Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color; //toma el valor que esta pasando por argumento: ROJO("Rojo").
    }

}
