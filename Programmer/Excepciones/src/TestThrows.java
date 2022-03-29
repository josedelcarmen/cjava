public class TestThrows {
    public static void main (String[] args) {
        ///              01234
        String cadena = "abcde";
        int posicion = 7;
        char letra = ' ';
        try {
            letra = getLetra(cadena, posicion);
            System.out.println(letra );
        }
        catch (Exception e) {
            System.err.println("Error en "+cadena+" "+posicion);
        }
    }
    public static char getLetra(String cadena, int posicion)
            throws IndexOutOfBoundsException
    {
        char c = cadena.charAt(posicion);
        return c;
    }
}