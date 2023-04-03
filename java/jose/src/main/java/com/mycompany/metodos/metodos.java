package com.mycompany.metodos;

import java.util.*;

public class metodos {
    public static void main(String[] args) {

        System.out.println("Ingrese su nombre");
        Scanner a = new Scanner(System.in);
        String nombre = a.nextLine();
        saludo(nombre);

        a.close();
    }

    public static void saludo(String nombre) {
        System.out.println("hola  " + nombre);
    }

}
