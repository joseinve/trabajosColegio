package com.mycompany.jose;

public class Jose {
    public static void main(String[] args) {
        int[] hola;
        hola = new int[10];
        for (int i = 0; i < 10; i++) {
            hola[i] = i;
        }
        for (int j = 0; j < hola.length; j++) {
            System.out.println(hola[j]);
        }
    }
}
