class DivSeven {
    public static long[] seven(long m) {
        // your code
        int count = 0;
        while (m / 100 != 0) {
            long divisor = m % 10;
            m /= 10;
            m -= divisor * 2;
            count++;
        }
        return new long[]{m, count};
    }
}