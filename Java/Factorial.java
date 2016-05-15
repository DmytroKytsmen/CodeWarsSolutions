public class Factorial {

    public static int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }

    }

}