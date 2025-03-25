
import java.util.Arrays;

public class NumberChecker2 {

    // Method to store digits in an array
    public static int[] storeDigits(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int[] digits = storeDigits(num);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuck(int num) {
        return String.valueOf(num).contains("0");
    }

    public static void main(String[] args) {
        int num = 12321;
        System.out.println("Number: " + num);
        System.out.println("Is Palindrome: " + isPalindrome(num));
        System.out.println("Is Duck Number: " + isDuck(num));
    }
}

