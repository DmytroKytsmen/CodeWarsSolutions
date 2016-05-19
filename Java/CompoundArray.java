public class CompoundArray {
    public static int[] compoundArray(int[] a, int[] b) {
        // Who Dares wins!
        if (a.length == 0)
            return b;
        if (b.length == 0)
            return a;
        int result[] = new int[a.length + b.length];
        int aCounter = 0;
        int bCounter = 0;
        for (int i = 0; i < result.length; ) {
            if (aCounter < a.length) {
                result[i] = a[aCounter];
                ++i;
                ++aCounter;
            }
            if (bCounter < b.length) {
                result[i] = b[bCounter];
                ++i;
                ++bCounter;
            }
        }
        return result;
    }
}