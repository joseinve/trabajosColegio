package com.mycompany.matrices;

import java.util.ArrayList;
import java.util.Scanner;

public class robot {
    static int x = 0, y = 0;

    public static void Robot(int n1, int m1, int y, int x, ArrayList comandos, String o) {
        int num;
        switch (o.toUpperCase()) {
            case "N":

                break;
            case "S":

                break;
            case "E":

                break;
            case "O":

                break;
        }
        for (int i = 0; i < comandos.size(); i += 2) {
            switch (comandos.get(i + 1).toString()) {
                case "0":
                    num = 0;
                    break;
                case "1":
                    num = 1;
                    break;
                case "2":
                    num = 2;
                    break;
                case "3":
                    num = 3;
                    break;
                case "4":
                    num = 4;
                    break;
                case "5":
                    num = 5;
                    break;
                case "6":
                    num = 6;
                    break;
                case "7":
                    num = 7;
                    break;
                case "8":
                    num = 8;
                    break;
                case "9":
                    num = 9;
                    break;
            }
            switch (comandos.get(i).toString()) {
                case "a":

                    break;
                case "r":

                    break;
            }
        }
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
        Scanner o = new Scanner(System.in);
        String orientacion = o.nextLine();
        Scanner comando = new Scanner(System.in);
        ArrayList comandos = new ArrayList();
        for (int i = 0; i < args.length; i++) {

        }
        System.out.println("Introduzca los comandos a seguir");
        String com = comando.nextLine().toLowerCase();
        while (!com.contains("salir")) {
            com = comando.nextLine().toLowerCase();
            if (!com.contains("salir")) {
                comandos.add(com);
            }
        }
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
        Robot(n1, m1, y, x, comandos, orientacion);
        n.close();
        comando.close();
        m.close();
    }
}
