
import java.util.ArrayList;

public class NumberChecker {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("0");
    }

    public static boolean isArmstrongNumber(int num) {
        int[] digits = storeDigits(num);
        int sum = 0, power = digits.length;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == num;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : digits) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return new int[]{max, secondMax};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int num : digits) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        return new int[]{min, secondMin};
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println("Count of Digits: " + countDigits(num));
        System.out.println("Is Duck Number: " + isDuckNumber(num));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(num));

        int[] digits = storeDigits(num);
        int[] largest = findLargestAndSecondLargest(digits);
        int[] smallest = findSmallestAndSecondSmallest(digits);
        
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}

