/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author luisjc
 */
public enum TipoAuto {
    SEDAN("normal",4,"Auto Mediano"),
    PICKUP("Pickup", 4, "Camioneta"),
    SPORT("Deportivo", 2, "Deportivo");
    
    private final String nombre;
    private final int numpuertas;
    private final String descripcion;

    private TipoAuto(String nombre, int numpuertas, String descripcion) {
        this.nombre = nombre;
        this.numpuertas = numpuertas;
        this.descripcion = descripcion;
    }

    public static TipoAuto getSEDAN() {
        return SEDAN;
    }

    public static TipoAuto getPICKUP() {
        return PICKUP;
    }

    public static TipoAuto getSPORT() {
        return SPORT;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumpuertas() {
        return numpuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
