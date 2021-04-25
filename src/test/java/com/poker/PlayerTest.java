package com.poker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static com.poker.SuitsRanks.SUITS;
import static com.poker.SuitsRanks.RANKS;

public class PlayerTest {
    @Test
    void testGetCards() {
        Player player = new Player();
        Card card1 = new Card(SUITS[0], RANKS[0]);
        Card card2 = new Card(SUITS[1], RANKS[2]);

        player.receiveCard(card1);
        player.receiveCard(card2);

        assertEquals(player.getCards().size(), 2);
    }

    @Test
    void testShowCards() {
        Player player = new Player();
        Card card1 = new Card(SUITS[0], RANKS[0]);
        Card card2 = new Card(SUITS[1], RANKS[1]);
        Card card3 = new Card(SUITS[2], RANKS[2]);

        player.receiveCard(card1);
        player.receiveCard(card2);
        player.receiveCard(card3);

        String output = "Your hand: " + card1.rank + " " + card1.suit + " " + card2.rank + " " + card2.suit + " " + card3.rank + " " + card3.suit + " ";
        String actualOutput = player.showCards();

        assertEquals(output, actualOutput);
    }

    @Test
    void testReiveCard() {
        Player player = new Player();
        Card card = new Card(SUITS[0], RANKS[0]);

        player.receiveCard(card);

        assertEquals(player.getCards().size(), 1);
    }
}
