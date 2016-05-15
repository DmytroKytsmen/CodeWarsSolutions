public class BrokenSequence {
    public int findMissingNumber(String sequence) {
        if (sequence.isEmpty()) {
            return 0;
        }
        if (sequence.equals("_______")) {
            return 1;
        }
        String[] stringsArray = sequence.split(" ");
        int[] arrayInt = new int[stringsArray.length];
        for (int i = 0; i < stringsArray.length; i++) {
            arrayInt[i] = Integer.parseInt(stringsArray[i]);
        }
        java.util.Arrays.sort(arrayInt);
        for (int i = 0; i < arrayInt.length; i++) {
            if ((i + 1) != arrayInt[i]) {
                return (i + 1);
            }


        }
        return 0;
    }
}