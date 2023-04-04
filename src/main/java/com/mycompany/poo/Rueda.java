/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author luisjc
 */
public class Rueda {

    private String fabricante;
    private double ancho;
    private int aro;

    public Rueda(String fabricante, double ancho, int aro) {
        this.fabricante = fabricante;
        this.ancho = ancho;
        this.aro = aro;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getAncho() {
        return ancho;
    }

    public int getAro() {
        return aro;
    }

}
