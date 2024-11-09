/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoformas;

/**
 *
 * @author Graciela
 */
public class Linea extends Formas {
    private double largo;

    public Linea(double largo) {
        this.largo = largo;
    }

    public void dibujar() {
        System.out.println("Realizando una linea.");
    }
}
