/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.poo;

/**
 *
 * @author luisjc
 */
public class Main {

    public static void main(String[] args) {
        Auto mercedez = new Auto();
        mercedez.fabricante = "Mercedez";
        mercedez.modelo = "G63";
        mercedez.color = "Blanco";
        mercedez.cilindro = 8;
        mercedez.detalle();
    }
}
