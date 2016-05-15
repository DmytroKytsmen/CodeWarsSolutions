class Persist {
    public static int persistence(long n) {
        long result = 1;
        if (n < 10) {
            return 0;
        }
        int counter = 0;
        while (true) {
            long multiplier = n % 10;
            result = result * multiplier;
            n /= 10;


            if (n == 0 && result > 9) {
                n = result;
                result = 1;
                counter++;
            }
            if (n == 0 && result < 10) {
                counter++;
                break;
            }
        }
        return counter;
    }
}