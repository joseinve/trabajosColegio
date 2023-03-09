package com.mycompany.condicionales;

import java.util.Scanner;

public class condicionales1 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Ingrese el número del mes: ");
        int mes = numero.nextInt();
        String[] meses = {"Enero","Febrero","marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","Noviembre","Diciembre"} ;
        if (mes == 1) {
            System.out.println("El mes es "+meses[0]);
        } else if (mes == 2) {
            System.out.println("El mes es "+meses[1]);
        } else if (mes == 3) {
            System.out.println("El mes es "+meses[2]);
        } else if (mes == 4) {
            System.out.println("El mes es "+meses[3]);
        } else if (mes == 5) {
            System.out.println("El mes es "+meses[4]);
        } else if (mes == 6) {
            System.out.println("El mes es "+meses[5]);
        } else if (mes == 7) {
            System.out.println("El mes es "+meses[6]);
        } else if (mes == 8) {
            System.out.println("El mes es "+meses[7]);
        } else if (mes == 9) {
            System.out.println("El mes es "+meses[8]);
        } else if (mes == 10) {
            System.out.println("El mes es "+meses[9]);
        } else if (mes == 11) {
            System.out.println("El mes es "+meses[10]);
        } else if (mes == 12) {
            System.out.println("El mes es "+meses[11]);
        }
        numero.close();
    }
}
