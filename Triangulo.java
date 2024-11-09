/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoformas;

/**
 *
 * @author Graciela
 */
public class Triangulo extends Formas {
    private double angulo;

    public Triangulo(double angulo) {
        this.angulo = angulo;
    }

    public void calcularArea() {
        System.out.println("Calculando el area del triangulo.");
    }

    public void dibujar() {
        System.out.println("Realizando un triangulo.");
    }
}

