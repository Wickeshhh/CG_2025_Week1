
import java.util.Arrays;

public class NumberChecker1 {

    // Method to count digits in a number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits in an array
    public static int[] storeDigits(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        for (int digit : storeDigits(num)) {
            sum += digit;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int num) {
        int sum = 0;
        for (int digit : storeDigits(num)) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshad(int num) {
        return num % sumOfDigits(num) == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int num) {
        int[] digits = storeDigits(num);
        int[][] frequency = new int[10][2]; // 0-9 digits
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    public static void main(String[] args) {
        int num = 1540;
        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + countDigits(num));
        System.out.println("Sum of Digits: " + sumOfDigits(num));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(num));
        System.out.println("Is Harshad Number: " + isHarshad(num));

        int[][] freq = digitFrequency(num);
        System.out.println("Digit Frequencies:");
        for (int[] f : freq) {
            if (f[1] > 0) System.out.println("Digit " + f[0] + ": " + f[1] + " times");
        }
    }
}

