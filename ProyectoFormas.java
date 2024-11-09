/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoformas;

/**
 *
 * @author Graciela
 */
public class ProyectoFormas {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Linea linea = new Linea(10.0);
        Triangulo triangulo = new Triangulo(60.0);
        Cuadrado cuadrado = new Cuadrado(25.0);

        circulo.dibujar();
        circulo.calcularRadio();

        linea.dibujar();

        triangulo.dibujar();
        triangulo.calcularArea();

        cuadrado.dibujar();
        cuadrado.calcularArea();
    }
}
