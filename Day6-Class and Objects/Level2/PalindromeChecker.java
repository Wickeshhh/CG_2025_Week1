import java.util.Scanner;
class PalindromeChecker {
    // Attribute
    private String text;
    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }
    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove special chars, ignore case
        int left = 0, right = cleanText.length() - 1;
        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a palindrome.");
        }
    }
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter text to check for palindrome: ");
        String inputText = scanner.nextLine();
        PalindromeChecker checker = new PalindromeChecker(inputText);
        checker.displayResult();
        scanner.close();
    }
}
