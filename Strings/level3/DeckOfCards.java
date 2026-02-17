package com.gla.Strings.level3;
import java.util.Scanner;
public class DeckOfCards {

    // Method to initialize deck
    public static String[] initializeDeck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }

        return deck;
    }

    // Method to shuffle deck
    public static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // Swap
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int n, int players) {

        if (n > deck.length || n % players != 0) {
            System.out.println("Cards cannot be distributed equally to players.");
            return null;
        }

        int cardsPerPlayer = n / players;
        String[][] playerCards = new String[players][cardsPerPlayer];

        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[index++];
            }
        }

        return playerCards;
    }

    // Method to print players and their cards
    public static void printPlayers(String[][] players) {

        if (players == null)
            return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " Cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King", "Ace"};

        // Initialize deck
        String[] deck = initializeDeck(suits, ranks);

        // Shuffle deck
        deck = shuffleDeck(deck);

        System.out.print("Enter number of cards to distribute (n): ");
        int n = sc.nextInt();

        System.out.print("Enter number of players (x): ");
        int players = sc.nextInt();

        // Distribute cards
        String[][] distributed = distributeCards(deck, n, players);

        // Print players and their cards
        printPlayers(distributed);

        sc.close();
    }
}
