
import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {
    
    // Method to generate random scores for PCM subjects
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: PCM
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + random.nextInt(61); // Physics (40-100)
            scores[i][1] = 40 + random.nextInt(61); // Chemistry (40-100)
            scores[i][2] = 40 + random.nextInt(61); // Maths (40-100)
        }
        return scores;
    }

    // Method to compute total, average, and percentage
    public static double[][] computeResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // Total, Avg, Percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounding to 2 decimals
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display student scorecards
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f%%\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking number of students as input
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generating scores and computing results
        int[][] scores = generateScores(numStudents);
        double[][] results = computeResults(scores);

        // Displaying the scorecard
        displayScorecard(scores, results);

        scanner.close();
    }
}

