package ejercicios;

import java.util.Scanner;

public class galonesAlitros {
	public static void main(String[] args) {
		System.out.println("Ingrese la cantidad de galones de gasolina");
		try (Scanner galones = new Scanner(System.in)) {
			int galonesGasolina= galones.nextInt();
			double litrosGasolina=galonesGasolina*3.785;
			double precioGasolina=litrosGasolina*5000;
			System.out.println("El precio de la gasolina es: ");
			System.out.println(precioGasolina);
		}
	}
}