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
        //primer objeto
        Auto mercedez = new Auto("Mercedez", "G63");
        mercedez.setModelo("G63");
        mercedez.setCilindro(51);
                
        System.out.println(mercedez.detalle());
        System.out.println(mercedez.acelerar(3000));
        System.out.println(mercedez.frenar());
        System.out.println(mercedez.acelerarFrenar(4500));
        System.out.println(mercedez.calcularConsumo(300, 0.6f));
        System.out.println(mercedez.calcularConsumo(300, 60));
        
        System.out.println("");
        //segundo objeto
        Auto mazda=new Auto("Mazda", "MX-5");
        mazda.setColor("Rojo");
        mazda.setCilindro(66);
        System.out.println(mazda.detalle());
        System.out.println(mazda.acelerar(3000));
        System.out.println(mazda.frenar());
        System.out.println(mazda.acelerarFrenar(4500));
        System.out.println(mazda.calcularConsumo(150, 0.7f));
        System.out.println(mazda.calcularConsumo(150, 70));
        

    }
}
