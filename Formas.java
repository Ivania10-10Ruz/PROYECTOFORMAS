/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoformas;

/**
 *
 * @author Graciela
 */

abstract class Formas {
    private String color;

    // Método para establecer el color
    public void establecerColor(String color) {
        this.color = color;
    }

    // Método abstracto para dibujar
    abstract void dibujar();
}