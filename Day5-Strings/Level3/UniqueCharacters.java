
import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of a string without using length()
    public static int getStringLength(String str) {
        int length = 0;
        try {
            while (str.charAt(length) != '\0') {
                length++;
            }
        } catch (Exception e) {
            // Exception occurs when index is out of bounds, which means we've reached the end of the string.
        }
        return length;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String str) {
        int length = getStringLength(str);
        char[] uniqueChars = new char[length]; // Store unique characters
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if the character is already present in uniqueChars
            for (int j = 0; j < uniqueIndex; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, store in the array
            if (isUnique) {
                uniqueChars[uniqueIndex++] = currentChar;
            }
        }

        // Create an array of exact size
        char[] result = new char[uniqueIndex];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueIndex);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(input);

        // Display unique characters
        System.out.print("Unique characters: ");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
        }
    }
}

