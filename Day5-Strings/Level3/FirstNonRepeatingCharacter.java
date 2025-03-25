
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingChar(String str) {
        int[] frequency = new int[256]; // ASCII character frequency array

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0'; // No non-repeating character found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Find first non-repeating character
        char result = findFirstNonRepeatingChar(input);

        // Display result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}

