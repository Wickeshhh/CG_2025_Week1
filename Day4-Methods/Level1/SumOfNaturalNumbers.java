import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (N): ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            int sum = calculateSum(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }

    // Method to calculate sum of first N natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

