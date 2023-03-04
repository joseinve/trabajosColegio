package strings;

import java.util.Scanner;

// Crea una archivo java, el cual debe recibir 3 cadenas de texto y devolver una cadena de texto combinación de: las dos primeras letras de la primera cadena, seguidas por un espacio en blanco, seguidas de las cuatro primeras letras de la segunda cadena, seguidas de un guion medio, seguido de las 6 primeras letras de la tercera cadena y su longitud.
public class ejercicio1 {
	public static void main(String[] args) {
		System.out.println("Ingrese la primera cadena de texto");
		Scanner cadena1 = new Scanner(System.in);
		String cadena_1 = cadena1.nextLine();
		System.out.println("Ingrese la segunda cadena de texto");
		Scanner cadena2 = new Scanner(System.in);
		String cadena_2 = cadena2.nextLine();
		System.out.println("Ingrese la tercera cadena de texto");
		Scanner cadena3 = new Scanner(System.in);
		String cadena_3 = cadena3.nextLine();
		String cadena4 = cadena_1.substring(0,2) + " " + cadena_2.substring(0,4) + "-" + cadena_3.substring(0,6);
		System.out.println("La cadena es "+cadena4);
		System.out.println("El tamaño de la cadena es de "+ cadena4.length()+" caracteres");
		
		cadena1.close();
		cadena2.close();
		cadena3.close();
	}
}
