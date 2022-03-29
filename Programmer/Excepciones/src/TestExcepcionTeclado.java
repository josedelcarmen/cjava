import java.io.*;

public class TestExcepcionTeclado {
    public static void main(String[] args) {
        try {
            String nombre = readString("Ingrese un nombre: ");
            System.out.println("Su longitud es " + nombre.length());

            int entero = readInt("Ingrese un entero: ");
            System.out.println("El cuadrado es " + entero * entero);
        }
        catch (NumberFormatException e) {
            System.out.println("Excepcion numerica");
            System.out.println(e.getMessage());
            //e.printStackTrace(System.err);
        }
        catch (Exception e) {
            System.out.println("Excepcion genérica");
            e.printStackTrace(System.err);
        }
    }

    public static String readString(String etiqueta) throws Exception {
        System.out.print(etiqueta);
        String cadena = "";
        BufferedReader in = new BufferedReader(new
                InputStreamReader(System.in));
        cadena = in.readLine();
        return cadena;
    }

    public static int readInt(String etiqueta) throws Exception {
        int entero = 0;
        String cadena = readString(etiqueta);
        Integer enteroInteger = new Integer(cadena.trim());
        entero = enteroInteger.intValue();
        return entero;
    }
}


