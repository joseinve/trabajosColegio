package ejercicios;
// •Definir cuatro variables, llamadas a, b, c y d. Realizar la suma (a+b), resta (d-c), multiplicación (a*b*c*d) y división (a/b), y mostrar los resultados por pantalla, de forma que se vea qué operación es.
public class practica4 {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int suma = a+b;
        int resta = d-c;
        int producto = a*b*c*d;
        int division = a/b;
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Producto: "+producto);
        System.out.println("División: "+division);
    }
}
