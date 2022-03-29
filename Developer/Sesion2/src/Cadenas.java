import java.util.Locale;

public class Cadenas {
    public static void main(String[] args) {
        String nombre = "Ana María", apellidos = "Paz Díaz";
        String persona = nombre + " " + apellidos; // Concatenar o encadenar cadenas
        System.out.println(persona);
        System.out.println("Longitud de su nombre: " + persona.length());
        System.out.println(persona.toLowerCase(Locale.ROOT));
        System.out.println(persona.toUpperCase(Locale.ROOT));
    }
}
