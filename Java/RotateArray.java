public class Rotator {
    public Object[] rotate(Object[] arr, int order) {
        if (arr == null) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        while (order < 0) {
            order += arr.length;
        }
        for (int i = 0; i < order; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                Object temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        return arr;
    }
}