
import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {

    // Define suits and ranks
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Total number of cards in the deck
    private static final int NUM_OF_CARDS = SUITS.length * RANKS.length;

    // Method to initialize the deck of cards
    private static String[] initializeDeck() {
        String[] deck = new String[NUM_OF_CARDS];
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    private static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + rand.nextInt(deck.length - i);
            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    // Method to distribute the deck of n cards to x players
    private static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards * numPlayers > NUM_OF_CARDS) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] players = new String[numPlayers][numCards];
        int index = 0;
        for (int i = 0; i < numCards; i++) {
            for (int j = 0; j < numPlayers; j++) {
                players[j][i] = deck[index++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    private static void printPlayerCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " has:");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for number of players and number of cards per player
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int numCards = scanner.nextInt();
        scanner.close();

        // Initialize and shuffle the deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        // Distribute cards to players
        String[][] players = distributeCards(deck, numCards, numPlayers);
        if (players != null) {
            printPlayerCards(players);
        }
    }
}

