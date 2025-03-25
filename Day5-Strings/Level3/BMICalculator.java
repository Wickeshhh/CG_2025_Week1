import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and return BMI Status
    public static String[][] calculateBMI(double[][] data) {
        String[][] bmiData = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100.0; // Convert cm to meters
            double bmi = weight / (heightMeters * heightMeters);
            bmi = Math.round(bmi * 100.0) / 100.0; // Round to 2 decimal places

            // Determine BMI Status
            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            // Store data in the result array
            bmiData[i][0] = String.valueOf(weight);
            bmiData[i][1] = String.valueOf(data[i][1]);
            bmiData[i][2] = String.valueOf(bmi);
            bmiData[i][3] = status;
        }
        return bmiData;
    }

    // Method to display the BMI table
    public static void displayBMIReport(String[][] bmiData) {
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");

        for (String[] person : bmiData) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", person[0], person[1], person[2], person[3]);
        }
        System.out.println("-----------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] peopleData = new double[10][2]; // Stores weight and height

        // Taking input for 10 people
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            peopleData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            peopleData[i][1] = scanner.nextDouble();
        }
        scanner.close();

        // Calculate BMI and get status
        String[][] bmiResults = calculateBMI(peopleData);

        // Display BMI Report
        displayBMIReport(bmiResults);
    }
}

