package com.mycompany.ejercicios;
// •Un empleado trabaja 40 horas en la semana a razón de $5 la hora. El porcentaje deretención en la fuente es del 12,5% del salario total. Se desea saber cuál es el valor neto del trabajador y el valor total.
public class practica2 {
    public static void main(String[] args) {
        int total = 40 * 5;
        double retencion = total * 12.5 / 100;
        System.out.println("El total es " + total);
        double neto=total-retencion;
        System.out.println("Su ganancia neta es de " + neto);
    }
}