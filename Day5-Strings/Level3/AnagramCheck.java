import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] frequency = new int[256]; // Frequency array for ASCII characters

        // Count characters in first string
        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i)]++;
        }

        // Subtract characters from second string
        for (int i = 0; i < str2.length(); i++) {
            frequency[str2.charAt(i)]--;
        }

        // If any value is not zero, they are not anagrams
        for (int count : frequency) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        scanner.close();

        // Check anagram
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}

