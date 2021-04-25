package com.poker;

import java.util.ArrayList;
import java.util.List;

class Player {
    private List<Card> cards = new ArrayList<>();

    public Player() {}

    public List<Card> getCards() {
        return this.cards;
    }

    public String showCards() {
        Card.sort(cards);
        String message = "Your hand: ";

        for (Card card : cards) {
            message += card.rank + " " + card.suit + " ";
        }

        System.out.println(message);

        return message;
    }

    void receiveCard(Card card) {
        this.cards.add(card);
    }
}
