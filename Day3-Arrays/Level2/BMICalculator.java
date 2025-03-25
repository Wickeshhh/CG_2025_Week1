import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        // Arrays to store data
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        // Taking input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();

            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();

            // Calculate BMI
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status based on BMI
            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nHeight (m) | Weight (kg) | BMI  | Status");
        System.out.println("----------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f       | %.2f       | %.2f | %s\n", heights[i], weights[i], bmis[i], statuses[i]);
        }

        scanner.close();
    }
}

