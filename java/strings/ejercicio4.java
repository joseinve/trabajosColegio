package strings;

import java.util.Scanner;

// Diseña un programa en Java que solicite al usuario una cadena en la que buscará y otra que será la cadena buscada e indique si existe la cadena buscada
public class ejercicio4 {
	public static void main(String[] args) {
		System.out.println("Ingrese una cadena");
		Scanner palabra1 = new Scanner(System.in);
		String palabra_1 = palabra1.nextLine();
		System.out.println("Ingrese la cadena a buscar");
		Scanner	palabra2 = new Scanner(System.in);
		String palabra_2 = palabra2.nextLine();
		if (palabra_1.contains(palabra_2)) {
			System.out.println("La cadena buscada si existe");
		}else{
			System.out.println("La cadena buscada no existe");
		}
		palabra1.close();
		palabra2.close();
	}
}
