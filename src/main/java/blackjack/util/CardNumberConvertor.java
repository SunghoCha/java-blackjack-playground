package blackjack.util;

import blackjack.domain.CardName;
import blackjack.domain.CardNumber;

import java.util.HashMap;

public class CardNumberConvertor {
    private static HashMap<String, Integer> map = new HashMap<>();

    static {
        map.put("A", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);
        map.put("J", 10);
        map.put("Q", 10);
        map.put("K", 10);
    }

    public static CardNumber from(CardName cardName) {
        Integer number = map.get(cardName.getName());
        return new CardNumber(number);

    }
}
