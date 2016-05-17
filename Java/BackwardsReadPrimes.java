public class BackWardsPrime {

    public static String backwardsPrime(long start, long end) {
        ArrayList<Long> list = new ArrayList<>();
        for (; start <= end; start++) {
            if (weatherPrime(start) && reverseNumberPrime(start)) {
                list.add(start);
            }
        }
        Long numbers[] = list.toArray(new Long[list.size()]);
        if (numbers.length == 0) {
            return new String();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i] + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();

    }

    public static boolean reverseNumberPrime(long n) {
        long before = n;
        if (n < 10) {
            return false;
        }

        long reverse = 0;
        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }
        if (reverse == before) {
            return false;
        }
        return weatherPrime(reverse);
    }

    public static boolean weatherPrime(long number) {
        if (number <= 1) {
            return true;
        }
        for (long i = 2; i <= (long) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}