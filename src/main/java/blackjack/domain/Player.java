package blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> cards = new ArrayList<>();
    private PlayerName playerName;
    private Money money;

    public Player(PlayerName playerName) {
        this.playerName = playerName;
        this.money = new Money();
    }

    public void addCard() {
        cards.add(CardFactory.getCard());
    }

    public int count() {
        return cards.stream()
                .map(card -> card.getCardNumber().getNumber())
                .reduce(((x, y) -> x + y)).orElseThrow(() -> new IllegalArgumentException());
    }
}
