public class Sumatoria {
    public static void main(String[] args) {
        int n = 9;
        long suma = S(n);
        long fibonacci = Fib(n);
        System.out.println(suma);
        System.out.println(fibonacci);
    }

    private static long S(int n) {
        long suma = 0; // S(n) = n + S(n-1)
        if (n == 0) return 0;
        suma = n + S(n-1);
        return suma;
    }
    //Fib(n) = Fib(n-1) + Fib(n-2)
    private static long Fib(int n) {
        long suma = 0; // S(n) = n + S(n-1)
        if (n == 0) return 0;
        if (n == 1) return 1;
        suma = Fib(n-1) + Fib(n-2);
        return suma;
    }
}
