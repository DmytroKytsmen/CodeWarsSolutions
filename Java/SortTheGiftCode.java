public class GiftSorter {
    public String sortGiftCode(String code) {
        char[] lettersArray = code.toCharArray();
        java.util.Arrays.sort(lettersArray);
        return String.valueOf(lettersArray);
    }
}