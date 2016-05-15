public class DeltaBits {
    public static int convertBits(int a, int b) {
        int[] aBits = getBitsRepresentation(a);
        int[] bBits = getBitsRepresentation(b);
        int result = 0;
        for (int i = aBits.length - 1; i >= 0; i--) {
            if (aBits[i] - bBits[i] != 0)
                result++;
        }
        return result;

    }

    public static int[] getBitsRepresentation(int x) {
        int[] bitArray = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0};
        if (x > 0) {
            for (int i = bitArray.length - 1; i >= 0; i--) {
                bitArray[i] = x % 2;
                x /= 2;
            }
        }

        return bitArray;
    }
}