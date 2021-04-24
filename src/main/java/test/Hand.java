// package test;

// import java.util.Arrays;

// public class Hand {
//     final static int NOTHING = 0,
//             STRAIGHTFLUSH = 1,
//             FLUSH = 2,
//             STRAIGHT = 3,
//             TWOPAIR = 4,
//             PAIR = 5,
//             THREEOFAKIND = 6,
//             FULLHOUSE = 7,
//             FOUROFAKIND = 8;
//     Card[] hand = new Card[5];

//     protected Hand (Deck deck) {
//         for (int i = 0; i < hand.length; i++) {
//             hand[i] = deck.dealCard();
//         }
//     }

//     protected Hand (Card[] cardHand) {
//         for (int i = 0; i < cardHand.length; i++) {
//             hand[i] = cardHand[i];
//         }
//     }

//     @Override
//     public String toString() {
//         String print = "";
//             for (int i = 0; i < hand.length; i++) {
// 		if (i == hand.length - 1) {
//                     print += hand[i];
// 		} else {
//                     print += hand[i] + ", ";
// 		}
//             }
//         return print;
//     }

//     protected int analyzeCardHand() {

//         if (checkIfFlush() && checkIfStraight() == true) {
//             return 1;
//         }
//         if (checkIfFourOfAKind() == true) {
//             return 8;
//         }
//         if (checkIfFullHouse() == true) {
//             return 7;
//         }
//         if (checkIfFlush() == true) {
//             return 2;
//         }
//         if (checkIfStraight() == true) {
//             return 3;
//         }
//         if (checkIfThreeOfAKind() == true) {
//             return 6;
//         }
//         if (checkIfTwoPair() == true) {
//             return 4;
//         }
//         if (checkIfPair() == true){
//             return 5;
//         } else {
//             return 0;
//         }
//     }

//     private boolean checkIfStraight() {
//         Arrays.sort(hand);
//         boolean isStraight = true;

//         if (hand[0].rank == 0 && hand[4].rank == 12) {
//             hand[0] = new Card(hand[0].rank, 13);
//             Arrays.sort(hand);
// 	}

//         Card comparableCard = hand[0];

//         for (int i = 0; i < hand.length; i++) {
//            if (i == 0 || comparableCard.rank + 1 == hand[i].rank) {
//                comparableCard = hand[i];
//             } else {
//                return false;
//            }
//         }
//         if (isStraight) {
//             return true;
//         }
//         return false;
//     }

//     private boolean checkIfFlush() {
//         int comparableCard = hand[0].getSuit();

//         for (int i = 0; i < 5; i++) {
//             int nextCardInHand = hand[i].getSuit();
//             if (nextCardInHand != comparableCard) {
// 		 return false;
//             }
//         }
//         return true;
//     }

//     private boolean checkIfTwoPair() {
//         int sum = 0;
//         int counter = 0;
//         for (Card hand1 : hand) {
//             for (Card hand2 : hand) {
//                 if (hand1.getRank() == hand2.getRank())
//                     counter++;
//             }
//             if (counter > 1)
//                 sum++;
//                 counter = 0;
//         }
//         return sum == 4;
//     }

//     private boolean checkIfPair() {
//         int sum = 0;
//         int counter = 0;
//         for(Card hand1 : hand){
//             for(Card hand2 : hand) {
//                 if(hand1.getRank() == hand2.getRank())
//                     counter++;
//             }
//             if (counter > 1)
//                 sum++;
//                 counter = 0;
//         }
//         return sum == 2;
//     }

//     private boolean checkIfThreeOfAKind() {
//         int sum = 0;
//         int counter = 0;
//         for(Card hand1 : hand){
//             for(Card hand2 : hand) {
//                 if(hand1.getRank() == hand2.getRank())
//                     counter++;
//             }
//             if (counter > 1)
//                 sum++;
//                 counter = 0;
//         }
//         return sum == 3;
//     }

//     private boolean checkIfFullHouse() {
//         Arrays.sort(hand);
//         return ((hand[0].getRank() == hand[1].getRank()) && (hand[0].getRank() == hand[2].getRank())) && (hand[3].getRank() == hand[4].getRank()) ||
//                 (hand[0].getRank() == hand[1].getRank()) && ((hand[2].getRank() == hand[3].getRank()) && (hand[2].getRank() == hand[4].getRank()));
//     }

//     private boolean checkIfFourOfAKind() {
//         Arrays.sort(hand);
//         return ((hand[0].getRank() == hand[1].getRank()) && (hand[0].getRank() == hand[2].getRank())) && (hand[0].getRank() == hand[3].getRank()) ||
//                 (hand[1].getRank() == hand[2].getRank()) && ((hand[1].getRank() == hand[3].getRank()) && (hand[1].getRank() == hand[4].getRank()));
//     }
// }
