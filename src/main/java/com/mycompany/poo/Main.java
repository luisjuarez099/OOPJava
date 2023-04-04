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
        mercedez.setTipo(TipoAuto.SPORT);
        mercedez.setColor(Color.AZUL);
        mercedez.setModelo("G63");
        mercedez.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        //accedemos a los atributos static de la clase
        System.out.println(mercedez.detalle());
        
        System.out.println("");
        //segundo objeto
        Auto mazda=new Auto("Mazda", "CX-5", Color.ROJO, new Motor(1.5, TipoMotor.GASOLINA));
        Motor motormazda=new Motor(2.0, TipoMotor.GASOLINA);
        mazda.setTipo(TipoAuto.SPORT);
        mazda.setColor(Color.ROJO);
        mazda.setMotor(motormazda);
        System.out.println("DETALLE MAZDA  "+mazda.detalle());
        
    }
}
