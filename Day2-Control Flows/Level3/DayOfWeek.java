import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for date
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = scanner.nextInt();

        System.out.print("Enter year: ");
        int y = scanner.nextInt();

        // Applying the formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Display the result
        System.out.println("The day of the week is: " + d0);
        System.out.println("(0=Sunday, 1=Monday, 2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday, 6=Saturday)");

        scanner.close();
    }
}
