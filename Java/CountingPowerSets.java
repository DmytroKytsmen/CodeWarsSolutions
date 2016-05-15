import java.math.BigInteger;

public class Powers {
    public static BigInteger powers(int[] list) {
        BigInteger result = new BigDecimal(Math.pow(2, list.length)).toBigInteger();
        return result;
    }
}