import java.math.BigInteger;

class QuickCalc {

    public static BigInteger choose(long n, long p) {
        BigInteger factorials = BigInteger.valueOf(1);

        for (long i = n - p + 1; i <= n; i++) {
            factorials = factorials.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorials);
        System.out.println(factorial(BigInteger.valueOf(p)));
        BigInteger result = factorials.divide(factorial(BigInteger.valueOf(p)));
        return result;
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.valueOf(1)))
            return n;
        else {
            return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
        }
    }
}