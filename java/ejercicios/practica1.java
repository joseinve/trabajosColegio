package ejercicios;

import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
        try (Scanner hora = new Scanner(System.in)) {
            System.out.println("Ingrese una cantidad de horasq");
            int horasTotales = hora.nextInt();
            System.out.println("Las cantidad de horas ingrasas es: ");
            int semanas = horasTotales / (24 * 7);
            int dias = horasTotales % (24 * 7) / 24;
            int horas = horasTotales % 24;
            System.out.println("La cantidad de tiempo equivalente es " + semanas + " semanas " + dias + " días y "
                    + horas + " horas");
        }

    }
}