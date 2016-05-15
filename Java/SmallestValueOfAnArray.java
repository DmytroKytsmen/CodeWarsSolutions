public class Arrays {
    public static int findSmallest(final int[] numbers, final String toReturn) {
        //TODO: Add solution here
        int index = 0;
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
                index = i;
            }
        }
        if (toReturn.equals("value")) {
            return min;
        } else {
            return index;
        }
    }
}