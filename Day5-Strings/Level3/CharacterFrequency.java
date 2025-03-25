
import java.util.Scanner;

public class CharacterFrequency {

    // Method to find character frequency using charAt()
    public static String[][] findCharacterFrequency(String str) {
        int[] frequency = new int[256]; // ASCII character frequency array

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        // Store unique characters and their frequencies
        int uniqueCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i)] != 0) {
                uniqueCount++;
                frequency[str.charAt(i)] = 0; // Reset to avoid duplicate entries
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        frequency = new int[256]; // Reset frequency array

        // Count frequencies again for storing
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                frequency[ch] = 0;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Find character frequency
        String[][] result = findCharacterFrequency(input);

        // Display frequency table
        System.out.println("Character | Frequency");
        for (String[] row : result) {
            System.out.println("   " + row[0] + "      |     " + row[1]);
        }
    }
}

