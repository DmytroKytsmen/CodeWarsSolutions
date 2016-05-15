class MinMax {
    public static int[] minMax(int[] arr) {
        java.util.Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
    }
}