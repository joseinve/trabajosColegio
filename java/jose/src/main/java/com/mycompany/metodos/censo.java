package com.mycompany.metodos;

import java.util.ArrayList;

public class censo {
    public static void main(String[] args) {
        ArrayList<Integer> edades = new ArrayList<Integer>();
        System.out.println(nombreCompleto("José", "Díaz"));
        System.out.println(
                esmayor(40));
        System.out.println(
                mayores(edades));
        System.out.println(
                decada("2022"));
    }

    public static String nombreCompleto(String nombre, String apellido) {
        return nombre + " " + apellido;
    }

    public static int mayores(ArrayList<Integer> edades) {
        int c = 0;
        for (Object object : edades) {
            String o = object.toString();
            if (esmayor(Integer.parseInt(o))) {
                c++;
            }
        }
        return c;
    }

    public static boolean esmayor(int edad) {
        if (edad >= 18) {
            return true;
        }
        return false;
    }

    public static String decada(String fecha) {
        if (fecha.substring(2, 3).contains("0")) {
            return fecha.substring(3);
        } else {
            return fecha.substring(2);
        }
    }
}