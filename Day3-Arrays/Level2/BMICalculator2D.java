
import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[number][3]; // [][0] = Weight, [][1] = Height, [][2] = BMI
        String[] weightStatus = new String[number]; // Array to store weight status

        // Taking input for weight and height
        for (int i = 0; i < number; i++) {
            // Input validation for weight
            do {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be a positive value. Please enter again.");
                }
            } while (personData[i][0] <= 0);

            // Input validation for height
            do {
                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be a positive value. Please enter again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status based on BMI
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\nHeight (m) | Weight (kg) | BMI  | Status");
        System.out.println("----------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f       | %.2f       | %.2f | %s\n", 
                personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}

