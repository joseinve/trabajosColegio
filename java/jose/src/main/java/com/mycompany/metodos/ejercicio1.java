package com.mycompany.metodos;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = numero.nextInt();
        juego(num);
        numero.close();
    }

    public static void juego(int num) {
        Scanner numero = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Ingrese una numero");
        int cont = 0;
        int num2 = numero.nextInt();
        while (true) {
            if (num > num2) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("El numero ingresado es menor al que buscas, vuelve a intentar");
                num2 = numero.nextInt();
                cont++;
                continue;
            }
            if (num < num2) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("El numero ingresado es mayor al que buscas, vuelve a intentar");
                num2 = numero.nextInt();
                cont++;
                continue;
            }
            System.out.println("Has hacertado");
            System.out.println("Tuviste " + cont + " errores");
            break;
        }
        numero.close();
    }
}
