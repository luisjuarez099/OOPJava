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
        System.out.println(mercedez.detalle());
        System.out.println(mercedez.acelerar(3000));
        System.out.println(mercedez.frenar());
        System.out.println(mercedez.acelerarFrenar(4500));
        System.out.println(mercedez.calcularConsumo(300, 0.6f));
        System.out.println(mercedez.calcularConsumo(300, 60));
        
                

    }
}
