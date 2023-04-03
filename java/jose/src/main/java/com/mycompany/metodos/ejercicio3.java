package com.mycompany.metodos;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Escoge \n" +
                "1)Aréa del cuadrado \n" +
                "2)Aréa del circulo \n" +
                "3)Aréa del triangulo \n");
        Scanner num = new Scanner(System.in);
        int areas = num.nextInt();
        switch (areas) {
            case 1:
                System.out.println("EL area del cuadrado es " + cuadrado());
                break;
            case 2:
                System.out.println("EL area del circulo es " + circulo());
                break;
            case 3:
                System.out.println("EL area del triangulo es " + triangulo());
                break;

            default:
                System.out.println("Ingrese una opción valida");
                break;
        }
        num.close();
    }

    public static double cuadrado() {
        System.out.print("Ingrese el lado del cuadrado: ");
        Scanner lado = new Scanner(System.in);
        double lados = lado.nextInt();
        double area = lados * lados;
        lado.close();
        return area;
    }

    public static double circulo() {
        System.out.print("Ingrese el radio del circulo: ");
        Scanner radio = new Scanner(System.in);
        double radios = radio.nextInt();
        double area = (3.14 * radios);
        radio.close();
        return area;
    }

    public static double triangulo() {
        System.out.print("Ingrese la base del triangulo: ");
        Scanner lado = new Scanner(System.in);
        double base = lado.nextInt();
        System.out.print("Ingrese la altura del triangulo: ");
        double altura = lado.nextInt();
        double area = (base * altura) / 2;
        lado.close();
        return area;
    }
}
