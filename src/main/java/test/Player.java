package test;

import java.util.ArrayList;
import java.util.List;

class Players {

    private String name;
    private List<Card> cards = new ArrayList<>();

    public Players(String name){
        this.name = name;
    }

    public List<Card> getCards() {
        return this.cards;
    }


    void showPlayerCards(){
        System.out.println("---------------------------------------------");
        for (Card card : cards){
            //you had been checking here if this was null, but there was no need for that check
            System.out.printf("%s  %s   ", card.rank, card.suit );
        }
        System.out.println(" ");
        System.out.println("---------------------------------------------");
    }

    void receiveCard(Card card){
        this.cards.add(card);
    }

    String getName(){
        return name;
    }
}


