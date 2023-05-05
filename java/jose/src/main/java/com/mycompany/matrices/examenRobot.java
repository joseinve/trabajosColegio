package com.mycompany.matrices;

import java.util.Scanner;

public class examenRobot {
    public static void robot(int x, int y, String s, int n, int m, int o, char[] comandos) {
        for (int i = 0; i < comandos.length; i += 2) {
            int num = 0;
            o /= 90;
            switch (comandos[i + 1]) {
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
            switch (comandos[i]) {
                case 'A':
                    switch (o) {
                        case 0:
                            y += 1 * num;
                            break;
                        case 1:
                            x += 1 * num;
                            break;
                        case 2:
                            y -= 1 * num;
                            break;
                        case 3:
                            x -= 1 * num;
                            break;
                    }
                    break;
                case 'R':
                    switch (o) {
                        case 0:
                            o += 90 * num;
                            break;
                        case 1:
                            o += 90 * num;
                            break;
                        case 2:
                            o += 90 * num;
                            break;
                        case 3:
                            o += 90 * num;
                            break;
                        case 4:
                            o += 90 * num;
                            break;
                        case 5:
                            o += 90 * num;

                            break;
                        case 6:
                            o += 90 * num;

                            break;
                        case 7:
                            o = 90 * num;

                            break;
                        case 8:
                            o = 90 * num;

                            break;
                        case 9:
                            o = 90 * num;
                            break;
                    }
                    break;
            }
        }
        System.out.println("Fila: " + y + " Columna: " + x);
    }

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        Scanner p = new Scanner(System.in);
        System.out.println("Ingrese la columna inicial del robot");
        int x = c.nextInt();
        System.out.println("Ingrese la fila inicial del robot");
        int y = c.nextInt();
        System.out.println("Ingrese la orientación inicial del robot");
        String s = p.nextLine();
        System.out.println("Ingrese la cantidad de columnas de la cuadricula");
        int n = c.nextInt();
        System.out.println("Ingrese la cantidad de filas de la cuadricula");
        int m = c.nextInt();
        System.out.println("Ingrese la linea de comandos del robot");
        s = s.toUpperCase();
        int o = 0;
        String comando = p.nextLine();
        comando = comando.toUpperCase();
        char[] comandos = comando.toCharArray();
        switch (s) {
            case "N":
                o = 0;
                break;
            case "E":
                o = 90;
                break;
            case "S":
                o = 180;
                break;
            case "O":
                o = 270;
                break;
        }
        if (!(n > 0 && n <= 100) && !(m > 0 && m <= 100)) {
            System.out.println("Los valores deben ser menores o iguales a 100 y mayores a 0");
        } else if (comandos.length / 2 > 10) {
            System.out.println("La cantidad de comandos debe se menor a 11");
        } else {
            robot(x, y, s, n, m, o, comandos);
            c.close();
            p.close();
        }
    }
}
