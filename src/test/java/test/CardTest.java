package test;

import static test.SuitsRanks.SUITS;
import static test.SuitsRanks.RANKS;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {

    @Test
    void testRankIndex() {
        Card card = new Card(SUITS[0], RANKS[2]);
        assertEquals(Integer.valueOf(2), Integer.valueOf(card.rankIndex()));
    }

    @Test
    void testSort() {
        List<Card> cards = new ArrayList<>();
        int[] actualIndexes;
        int[] expectedIndexes = {1, 3, 4, 6, 8};

        cards.add(new Card(SUITS[0], RANKS[6]));
        cards.add(new Card(SUITS[2], RANKS[1]));
        cards.add(new Card(SUITS[3], RANKS[4]));
        cards.add(new Card(SUITS[2], RANKS[3]));
        cards.add(new Card(SUITS[1], RANKS[8]));

        Card.sort(cards);

        actualIndexes = cards.stream().map((card) -> {
            return Integer.valueOf(card.rankIndex());
        }).mapToInt(Integer::intValue).toArray();

        assertArrayEquals(expectedIndexes, actualIndexes);
    }
}
