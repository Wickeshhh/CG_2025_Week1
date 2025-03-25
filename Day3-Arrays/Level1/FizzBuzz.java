
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        String[] results = new String[n];

        for (int i = 1; i <= n; i++) {
            results[i - 1] = (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" :
                             (i % 3 == 0) ? "Fizz" :
                             (i % 5 == 0) ? "Buzz" : String.valueOf(i);
        }

        for (int i = 0; i < n; i++) System.out.println("Position " + (i + 1) + " = " + results[i]);
        
        scanner.close();
    }
}

