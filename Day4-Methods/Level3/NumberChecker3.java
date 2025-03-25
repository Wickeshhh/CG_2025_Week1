
public class NumberChecker3 {

    // Check if a number is Prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Check if a number is Neon
    public static boolean isNeon(int num) {
        int square = num * num, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Check if a number is Spy
    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    // Check if a number is Automorphic
    public static boolean isAutomorphic(int num) {
        return String.valueOf(num * num).endsWith(String.valueOf(num));
    }

    // Check if a number is Buzz
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        int num = 25;
        System.out.println("Number: " + num);
        System.out.println("Is Prime: " + isPrime(num));
        System.out.println("Is Neon: " + isNeon(num));
        System.out.println("Is Spy: " + isSpy(num));
        System.out.println("Is Automorphic: " + isAutomorphic(num));
        System.out.println("Is Buzz: " + isBuzz(num));
    }
}

