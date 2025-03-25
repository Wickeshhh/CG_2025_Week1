
import java.util.Scanner;

public class FactorOperations {

    // Method to find factors of a number and store in an array
    public static int[] findFactors(int num) {
        int count = 0;

        // Count the number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Store factors in array
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares of factors
    public static int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Find factors and compute results
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        int sumSquares = sumOfSquares(factors);

        // Display results
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println("\nSum of Factors: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Sum of Squares of Factors: " + sumSquares);

        scanner.close();
    }
}

