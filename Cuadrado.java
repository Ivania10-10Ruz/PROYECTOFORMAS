/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoformas;

/**
 *
 * @author Graciela
 */
public class Cuadrado extends Formas {
    private double area;

    public Cuadrado(double area) {
        this.area = area;
    }

    public void calcularArea() {
        System.out.println("Calculando el area del cuadrado: " + area);
    }

    public void dibujar() {
        System.out.println("Realizando cuadrado.");
    }
}