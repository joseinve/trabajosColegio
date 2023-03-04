package strings;

public class ejercicio3 {
	public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
	public static void main(String[] args) {
		String cadena = "hola";
		cadena = cadena+reverse(cadena.substring(0,cadena.length()-1));
		System.out.println("La cadena espejo es "+cadena );
	}
}
