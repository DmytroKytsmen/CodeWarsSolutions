enum Cards {
    T(10), J(11), Q(12), K(13), A(14);

    public int cardValue;

    Cards(int value) {
        this.cardValue = value;
    }

    public int getCardValue() {
        return cardValue;
    }
}

public class Game {

    public static int getValue(String element) {
        Cards result;
        try {
            result = Cards.valueOf(element);
            return result.cardValue;
        } catch (IllegalArgumentException ex) {

        }
        return Integer.parseInt(element);

    }

    public String winner(String[] deckSteve, String[] deckJosh) {
        int Stevie = 0;
        int Josh = 0;
        for (int i = 0; i < deckSteve.length; i++) {
            if (getValue(deckSteve[i]) - getValue(deckJosh[i]) > 0) {
                Stevie++;
            } else if (getValue(deckSteve[i]) - getValue(deckJosh[i]) < 0) {
                Josh++;
            }


        }
        if (Stevie > Josh) {
            return String.format("Steve wins %d to %d", Stevie, Josh);
        } else if (Stevie < Josh) {
            return String.format("Josh wins %d to %d", Josh, Stevie);
        } else {
            return "Tie";

        }
    }
}