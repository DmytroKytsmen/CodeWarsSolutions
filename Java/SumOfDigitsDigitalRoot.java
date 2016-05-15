public class DRoot {
    public static int digital_root(int n) {
        int result = 0;
        while (true) {
            result += n % 10;
            n /= 10;
            if (n == 0 && result / 10 > 0) {
                n = result;
                result = 0;
            }
            if (n == 0 && result / 10 == 0) {
                break;
            }
        }
        return result;
    }
}