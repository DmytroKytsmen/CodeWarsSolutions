public class Count {
    public int count_one_char(String s, char c) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                counter++;
        }
        return counter;
    }
}