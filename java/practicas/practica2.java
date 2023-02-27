package practicas;

// Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
public class practica2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a>b){
            System.out.println("El numero mayor es " + a);
        }
        else if (a<b) {
            System.out.println("El numero mayor es " + b);
        } 
        else if (a==b) {
            System.out.println("Los numeros son iguales");
            }
    }
}
