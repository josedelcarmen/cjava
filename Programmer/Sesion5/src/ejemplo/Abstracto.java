package ejemplo;

public class Abstracto {
    public static void main  (String[] args) {
        Pelicula pelicula = new Pelicula();
        Libro libro       = new Libro();

        System.out.println("La Película:");
        System.out.println(pelicula.esAlquilable());
        System.out.println(pelicula.getPrecio());
        System.out.println(pelicula.precio);

        System.out.println("El libro:");
        System.out.println(libro.esAlquilable());
        System.out.println(libro.getPrecio());
    }
}