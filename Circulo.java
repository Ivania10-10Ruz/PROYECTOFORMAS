/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoformas;

/**
 *
 * @author Graciela
 */
public class Circulo extends Formas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void calcularRadio() {
        System.out.println("Calculando el radio: " + radio);
    }

    public void dibujar() {
        System.out.println("Realizando Circulo.");
    }
}
