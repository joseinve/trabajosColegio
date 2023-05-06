package com.mycompany.matrices;

import java.util.ArrayList;
import java.util.Scanner;

public class robot {
    static int x = 0, y = 0;

    public static void Robot(int n1, int m1, char[] coman2, String o) {
        int num = 0;
        int orientacion = 0;
        switch (o.toUpperCase()) {
            case "N":
                orientacion = 0;
                break;
            case "S":
                orientacion = 2;
                break;
            case "E":
                orientacion = 1;
                break;
            case "O":
                orientacion = 3;
                break;
        }
        for (int i = 0; i < coman2.length; i += 2) {
            switch (coman2[i + 1]) {
                case '0':
                    num = 0;
                    break;
                case '1':
                    num = 1;
                    break;
                case '2':
                    num = 2;
                    break;
                case '3':
                    num = 3;
                    break;
                case '4':
                    num = 4;
                    break;
                case '5':
                    num = 5;
                    break;
                case '6':
                    num = 6;
                    break;
                case '7':
                    num = 7;
                    break;
                case '8':
                    num = 8;
                    break;
                case '9':
                    num = 9;
                    break;
            }
            switch (coman2[i]) {
                case 'a':
                    switch (orientacion) {
                        case 0:
                            y += num;
                            break;
                        case 1:
                            x += num;
                            break;
                        case 2:
                            y -= num;
                            break;
                        case 3:
                            x -= num;
                            break;
                        case 4:
                            y += num;
                            break;
                        case 5:
                            x += num;
                            break;
                        case 6:
                            y -= num;
                            break;
                        case 7:
                            x -= num;
                            break;
                        case 8:
                            y -= num;
                            break;
                        case 9:
                            x -= num;
                            break;

                    }
                    break;
                case 'r':
                    switch (num) {
                        case 0:
                            orientacion += num;
                            break;
                        case 1:
                            orientacion += num;
                            break;
                        case 2:
                            orientacion += num;
                            break;
                        case 3:
                            orientacion += num;
                            break;
                        case 4:
                            orientacion += num;
                            break;
                        case 5:
                            orientacion += num;
                            break;
                        case 6:
                            orientacion += num;
                            break;
                        case 7:
                            orientacion += num;
                            break;
                        case 8:
                            orientacion += num;
                            break;
                        case 9:
                            orientacion += num;
                            break;
                    }
                    break;
            }
        }
        System.out.println("La posición del robot es " + y + " " + x);
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas del mapa:");
        int n1 = n.nextInt();
        System.out.print("Ingrese la cantidad de columnas del mapa:");
        int m1 = m.nextInt();
        System.out.print("Ingrese la fila inicial del robot:");
        y = n.nextInt();
        System.out.print("Ingrese la columna inicial del robot:");
        x = m.nextInt();
        System.out.print("Ingrese la posición inicial del robot:");
        Scanner o = new Scanner(System.in);
        String orIn = o.nextLine();
        Scanner comando = new Scanner(System.in);
        String comandos = "";
        System.out.println("Introduzca los comandos a seguir");
        String com = "";
        while (!(com.contains("salir"))) {
            com = comando.nextLine();
            if (!(com.contains("salir"))) {
                comandos += com.toLowerCase();
            }
        }
        char coman2[] = comandos.toCharArray();
        while (true) {
            if (x > m1 || y > n1) {
                System.out.println("La posición del robor debe estar dentro de los limites del mapa");
                System.out.print("Ingrese la fila inicial del robot:");
                y = n.nextInt();
                System.out.print("Ingrese la columna inicial del robot:");
                x = m.nextInt();
            } else {
                break;
            }
        }
        Robot(n1, m1, coman2, orIn);
        o.close();
        n.close();
        comando.close();
        m.close();
    }
}