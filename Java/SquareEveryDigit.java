public class SquareDigit {
    public int squareDigits(int n) {
        char[] numbers = (n + "").toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            result.append((int) Math.pow(Character.getNumericValue(numbers[i]), 2));
        }
        return Integer.parseInt(result.toString());
    }
}