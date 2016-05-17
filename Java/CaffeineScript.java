public class CaffeineBuzz {
    public static String caffeineBuzz(int n) {
        if (n % 12 == 0) {
            return "CoffeeScript";
        }
        if (n % 6 == 0) {
            return "JavaScript";
        } else if (n % 3 == 0) {
            return "Java";
        }
        return "mocha_missing!";
    }
}