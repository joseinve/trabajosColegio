package com.mycompany.ejercicios;

import java.util.*;

public class refran {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de palabras");
        Scanner palabra = new Scanner(System.in);
        int p = palabra.nextInt();
        String pal1;
        String palabras = "";
        Scanner pal = new Scanner(System.in);
        for (int i = 0; i < p; i++) {
            pal1 = pal.nextLine();
            int tamano = pal1.length();
            boolean esPar = (tamano % 2 == 0);

            if (tamano == 1 || tamano == 3) {
                palabras = palabras + " " + pal1;
                continue;
            }

            if (esPar) {
                StringBuilder pal2 = new StringBuilder(pal1);
                pal1 = " " + pal2.reverse().toString();
                palabras = palabras + " " + pal1;
                continue;
            }

            int med = (tamano / 2);
            palabras = palabras + " " + pal1.substring((med + 2), tamano) + pal1.substring((med - 1), (med + 2))
                    + pal1.substring(0, med - 1);
        }
        System.out.println(palabras);
        palabra.close();
        pal.close();
    }
}
