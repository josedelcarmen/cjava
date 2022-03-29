import Funciones.Matematicas;

public class Casting {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]); // Conversión a entero de un String
        double b = Double.parseDouble(args[1]);
        double suma = Matematicas.sumar(a, b);
        System.out.println("La suma de " + a + " y de " + b + " es: " + suma);
        double resta = Matematicas.restar(a, b);
        System.out.println("La resta de " + a + " y de " + b + " es: " + resta);
        System.out.println("El valor de PI es: " + Matematicas.PI);
    }

    private static double resta(double a, double b) {
        return a - b;
    }
}
