public class Operaciones {
    public static void main(String[] args) {
        int a = 7, b = 2;
        double division = 0;
        try{ // Probar
            division = a / b;
            System.out.println("División: " + division);
        }
        catch (ArithmeticException e){
            System.out.println("ERROR: División entre 0");
        }
    }
}
