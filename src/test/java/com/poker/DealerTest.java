package com.poker;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static com.poker.SuitsRanks.SIZE;
import static com.poker.SuitsRanks.SUITS;


import static com.poker.SuitsRanks.RANKS;

public class DealerTest {

    @Test
    void testDealerDefault() {
        Dealer dealer = new Dealer();

        assertEquals(dealer.getDeckOfCards().length, SIZE);
        assertEquals(dealer.getNumOfCardsPerPlayer(), 5);
    }

    @Test
    void testDealer() {
        Dealer dealer = new Dealer(4);

        assertEquals(dealer.getDeckOfCards().length, SIZE);
        assertEquals(dealer.getNumOfCardsPerPlayer(), 4);
    }

    @Test
    void testGetNumberOfCards() {
        Dealer dealer = new Dealer(7);

        assertEquals(dealer.getNumOfCardsPerPlayer(), 7);
    }

    @Test
    void testGetDeckOfCards() {
        Dealer dealer = new Dealer();

        assertEquals(dealer.getDeckOfCards().length, SIZE);
    }

    @Test
    void testSetDeckOfCards() {
        Dealer dealer = new Dealer();
        Card[] cards = new Card[SIZE];

        for (int i = 0; i < SIZE; i++) {
            cards[i] = new Card(SUITS[3], RANKS[1]);
        }

        Card[] deck = dealer.setDeckOfCards(cards);
        assertEquals(deck.length, SIZE);
        assertEquals(deck[0].suit, SUITS[3]);
        assertEquals(deck[0].rank, RANKS[1]);
    }

    @Test
    void testShuffle() {
        Dealer dealer = new Dealer();

        Card[] initialDeck = dealer.getDeckOfCards();
        String[] initialSuits = new String[10];
        String[] initialRanks = new String[10];

        for (int i = 0; i < 10; i++) {
            initialSuits[i] = initialDeck[i].suit;
            initialRanks[i] = initialDeck[i].rank;
        }

        dealer.shuffleCards();

        Card[] shuffledDeck = dealer.getDeckOfCards();
        String[] shuffledSuits = new String[10];;
        String[] shuffledRanks = new String[10];;

        for (int i = 0; i < 10; i++) {
            shuffledSuits[i] = shuffledDeck[i].suit;
            shuffledRanks[i] = shuffledDeck[i].rank;
        }

        assertFalse(Arrays.equals(initialSuits, shuffledSuits));
        assertFalse(Arrays.equals(initialRanks, shuffledRanks));
    }

    @Test
    void testDealCards() {
        Player[] players = new Player[3];
        Dealer dealer = new Dealer();

        for(int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }

        dealer.dealCards(players);

        for(Player player : players) {
            assertEquals(dealer.getNumOfCardsPerPlayer(), player.getCards().size());
        }
    }
}
