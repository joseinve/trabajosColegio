package com.mycompany.matrices;

import java.util.ArrayList;
import java.util.Scanner;

public class robot {
    static int x = 0, y = 0;

    public static void Robot(int n1, int m1, int y, int x, ArrayList comandos) {

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
        Scanner comando = new Scanner(System.in);
        ArrayList comandos = new ArrayList();
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
        Robot(n1, m1, y, x, comandos);
        n.close();
        comando.close();
        m.close();
    }
}
