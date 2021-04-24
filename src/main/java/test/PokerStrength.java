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

        Boolean isAscending = true;
        Boolean isSameSuit = true;

        String firstSuit = cards.get(0).suit;

        for (Card card : cards) {
            if(card.suit != firstSuit )
            {
                isSameSuit = false;
            }
        }
        if(isAscending && isSameSuit){
            System.out.println("Is Straight Flush");
        }
        else{
            System.out.println("Not Straight Flush");
        }

        Boolean isSorted = false;

        System.out.println(" ");
        return isAscending && isSameSuit;
    }
    public Boolean isFourOfAKind(List<Card> cards){
        return true;
    }
    public Boolean isFullHouse(List<Card> cards){
        return true;
    }
    public Boolean isFlush(List<Card> cards){
        Boolean isSameSuit = true;
        String firstSuit = cards.get(0).suit;
        for (Card card : cards) {
            if(card.suit != firstSuit){
                isSameSuit = false;
            }
        }
        if(isSameSuit){
            System.out.println("Is Normal Flush");
        }
        else{
            System.out.println("Not Normal Flush");
        }
        Boolean isSorted = false;
        System.out.println(" ");
        return isSameSuit;
    }
    public Boolean isStraight(List<Card> cards){
        return true;
    }
    public Boolean isThreeOfAKind(List<Card> cards){
        Boolean isThreeOfKind = true;
        String firstRank = cards.get(0).rank;
        // String secondRank = cards.get(2).rank;
        // String thirdRank = cards.get(3).rank;
        // String fourthRank = cards.get(4).rank;
        // String fifthRank = cards.get(5).rank;

        // System.out.printf(firstRank + secondRank + thirdRank + fourthRank + fifthRank);

        for (Card card : cards) {
            if(card.rank != firstRank ){
                isThreeOfKind = false;
            }
            else{
                isThreeOfKind = true;
            }
        }
        if(isThreeOfKind){
            System.out.println("Is Three Of a Kind");
        }
        else{
            System.out.println("Is Not Three Of a Kind");
        }
        Boolean isSorted = false;
        System.out.println(" ");
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



/**
 *
    if (currentHand.get(0).getSuit() == currentHand.get(1).getSuit()
        && currentHand.get(1).getSuit() == currentHand.get(2).getSuit()
        && currentHand.get(2).getSuit() == currentHand.get(3).getSuit()
        && currentHand.get(3).getSuit() == currentHand.get(4).getSuit()){
    return true;
    }
return false;
 */
