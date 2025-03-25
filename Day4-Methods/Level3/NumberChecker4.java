
public class NumberChecker4 {

    // Method to find factors of a number
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int num) {
        int sum = 0;
        for (int factor : findFactors(num)) sum += factor;
        return sum;
    }

    // Check if a number is Perfect, Abundant, Deficient
    public static boolean isPerfect(int num) {
        return sumOfFactors(num) - num == num;
    }

    // Check if a number is Strong
    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }

    // Factorial method
    private static int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println("Is Perfect: " + isPerfect(num));
        System.out.println("Is Strong: " + isStrong(num));
    }
}

