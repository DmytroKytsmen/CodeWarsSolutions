public class Dioph {

    public static String solEquaStr(long n) {
        final StringBuilder result = new StringBuilder().append('[');

        for (long p = n, q = 1; q <= n / q; p = n / ++q)
            if (n % q == 0 && (p - q) % 4 == 0)
                result.append(1 < result.length() ? ", [" : "[").append((p + q) / 2).append(", ").append((p - q) / 4).append(']');

        return result.append(']').toString();
    }

}