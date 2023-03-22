package com.mycompany.condicionales;

import java.util.*;

/*Programa que simula el funcionamiento de una calculadora que puede
realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y
división) con valores numéricos enteros. El usuario debe especificar la
operación con el primer carácter del primer parámetro de la línea de
comandos: S o s para la suma, R o r para la resta, P, p, M o m para el
producto y D o d para la división. Los valores de los operandos se deben indicar
en el segundo y tercer parámetros.*/
public class condicionales3 {
    public static void main(String[] args) {
        Scanner operadores = new Scanner(System.in);
        System.out.print("Operadores" +
                "\n S para Sumar dos valores" +
                "\n R para restar dos valores" +
                "\n M para multiplicar dos valores" +
                "\n D para dividir dos valores" +
                "\nIngrese un operador: ");
        String operador = operadores.nextLine().toUpperCase();
        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingrese dos numeros ");
        System.out.print("Número1: ");
        int n1 = numeros.nextInt();
        System.out.print("Número2: ");
        int n2 = numeros.nextInt();
        switch (operador) {
            case "S":
                System.out.println("La suma es: " + (n1 + n2));
                break;
            case "R":
                System.out.println("La resta es: " + (n1 - n2));
                break;
            case "M":
                System.out.println("El producto es: " + (n1 * n2));
                break;
            case "D":
                System.out.println("La divición es: " + (n1 / n2));
                break;
            default:
                System.out.println("operador no valido");
                break;
        }
        operadores.close();
        numeros.close();
    }
}
