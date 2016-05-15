public class CompleteThePattern {
    public static String pattern(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = n; i > 0; i--) {
            StringBuilder cycleResult = new StringBuilder();
            for (int j = 0; j < i; j++) {
                cycleResult.append(n - j);
            }
            if (i > 1)
                cycleResult.append("\n");
            result.append(cycleResult.toString());
        }
        return result.toString();
    }
}