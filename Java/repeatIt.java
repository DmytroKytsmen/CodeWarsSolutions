public class RepeatIt {
    public static String repeatString(final Object toRepeat, int n) {
        if (toRepeat instanceof String) {

            StringBuilder builder = new StringBuilder();
            while (n > 0) {
                builder.append(toRepeat);
                n--;
            }
            return builder.toString();
        } else {
            return "Not a string";
        }
    }
}