package test;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static test.SuitsRanks.SUITS;
import static test.SuitsRanks.RANKS;

class PokerStrengthTest {


    @Test
    void testEvaluate() {
        assertEquals(1, 1);
    }

// // REGION TEST-IS STRAIGHT FLUSH isTrue ====================================================
//     @Test
//     void testIsStraightFlushTrue() {
//         List<Card> cards = new ArrayList();
//         PokerStrength ps = new PokerStrength();

//         cards.add(new Card(SUITS[0], RANKS[0]));
//         cards.add(new Card(SUITS[0], RANKS[1]));
//         cards.add(new Card(SUITS[0], RANKS[4]));
//         cards.add(new Card(SUITS[0], RANKS[2]));
//         cards.add(new Card(SUITS[0], RANKS[3]));

//         Boolean actualResult = ps.isStraightFlush(cards);
//         assertEquals(actualResult, true);

//         for (Card card : cards) {
//             System.out.print(card.rank.toString() + " " + card.suit.toString() + " " + card.rankIndex() + " | ");
//         }
//     }
    // REGION TEST-IS STRAIGHT FLUSH isFalse ====================================================
    // @Test
    // void testIsStraightFlushFalse() {
    //     List<Card> cards = new ArrayList();
    //     PokerStrength ps = new PokerStrength();

    //     cards.add(new Card(SUITS[0], RANKS[0]));
    //     cards.add(new Card(SUITS[1], RANKS[1]));
    //     cards.add(new Card(SUITS[2], RANKS[2]));
    //     cards.add(new Card(SUITS[3], RANKS[3]));
    //     cards.add(new Card(SUITS[2], RANKS[4]));

    //     Boolean actualResult = ps.isStraightFlush(cards);
    //     assertEquals(actualResult, false);

    //     for (Card card : cards) {
    //         System.out.print(card.rank.toString() + " " + card.suit.toString() + " " + card.rankIndex() + " | ");
    //     }
    // }
// REGION TEST-IS THREE OF A KIND isFalse ====================================================

    @Test
    void testIsThreeOfAKindFalse() {
        System.out.println("Testing Three of a kind isFalse");
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[0], RANKS[0]));
        cards.add(new Card(SUITS[1], RANKS[1]));
        cards.add(new Card(SUITS[2], RANKS[2]));
        cards.add(new Card(SUITS[3], RANKS[4]));
        cards.add(new Card(SUITS[1], RANKS[2]));

        Boolean actualResult = ps.isThreeOfAKind(cards);
        assertEquals(actualResult, false);

        for (Card card : cards) {
            System.out.print(card.rank.toString() + " " + card.suit.toString() + " " + card.rankIndex() + " | ");
        }
    }
// REGION TEST-IS THREE OF A KIND isTrue ====================================================
    @Test
    void testIsThreeOfAKindTrue() {
        System.out.println("Testing Three of a kind isTrue");
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[0], RANKS[0]));
        cards.add(new Card(SUITS[1], RANKS[1]));
        cards.add(new Card(SUITS[2], RANKS[2]));
        cards.add(new Card(SUITS[3], RANKS[2]));
        cards.add(new Card(SUITS[1], RANKS[2]));

        Boolean actualResult = ps.isThreeOfAKind(cards);
        assertEquals(actualResult, true);

        for (Card card : cards) {
            System.out.print(card.rank.toString() + " " + card.suit.toString() + " " + card.rankIndex() + " | ");
        }
    }
// END REGION TEST-IS IS FLUSH isTrue ====================================================
    @Test
    void testIsFlushTrue() {
        System.out.println("Testing is Flush isTrue");
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[0], RANKS[0]));
        cards.add(new Card(SUITS[0], RANKS[1]));
        cards.add(new Card(SUITS[0], RANKS[2]));
        cards.add(new Card(SUITS[0], RANKS[3]));
        cards.add(new Card(SUITS[0], RANKS[8]));

        Boolean actualResult = ps.isFlush(cards);
        assertEquals(actualResult, true);

        for (Card card : cards) {
            System.out.print(card.rank.toString() + " " + card.suit.toString() + " " + card.rankIndex() + " | ");
        }
    }

    @Test
    void testIsFlushFalse() {
        System.out.println("Testing is Flush isFalse");
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[0], RANKS[0]));
        cards.add(new Card(SUITS[0], RANKS[1]));
        cards.add(new Card(SUITS[1], RANKS[2]));
        cards.add(new Card(SUITS[2], RANKS[3]));
        cards.add(new Card(SUITS[3], RANKS[8]));

        Boolean actualResult = ps.isFlush(cards);
        assertEquals(actualResult, true);

        for (Card card : cards) {
            System.out.print(card.rank.toString() + " " + card.suit.toString() + " " + card.rankIndex() + " | ");
        }
    }


    // REGION TEST-IS STRAIGHT TRUE ====================================================
    @Test
    void testIsStraightTrue() {
        System.out.println("Testing is Straight isTrue");
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[0], RANKS[0]));
        cards.add(new Card(SUITS[0], RANKS[1]));
        cards.add(new Card(SUITS[0], RANKS[2]));
        cards.add(new Card(SUITS[0], RANKS[3]));
        cards.add(new Card(SUITS[0], RANKS[8]));

        Boolean actualResult = ps.isStraight(cards);
        assertEquals(actualResult, true);

        for (Card card : cards) {
            System.out.print(card.rank.toString() + " " + card.suit.toString() + " " + card.rankIndex() + " | ");
        }
    }

        // REGION TEST-IS STRAIGHT TRUE ====================================================
        @Test
        void testIsStraightFalse() {
            System.out.println("Testing is Straight isFalse");
            List<Card> cards = new ArrayList();
            PokerStrength ps = new PokerStrength();

            cards.add(new Card(SUITS[0], RANKS[0]));
            cards.add(new Card(SUITS[2], RANKS[1]));
            cards.add(new Card(SUITS[3], RANKS[2]));
            cards.add(new Card(SUITS[2], RANKS[3]));
            cards.add(new Card(SUITS[1], RANKS[8]));

            Boolean actualResult = ps.isStraight(cards);
            assertEquals(actualResult, false);

            for (Card card : cards) {
                System.out.print(card.rank.toString() + " " + card.suit.toString() + " " + card.rankIndex() + " | ");
            }
        }

}
