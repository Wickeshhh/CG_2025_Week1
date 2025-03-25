
import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Compare characters from start and end
    public static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Logic 3: Using char array
    public static boolean isPalindromeUsingArray(String str) {
        char[] original = str.toCharArray();
        char[] reverse = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            reverse[i] = str.charAt(str.length() - 1 - i);
        }
        return new String(original).equals(new String(reverse));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Check palindrome using all methods
        System.out.println("Palindrome (Iterative): " + isPalindrome(input));
        System.out.println("Palindrome (Recursive): " + isPalindromeRecursive(input, 0, input.length() - 1));
        System.out.println("Palindrome (Using Array): " + isPalindromeUsingArray(input));
    }
}

