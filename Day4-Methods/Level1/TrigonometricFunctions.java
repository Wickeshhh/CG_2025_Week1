import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        scanner.close();
    }

    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }
}

