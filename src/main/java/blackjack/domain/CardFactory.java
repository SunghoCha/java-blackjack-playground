package blackjack.domain;

import java.lang.reflect.Array;
import java.util.*;

import static blackjack.domain.CardMark.*;

public class CardFactory {
    private final static List<Card> cards = new ArrayList<>();
    private static Random random = new Random();
    static {
        List<String> strings = Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K");
        for (CardMark value : values()) {
            for (String string : strings) {
                cards.add(new Card(value, new CardName(string)));
            }
        }
    }

    public static Card getCard() {
        int idx = random.nextInt(52);
        return cards.get(idx);
    }
}
