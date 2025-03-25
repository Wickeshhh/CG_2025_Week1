
import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete needs to complete " + (int) Math.ceil(rounds) + " rounds to complete 5 km.");

        scanner.close();
    }

    // Method to calculate the number of rounds
    public static double calculateRounds(double s1, double s2, double s3) {
        double perimeter = s1 + s2 + s3;
        return 5000 / perimeter; // 5000 meters = 5 km
    }
}

