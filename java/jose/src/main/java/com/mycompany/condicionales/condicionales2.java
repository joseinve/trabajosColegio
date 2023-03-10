package com.mycompany.condicionales;
// Construir un programa que capture un deporte y despliegue los implementos deportivos apropiados.

import java.util.Scanner;

public class condicionales2 {
    public static void main(String[] args) {

        Scanner deporte = new Scanner(System.in);
        System.out.print("ingrese uno de los siguientes valores para ver los implementos de cada deporte"+
        "\n A para ver los implementos del Futball"+
        "\n B para ver los implementos del Tenis"+
        "\n C para ver los implementos del Basquetball"+
        "\n D para ver los implementos del Handball"+
        "\nIngrese un valor:  ");
        String deportes = deporte.nextLine().toUpperCase();
        String[][] implementos = 
        { 
            {"  -Jersey o Camisetas","  -Pantalones o shorts","  -Calcetines","  -Espinilleras o canilleras","  -Zapatillas o botas"},
            {"  -pantalones cortos","  -camiseta elástica","  -zapatillas de tenis","  -Una raqueta"}, 
            {"  -Balón","  -Canasta","  -Tablero","  -Cancha"}, 
            {"  -camiseta","  -pantalon","  -zapatos","  -balon","  -protectores"} 
        };
        switch (deportes) {
            case "A":
                System.out.println("Los implementos para el futball son: ");
                for (int i = 0; i < implementos.length; i++) {
                    System.out.println(implementos[0][i]);
                }
                break;
            case "B":
                for (int i = 0; i < implementos.length; i++) {
                    System.out.println(implementos[0][i]);
                }
                break;
            case "C":
                for (int i = 0; i < implementos.length; i++) {
                    System.out.println(implementos[1][i]);
                }
                for (int i = 0; i < implementos.length; i++) {
                    System.out.println(implementos[2][i]);
                }
                break;
            case "D":
                for (int i = 0; i < implementos.length; i++) {
                    System.out.println(implementos[3][i]);
                }
                break;

            default:

                break;
        }
        deporte.close();
    }
}
