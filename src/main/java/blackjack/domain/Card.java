package blackjack.domain;

import blackjack.util.CardNumberConvertor;

import java.util.HashMap;

public class Card {
    private final CardMark cardMark;
    private final CardName cardName;
    private final CardNumber cardNumber;

    public Card(CardMark cardMark, CardName cardName) {
        this.cardMark = cardMark;
        this.cardName = cardName;
        this.cardNumber = CardNumberConvertor.from(cardName);
    }

    public CardNumber getCardNumber() {
        return cardNumber;
    }
}
