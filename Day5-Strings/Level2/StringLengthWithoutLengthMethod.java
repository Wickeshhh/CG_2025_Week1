
import java.util.Scanner;

public class StringLengthWithoutLengthMethod {
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        scanner.close();

        int customLength = getStringLength(input);
        int builtInLength = input.length();

        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length: " + builtInLength);
    }
}

