package test;

import java.util.Random;

import static test.SuitsRanks.SUITS;
import static test.SuitsRanks.RANKS;

class Dealer {
    private static final int SIZE = 52;
    private static Card[] deckOfCards = new Card[SIZE];
    private static int numOfCardsPerPlayer = 5;

    public Dealer() {
        this.deckOfCards = deckOfCards;
        int count = 0;

        for (String s : SUITS) {
            for (String r : RANKS) {
                Card card = new Card(s, r);
                deckOfCards[count] = card;
                count++;
            }
        }
        this.deckOfCards = deckOfCards;
    }

    public Dealer(int numOfCardsPerPlayer) {
        this.deckOfCards = deckOfCards;
        int count = 0;

        for (String s : SUITS) {
            for (String r : RANKS) {

                Card card = new Card(s, r);
                deckOfCards[count] = card;
                count++;
            }
        }
        this.deckOfCards = deckOfCards;
        this.numOfCardsPerPlayer = numOfCardsPerPlayer;
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
        for (int i = 0; i < SIZE; i++) {
            j = rand.nextInt(SIZE);
            Card temp = shuffledDeck[i];
            shuffledDeck[i] = shuffledDeck[j];
            shuffledDeck[j] = temp;
        }
        return this.setDeckOfCards(shuffledDeck);
    }

    public void showCards() {
        // System.out.println("---------------------------------------------");
        int count = 0;
        for (Card card : this.deckOfCards) {
            System.out.printf("%s   %s\t", card.rank, card.suit); //use print f with \t (tab character)
            count++;
            if (count % 4 == 0)
                System.out.println();
        }
        // System.out.println("---------------------------------------------");
    }

    public Players[] dealCards(Players[] players) {
        for(int i = 0; i < this.deckOfCards.length; i++) {
            if(players[i % players.length].getCards().size() < this.numOfCardsPerPlayer) {

                players[i % players.length].receiveCard(this.deckOfCards[i]);
            }
        }
        return players;
    }
}
