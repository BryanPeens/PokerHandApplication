package test;

import java.util.Scanner;

/**
 * CARD APPLICATION
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Players[] players = new Players[1];
        Dealer dealer = new Dealer();
        PokerStrength poker = new PokerStrength();

        System.out.println("Cards Not shuffled.");
        dealer.showCards();
        dealer.shuffleCards();
        System.out.println("Cards Shuffled.");
        dealer.showCards();

        for(int i = 0; i < players.length; i++) {
            System.out.println("Enter Player Name: ");
            players[i] = new Players(input.nextLine());
        }

        Players[] playersWithCards = dealer.dealCards(players);

        System.out.println("---------------------------------------------");

        for(Players player : playersWithCards) {
            System.out.println(player.getName());
            player.showPlayerCards();

            System.out.println(poker.Evaluate(player.getCards()));
        }
    }
}
