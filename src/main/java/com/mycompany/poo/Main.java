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
        Auto.setColorpatente(Color.AZUL);//se aplica en todos los metodos.
        Auto mercedez = new Auto("Mercedez", "G63",Color.AZUL);
        mercedez.setColor(Color.AZUL);
        mercedez.setModelo("G63");
        mercedez.setCilindro(51);
        //accedemos a los atributos static de la clase
        System.out.println(mercedez.detalle());
        System.out.println(mercedez.acelerar(3000));
        System.out.println(mercedez.frenar());
        System.out.println(mercedez.acelerarFrenar(4500));
        System.out.println(mercedez.calcularConsumo(300, 0.6f));
        System.out.println(mercedez.calcularConsumo(300, 60));
        
        System.out.println("");
        //segundo objeto
        Auto mazda=new Auto("Mazda", "CX-5", Color.ROJO);
        mazda.setColor(Color.ROJO);
        mazda.setCilindro(66);
        System.out.println("DETALLE MAZDA"+mazda.detalle());
        System.out.println(mazda.acelerar(3000));
        System.out.println(mazda.frenar());
        System.out.println(mazda.acelerarFrenar(4500));
        System.out.println(mazda.calcularConsumo(150, 0.7f));
        System.out.println(mazda.calcularConsumo(150, 70));
        System.out.println(Auto.getColorpatente());
        Auto.setCapacidadGasstatic(45);
        System.out.println(Auto.calcularConsumostatic(300, 60));
        System.out.println("VELOCIDAD MAXIMA: "+Auto.VELOCIDADMAXCARRETERA);
        System.out.println("VELOCIDAD MAXIMA CIUDAD: "+Auto.VELOCIDAD_MAX_CIUDAD);
        //comparacion equals
//        System.out.println(mercedez ==  mazda);
//        System.out.println("Iguales?: "+mercedez.equals(mazda));
        
    }
}
