public class Sum {
    public int GetSum(int a, int b) {
        int result = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (a == b) {
            return a;
        }
        for (; min <= max; min++) {
            result += min;
        }
        return result;
    }
}