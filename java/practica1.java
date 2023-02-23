import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
        System.out.println("Ingrese una cantidad de horas");
        Scanner hora = new Scanner(System.in);
        System.out.println("Las cantidad de horas ingrasas es");
        int horasTotales = hora.nextInt();
        int semanas = horasTotales / (24 * 7);
        int dias = horasTotales % 7;
        int horas=horasTotales%24;
        System.out.println("La cantidad de tiempo equivalente es " + semanas+" semanas "+dias+" días y "+horas+" horas");
    }
}