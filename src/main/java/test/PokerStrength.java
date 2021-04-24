package test;

import java.util.List;

public class PokerStrength {

    public String Evaluate(List<Card> cards){

        if (isStraightFlush(cards)) {
            return String.format("Straight Flush");
        }
        else if(isFourOfAKind(cards)) {
            return String.format("Four Of A Kind");
        }
        else if(isFullHouse(cards)) {
            return String.format("Full House");
        }
        else if(isFlush(cards)) {
            return String.format("Flush");
        }
        else if(isStraight(cards)) {
            return String.format("Straight");
        }
        else if(isThreeOfAKind(cards)) {
            return String.format("Three Of A Kind");
        }
        else if(isFourOfAKind(cards)) {
            return String.format("Four Of A Kind");
        }
        else if(isTwoPair(cards)) {
            return String.format("Two Pair");
        }
        else if(isOnePair(cards)) {
            return String.format("One Pair");
        }
        else if(isHighCards(cards)) {
            return String.format("High Card");
        }
        else
        {
            return String.format("Nothing Loser.");
        }
    }

    public Boolean isStraightFlush(List<Card> cards){
        return isStraight(cards) && isFlush(cards);
    }
    public Boolean isFourOfAKind(List<Card> cards){
        return true;
    }
    public Boolean isFullHouse(List<Card> cards){
        return true;
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
        return true;
    }
    public Boolean isOnePair(List<Card> cards){
        return true;
    }
    public Boolean isHighCards(List<Card> cards){
        return true;
    }
}

