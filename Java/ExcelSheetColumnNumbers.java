public class TitleToNumber {
    public static long titleToNumber(String title) {
        char[] letters = title.toCharArray();
        int t = 0;
        int i = letters.length - 1;
        long result = 0;
        while (i >= 0) {
            char letter = letters[i];
            result += Math.pow(26, t) * (letter - 'A' + 1);
            i--;
            t++;
        }
        return result;
    }
}