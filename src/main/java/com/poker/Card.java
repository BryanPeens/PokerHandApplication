package com.poker;

import static com.poker.SuitsRanks.RANKS;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;

class Card implements Comparable<Card> {
    String suit;
    String rank;

    Card(String cardSuit, String cardRank){
        this.suit = cardSuit;
        this.rank = cardRank;
    }

    public String getRank() {
        return this.rank;
    }

    public int rankIndex(){
        int index = -1;
        for (int i = 0; i < RANKS.length; i++) {
            if (RANKS[i] == this.rank) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void sort(List<Card> cards){
        Collections.sort(cards, (card1, card2) ->  card1.compareTo(card2));
    }

    public static void reverse(List<Card> cards){
        Card.sort(cards);
        Collections.reverse(cards);
    }

    @Override
    public int compareTo(Card card){
        return Integer.compare(this.rankIndex(), card.rankIndex());
    }
}

