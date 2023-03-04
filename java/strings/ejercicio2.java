package strings;

import java.util.Scanner;

// Ingresar un número telefónico en formato de cadena y luego lo convierta a formato número telefónico
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        String numeroTelefonico = numero.nextLine();
        if (numeroTelefonico.length() == 10) {
            numeroTelefonico="("+numeroTelefonico.substring(0, 4)+") "+numeroTelefonico.substring(4,7)+"-"+numeroTelefonico.substring(7, 10);
        System.out.println(numeroTelefonico);
        } else {
            System.out.println("El valor debe ser mayor a 10");
        }
        numero.close();
    }
}