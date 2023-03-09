package com.mycompany.operadores;
import java.util.Scanner;

public class operadores2 {
      public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Ingrese el primer valor:");
        double a=numero.nextInt();
        System.out.print("Ingrese el segundo valor:");
        double b=numero.nextInt();
        double AentreB = a/b;
        double BentreA = b/a;
        System.out.println("El cociente entre "+a+" y "+b+" es "+AentreB);
        System.out.println("El cociente entre "+b+" y "+a+" es "+BentreA);
        numero.close();
      }
    }