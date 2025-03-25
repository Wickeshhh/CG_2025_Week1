
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Frequency array to store count of digits 0-9
        int[] frequency = new int[10];

        // Process the number to find digit frequencies
        int tempNumber = Math.abs(number); // Handle negative numbers
        while (tempNumber > 0) {
            int digit = tempNumber % 10; // Extract last digit
            frequency[digit]++; // Increment frequency of the digit
            tempNumber /= 10; // Remove last digit
        }

        // Display digit frequencies
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        scanner.close();
    }
}



