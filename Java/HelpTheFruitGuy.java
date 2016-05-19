public class FruitGuy {
    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null || fruitBasket.length == 0)
            return new String[0];
        String matcher = "rotten";
        for (int i = 0; i < fruitBasket.length; i++) {
            if (fruitBasket[i].contains(matcher))
                fruitBasket[i] = fruitBasket[i].substring(6).toLowerCase();
        }
        return fruitBasket;
    }
}