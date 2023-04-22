package com.mycompany.jany;

import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        double a = numero.nextInt();
        double b = numero.nextInt();
        double aEntreb = a / b;
        double bEntrea = b / a;

        System.out.print(aEntreb);
        System.out.print(bEntrea);
        numero.close();
    }
}
