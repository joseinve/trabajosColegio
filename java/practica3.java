// •Diseñe un programa en java que tome como datos de entrada el capital C en dólares depositado en un banco, el interés R en tanto por ciento y el tiempo T en años que estará depositado el capital. Calcular el interés producido después de T años.
public class practica3 {
    public static void main(String[] args) {
        double C = 47;
        double R = 0.5;
        double T = 10;
        double I = C * R / T;
        System.out.println("El interés producido es: " + I);
    }
}
