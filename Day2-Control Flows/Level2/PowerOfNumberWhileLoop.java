
import java.util.Scanner;

public class PowerOfNumberWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the exponent (power): ");
        int power = scanner.nextInt();

        // Checking for positive integer
        if (power < 0) {
            System.out.println("Please enter a non-negative exponent.");
        } else {
            int result = 1;
            int counter = 0;

            // Calculating power using while loop
            while (counter < power) {
                result *= number;
                counter++;
            }

            // Displaying the result
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }
        
        scanner.close();
    }
}

