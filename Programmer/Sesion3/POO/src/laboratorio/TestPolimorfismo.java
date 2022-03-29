package laboratorio;

public class TestPolimorfismo {
    public static void main (String[] args) {

        Alquiler contrato = new Alquiler(10);
        // Poli ==> varios  Morfo = formas
        Pelicula oscar = new Pelicula();
        System.out.println( oscar.calcularImporte(contrato) );
        Equipo vhs = new Equipo();
        System.out.println( vhs.calcularImporte(contrato) );

        Juego mu = new Juego("Nintendo");
        System.out.println( mu.calcularImporte(contrato) );
        Libro agua = new Libro();
        System.out.println( agua.calcularImporte(contrato) );
    }
}