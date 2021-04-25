package com.poker;

import java.util.ArrayList;
import java.util.List;

class Player {

    private List<Card> cards = new ArrayList<>();

    public Player() {}

    public List<Card> getCards() {
        return this.cards;
    }

    void showCards() {
        Card.sort(cards);
        System.out.printf("Your hand: ");

        for (Card card : cards) {
            System.out.printf(card.rank + " " + card.suit + " ");
        }

        System.out.println(" ");
    }

    void receiveCard(Card card) {
        this.cards.add(card);
    }
}


