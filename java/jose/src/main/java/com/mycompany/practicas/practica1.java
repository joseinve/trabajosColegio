package com.mycompany.practicas;

// Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
public class practica1 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(int a, Double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int b = 5;
        int a = 2;
        double c = 3.4;
        sum(a, c);
        sum(a, b);
        System.out.println("La suma de los dos elementos es " + (a + b) + ", la resta de estos es " + (a - b)
                + " ,el producto es " + (a * b) + ", la división es " + (a / b) + " y el modulo es " + (a % b));
    }
}