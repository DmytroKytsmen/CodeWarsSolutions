public class Solution {

    public int solution(int number) {
        int result = 0;
        int[] numbers = new int[number];
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 3; i * j < numbers.length; j += 3) {
                numbers[i * j] = 1;
            }
            for (int j = 5; i * j < numbers.length; j += 5) {
                numbers[i * j] = 1;
            }
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                result += i;
            }
        }
        return result;
    }
}