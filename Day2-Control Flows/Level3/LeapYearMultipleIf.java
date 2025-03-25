
import java.util.Scanner;

public class LeapYearMultipleIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Checking if the year is within the Gregorian calendar
        if (year < 1582) {
            System.out.println("The Leap Year program only works for years 1582 and later.");
        } else {
            // Checking for Leap Year conditions using multiple if-else
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        scanner.close();
    }
}

