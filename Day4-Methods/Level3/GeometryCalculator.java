import java.util.Scanner;

public class GeometryCalculator {

    // Method to find the Euclidean distance
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of a line
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2]; // equation[0] = slope (m), equation[1] = y-intercept (b)
        
        if (x1 == x2) {
            System.out.println("The line is vertical, so it does not have a valid slope-intercept form.");
            return null;
        }
        
        double m = (y2 - y1) / (x2 - x1); // Slope formula
        double b = y1 - m * x1;           // y-intercept formula

        equation[0] = m;
        equation[1] = b;
        return equation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate Euclidean distance
        double distance = findDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        // Find the equation of the line
        double[] equation = findLineEquation(x1, y1, x2, y2);
        if (equation != null) {
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", equation[0], equation[1]);
        }

        scanner.close();
    }
}

