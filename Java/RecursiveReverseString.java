public class Reverse {
    public String reverse(String str) {
        if (str.length() <= 1 || str == null)
            return str;
        else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}