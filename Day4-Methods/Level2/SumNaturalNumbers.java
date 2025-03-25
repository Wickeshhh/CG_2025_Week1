
import java.util.Scanner;

public class SumNaturalNumbers {

    // Recursive method to find the sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    // Formula method to find the sum
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
            return;
        }

        // Compute sum using recursion and formula
        int sum1 = sumRecursive(n);
        int sum2 = sumFormula(n);

        // Display results
        System.out.println("Sum using Recursion: " + sum1);
        System.out.println("Sum using Formula: " + sum2);
        System.out.println("Results Match: " + (sum1 == sum2));

        scanner.close();
    }
}

