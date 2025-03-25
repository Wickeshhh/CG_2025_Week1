
import java.util.Scanner;

public class NumberChecker {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compareNumbers(int num1, int num2) {
        return Integer.compare(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is positive and " + (isEven(numbers[i]) ? "even" : "odd"));
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        int result = compareNumbers(numbers[0], numbers[4]);
        if (result > 0) System.out.println("First number is greater than the last.");
        else if (result < 0) System.out.println("First number is less than the last.");
        else System.out.println("First and last number are equal.");

        scanner.close();
    }
}

