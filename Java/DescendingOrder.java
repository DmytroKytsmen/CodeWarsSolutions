public class DescendingOrder {
    public static int sortDesc(final int num) {
        String numbers = "" + num;
        char[] nums = numbers.toCharArray();
        java.util.Arrays.sort(nums);
        String result = "";
        for (int i = nums.length - 1; i >= 0; i--) {
            result += String.valueOf(nums[i]);
        }
        return Integer.parseInt(result);
    }
}