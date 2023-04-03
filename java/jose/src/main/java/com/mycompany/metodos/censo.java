package com.mycompany.metodos;

import java.util.Scanner;

public class censo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número correspondiente a la función que desea ejecutar:");
        System.out.println("1. decada");
        System.out.println("2. esmayor");
        System.out.println("3. nombrecompleto");
        System.out.println("4. cantidadmayores");

        int opcion = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el año de nacimiento (entre 1900 y 2020 inclusive):");
                int fecha = sc.nextInt();
                int decada = decada(fecha);
                System.out.println("La década de nacimiento es: " + decada);
                break;
            case 2:
                System.out.println("Ingrese la edad (entre 0 y 120 inclusive):");
                int edad = sc.nextInt();
                boolean esMayor = esmayor(edad);
                if (esMayor) {
                    System.out.println("La persona es mayor de edad");
                } else {
                    System.out.println("La persona es menor de edad");
                }
                break;
            case 3:
                System.out.println("Ingrese el nombre:");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el apellido:");
                String apellido = sc.nextLine();
                String nombreCompleto = nombrecompleto(nombre, apellido);
                System.out.println("El nombre completo es: " + nombreCompleto);
                break;
            case 4:
                System.out.println("Ingrese la cantidad de edades que desea procesar:");
                int n = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea

                int[] edades = new int[n];
                System.out.println("Ingrese las edades separadas por un espacio:");
                String[] edadesStr = sc.nextLine().split(" ");
                for (int i = 0; i < n; i++) {
                    edades[i] = Integer.parseInt(edadesStr[i]);
                }

                int cantidadMayores = cantidadmayores(edades);
                System.out.println("La cantidad de personas mayores de edad es: " + cantidadMayores);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        sc.close();
    }

    public static int decada(int fecha) {
        int decada = fecha % 100;
        return decada;
    }

    public static boolean esmayor(int edad) {
        boolean esMayor = edad >= 18;
        return esMayor;
    }

    public static String nombrecompleto(String nombre, String apellido) {
        String nombreCompleto = nombre + " " + apellido;
        return nombreCompleto;
    }

    public static int cantidadmayores(int[] edades) {
        int cantidadMayores = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                cantidadMayores++;
            }
        }
        return cantidadMayores;
    }
}