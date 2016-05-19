public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        String matcher = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            if (matcher.contains(Character.toString(Character.toLowerCase((str.charAt(i))))))
                vowelsCount++;
        }
        return vowelsCount;
    }
}
