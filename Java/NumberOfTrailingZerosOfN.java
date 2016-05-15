public class Solution {
    public static int zeros(int n) {
        // your beatiful code here
        int counter = 0;
        for (int i = 5; i <= n; i *= 5) {
            counter += n / i;
        }
        return counter;
    }
}