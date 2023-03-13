package com.mycompany.jany;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        String b = a.nextLine();
        System.out.print(b);
        a.close();
    }
}
