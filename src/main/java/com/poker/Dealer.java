package com.poker;

import java.util.Random;

import static com.poker.SuitsRanks.SUITS;
import static com.poker.SuitsRanks.RANKS;
import static com.poker.SuitsRanks.SIZE;

class Dealer {
    private static Card[] deckOfCards = new Card[SIZE];
    private static int numOfCardsPerPlayer = 5;

    public Dealer() {
        int count = 0;

        for (String s : SUITS) {
            for (String r : RANKS) {
                Card card = new Card(s, r);
                deckOfCards[count] = card;
                count++;
            }
        }
    }

    public Dealer(int numOfCardsPerPlayer) {
        int count = 0;

        for (String s : SUITS) {
            for (String r : RANKS) {
                Card card = new Card(s, r);
                deckOfCards[count] = card;
                count++;
            }
        }
        this.numOfCardsPerPlayer = numOfCardsPerPlayer;
    }

    public int getNumOfCardsPerPlayer() {
        return this.numOfCardsPerPlayer;
    }

    public Card[] getDeckOfCards() {
        return this.deckOfCards;
    }

    public Card[] setDeckOfCards(Card[] cardDeck) {
        this.deckOfCards = cardDeck;
        return this.deckOfCards;
    }

    public Card[] shuffleCards() {
        Card[] shuffledDeck = this.deckOfCards;
        Random rand = new Random();
        int j;

        System.out.println("Shuffling ... Shuffling ... Shuffling ... ");

        for (int i = 0; i < SIZE; i++) {
            j = rand.nextInt(SIZE);
            Card temp = shuffledDeck[i];
            shuffledDeck[i] = shuffledDeck[j];
            shuffledDeck[j] = temp;
        }

        return this.setDeckOfCards(shuffledDeck);
    }

    public Player[] dealCards(Player[] players) {
        for(int i = 0; i < this.deckOfCards.length; i++) {
            for(Player player : players) {
                if(player.getCards().size() < this.numOfCardsPerPlayer) {
                    player.receiveCard(this.deckOfCards[i]);
                }
            }
        }

        return players;
    }
}
