
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0, temp = number;

        // Calculate sum of digits
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Check if number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }

        scanner.close();
    }
}

