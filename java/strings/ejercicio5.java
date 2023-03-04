package strings;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		Scanner cadena1 = new Scanner(System.in);
		String cadena_1 = cadena1.nextLine();
		Scanner cadena2 = new Scanner(System.in);
		String cadena_2 = cadena1.nextLine();
		String[] cadena3 = cadena_2.split(" ");
		for (String cadena : cadena3) {
			cadena_1 = cadena_1.replaceAll(cadena, cadena.toUpperCase());
		}
		System.out.println(cadena_1);
		cadena1.close();
		cadena2.close();

	}
}