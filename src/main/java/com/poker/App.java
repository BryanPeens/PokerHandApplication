package com.poker;

public final class App {
    private App() {}

    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        Player[] players = new Player[1];

        for(int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }

        Player player = players[0];
        PokerStrength poker = new PokerStrength();

        dealer.shuffleCards();
        dealer.dealCards(players);
        player.showCards();

        poker.Evaluate(player.getCards());
    }
}
