/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author luisjc
 *
 */

/*
 * EL objeto static le pertenece al obj no a la instancia
 * por lo que podra compartir el mismo valor para TODAS las instancias.
 * 
 * Final = constante, no puede ser modificable.Debe ser para la clase(static) no para el objeto
    se escriben en MAYUSCULAS
    
 **/
public class Auto {

    //**********************Atributos de la clase Auto
    private int id;
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindro;
    private int capacidadGas = 40;
    private static int ultimo;
    private static int capacidadGasstatic = 10;
    private static String colorpatente;

    public static final Integer VELOCIDADMAXCARRETERA = 120;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 80;
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_VERDE = "Verde";
    public static final String COLOR_AZUL = "Azul";

    //*****************constructores de la clase.
    public Auto() {
        this.id = ++ultimo;
    }

    public Auto(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Auto(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Auto(String fabricante, String modelo, String color, double cilindro) {
        this(fabricante, modelo, color);
        this.cilindro = cilindro;
    }

    public Auto(String fabricante, String modelo, String color, double cilindro, int capacidadGas) {
        this(fabricante, modelo, color, cilindro);
        this.capacidadGas = capacidadGas;
    }

    public int getId() {
        return id;
    }

    //*****************************getter and setter
    public void setId(int id) {
        this.id = id;
    }

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

    public static String getColorpatente() {
        return colorpatente;
    }

    public static void setColorpatente(String colorpatente) {
        //usamos nombre de la clase, NO this.
        Auto.colorpatente = colorpatente;
    }

    public static int getCapacidadGasstatic() {
        return capacidadGasstatic;
    }

    public static void setCapacidadGasstatic(int capacidadGasstatic) {
        Auto.capacidadGasstatic = capacidadGasstatic;
    }

    //************************Metodos de la clase Auto
    public String detalle() {

        return this.getFabricante() + "\n"
                + this.id + "\n"
                + this.modelo + "\n"
                + this.color + "\n"
                + colorpatente + "\n"
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
        return km / (this.capacidadGas * (porcentajedegas / 100f));
    }

    public static float calcularConsumostatic(int km, int porcentajedegas) {
        return km / (Auto.capacidadGasstatic * (porcentajedegas / 100f));
    }

    //**************************Sobreescritura de metodos
    @Override //indica al compilador que estamos sobreescribiendo un metodo de la clase padre
    public boolean equals(Object obj) {
        if (!(obj instanceof Auto)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Auto a = (Auto) obj;
        return (this.getFabricante() != null && this.getFabricante().equalsIgnoreCase(a.getFabricante())); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}

//this hace referencia un atributo de la clase de manera explicita. 
