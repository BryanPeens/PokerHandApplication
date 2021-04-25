package com.poker;

import java.util.List;

public class PokerStrength {

    public void Evaluate(List<Card> cards){
        if (isStraightFlush(cards)) {
            System.out.println("You have: Straight Flush");
        }
        else if(isFourOfAKind(cards)) {
            System.out.println("You have: Four Of A Kind");
        }
        else if(isFullHouse(cards)) {
            System.out.println("You have: Full House");
        }
        else if(isFlush(cards)) {
            System.out.println("You have: Flush");
        }
        else if(isStraight(cards)) {
            System.out.println("You have: Straight");
        }
        else if(isThreeOfAKind(cards)) {
            System.out.println("You have: Three Of A Kind");
        }
        else if(isTwoPair(cards)) {
            System.out.println("You have: Two Pair");
        }
        else if(isOnePair(cards)) {
            System.out.println("You have: One Pair");
        }
        else {
            Card.reverse(cards);
            System.out.println("You have: High Card");
        }
    }

    public Boolean isStraightFlush(List<Card> cards){
        return isStraight(cards) && isFlush(cards);
    }

    public Boolean isFourOfAKind(List<Card> cards){
        Boolean isFourOfAKind = false;
        for (Card card : cards) {
           int counter = 0;
           String currentRank = card.rank;
           for (Card c : cards) {
                if(c.getRank() == currentRank){
                    counter++;
                }
                if(counter == 4){
                    isFourOfAKind = true;
                    break;
                }
            }
            if(isFourOfAKind){
                break;
            }
        }
        return isFourOfAKind;
    }

    public Boolean isFullHouse(List<Card> cards){
        return isOnePair(cards) && isThreeOfAKind(cards);
    }

    public Boolean isFlush(List<Card> cards){
        Boolean isFlush = true;
        String firstSuit = cards.get(0).suit;
        for (Card card : cards) {
            if(card.suit != firstSuit){
                isFlush = false;
            }
        }
        return isFlush;
    }

    public Boolean isStraight(List<Card> cards){
        Card.sort(cards);
        Boolean isStraight = true;

        for (int i = 0; i < cards.size(); i++) {
            if(i + 1 == cards.size()){
                break;
            }

            Card currentCard = cards.get(i);
            Card nextCard = cards.get(i+1);

            if(currentCard.rankIndex() + 1 != nextCard.rankIndex()){
                isStraight = false;
                break;
            }
        }
        return isStraight;
    }

    public Boolean isThreeOfAKind(List<Card> cards){
        Boolean isThreeOfKind = false;

        for (Card card : cards) {
           int counter = 0;
           String currentRank = card.rank;

           for (Card c : cards) {
                if(c.getRank() == currentRank){
                    counter++;
                }
                if(counter == 3){
                    isThreeOfKind = true;
                    break;
                }
            }

            if(isThreeOfKind){
                break;
            }
        }
        return isThreeOfKind;
    }

    public Boolean isTwoPair(List<Card> cards){
        int counter = 0;
        int sum = 0;

        for (Card card : cards) {
           String currentRank = card.rank;
           for (Card c : cards) {
                if(c.getRank() == currentRank){
                    counter++;
                }
                if(counter > 1){
                    sum++;
                    counter = 0;
                }
            }
        }

        return sum == 4;
    }

    public Boolean isOnePair(List<Card> cards) {
        Boolean isOnePair = false;
        for (Card card : cards) {
           int counter = 0;
           String currentRank = card.rank;
           for (Card c : cards) {
                if(c.getRank() == currentRank) {
                    counter++;
                }
                if(counter == 2) {
                    isOnePair = true;
                    break;
                }
            }
            if(isOnePair) {
                break;
            }
        }
        return isOnePair;
    }
}
