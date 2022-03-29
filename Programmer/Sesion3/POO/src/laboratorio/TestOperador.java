package laboratorio;

public class TestOperador {
    public static void main (String[] args) {
        Pelicula oscar = new Pelicula();
        Equipo vhs = new Equipo();
        Juego mu = new Juego("Nintendo");
        Libro agua = new Libro();

        testOperador(oscar);
        testOperador(vhs);
        testOperador(mu);
        testOperador(agua);
    }
    public static void testOperador (Item articulo) {
        if (articulo instanceof Juego) {
            Juego juego = (Juego) articulo;
            System.out.println(juego.getFabricante());
        }
        else {
            System.out.println("No tiene Fabricante");
        }
    }
}
