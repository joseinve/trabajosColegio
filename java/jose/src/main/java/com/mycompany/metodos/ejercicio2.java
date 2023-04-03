package com.mycompany.metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        binarios();
    }

    public static void binarios() {
        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();
        ArrayList<Integer> resto = new ArrayList<>();
        while (true) {
            resto.add(num % 2);
            num /= 2;
            if ((num / 2) == 0) {
                resto.add(num % 2);
                break;
            }
        }
        for (int i = resto.size() - 1; i >= 0; i--) {
            System.out.print(resto.get(i));

        }
        numero.close();
    }
}
