package test;

import static test.SuitsRanks.RANKS;

class Card {
    String suit;
    String rank;

    Card(String cardSuit, String cardRank){
        this.suit = cardSuit;
        this.rank = cardRank;
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
}

