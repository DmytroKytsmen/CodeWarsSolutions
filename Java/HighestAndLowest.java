public class Kata {
    public static String HighAndLow(String numbers) {
        if (numbers.length() == 1) {
            return numbers;
        }
        String[] arrayNumbers = numbers.split(" ");
        int[] nums = new int[arrayNumbers.length];
        for (int i = 0; i < arrayNumbers.length; i++) {
            nums[i] = Integer.parseInt(arrayNumbers[i]);
        }
        java.util.Arrays.sort(nums);
        return (nums[nums.length - 1] + " " + nums[0]);
    }
}