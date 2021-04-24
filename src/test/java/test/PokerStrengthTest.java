package test;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.SuitsRanks.SUITS;
import static test.SuitsRanks.RANKS;

class PokerStrengthTest {

    @Test
    void testIsStraightFlushTrue() {
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[0], RANKS[0]));
        cards.add(new Card(SUITS[0], RANKS[1]));
        cards.add(new Card(SUITS[0], RANKS[4]));
        cards.add(new Card(SUITS[0], RANKS[2]));
        cards.add(new Card(SUITS[0], RANKS[3]));

        Boolean actualResult = ps.isStraightFlush(cards);
        assertEquals(true, actualResult);
    }

    @Test
    void testIsStraightFlushFalse() {
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[0], RANKS[0]));
        cards.add(new Card(SUITS[1], RANKS[1]));
        cards.add(new Card(SUITS[2], RANKS[2]));
        cards.add(new Card(SUITS[3], RANKS[3]));
        cards.add(new Card(SUITS[2], RANKS[4]));

        Boolean actualResult = ps.isStraightFlush(cards);
        assertEquals(false, actualResult);
    }

    @Test
    void testIsFourOfAKindTrue() {
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[0], RANKS[2]));
        cards.add(new Card(SUITS[1], RANKS[1]));
        cards.add(new Card(SUITS[2], RANKS[2]));
        cards.add(new Card(SUITS[3], RANKS[4]));
        cards.add(new Card(SUITS[1], RANKS[2]));

        Boolean actualResult = ps.isThreeOfAKind(cards);
        assertEquals(true, actualResult);
    }

    @Test
    void testIsFourOfAKindFalse() {
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[0], RANKS[0]));
        cards.add(new Card(SUITS[1], RANKS[1]));
        cards.add(new Card(SUITS[2], RANKS[2]));
        cards.add(new Card(SUITS[3], RANKS[2]));
        cards.add(new Card(SUITS[1], RANKS[6]));

        Boolean actualResult = ps.isThreeOfAKind(cards);
        assertEquals(false, actualResult);

    }




    @Test
    void testIsFlushTrue() {
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[0], RANKS[0]));
        cards.add(new Card(SUITS[0], RANKS[1]));
        cards.add(new Card(SUITS[0], RANKS[2]));
        cards.add(new Card(SUITS[0], RANKS[3]));
        cards.add(new Card(SUITS[0], RANKS[8]));

        Boolean actualResult = ps.isFlush(cards);
        assertEquals(actualResult, true);
    }

    @Test
    void testIsFlushFalse() {
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[0], RANKS[0]));
        cards.add(new Card(SUITS[0], RANKS[1]));
        cards.add(new Card(SUITS[1], RANKS[2]));
        cards.add(new Card(SUITS[2], RANKS[3]));
        cards.add(new Card(SUITS[3], RANKS[8]));

        Boolean actualResult = ps.isFlush(cards);
        assertEquals(actualResult, false);
    }

    @Test
    void testIsStraightTrue() {
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[2], RANKS[1]));
        cards.add(new Card(SUITS[3], RANKS[2]));
        cards.add(new Card(SUITS[0], RANKS[3]));
        cards.add(new Card(SUITS[2], RANKS[4]));
        cards.add(new Card(SUITS[1], RANKS[5]));

        Boolean actualResult = ps.isStraight(cards);
        assertEquals(true, actualResult);
    }

    @Test
    void testIsStraightFalse() {
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[1], RANKS[0]));
        cards.add(new Card(SUITS[2], RANKS[1]));
        cards.add(new Card(SUITS[3], RANKS[7]));
        cards.add(new Card(SUITS[0], RANKS[3]));
        cards.add(new Card(SUITS[2], RANKS[8]));

        Boolean actualResult = ps.isStraight(cards);
        assertEquals(false, actualResult);

    }

    @Test
    void testIsThreeOfAKindTrue() {
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[0], RANKS[2]));
        cards.add(new Card(SUITS[1], RANKS[1]));
        cards.add(new Card(SUITS[2], RANKS[2]));
        cards.add(new Card(SUITS[3], RANKS[4]));
        cards.add(new Card(SUITS[1], RANKS[2]));

        Boolean actualResult = ps.isThreeOfAKind(cards);
        assertEquals(true, actualResult);
    }

    @Test
    void testIsThreeOfAKindFalse() {
        List<Card> cards = new ArrayList();
        PokerStrength ps = new PokerStrength();

        cards.add(new Card(SUITS[0], RANKS[0]));
        cards.add(new Card(SUITS[1], RANKS[1]));
        cards.add(new Card(SUITS[2], RANKS[2]));
        cards.add(new Card(SUITS[3], RANKS[2]));
        cards.add(new Card(SUITS[1], RANKS[6]));

        Boolean actualResult = ps.isThreeOfAKind(cards);
        assertEquals(false, actualResult);

    }




































}
