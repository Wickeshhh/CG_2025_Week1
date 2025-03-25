
import java.util.Random;

public class StudentScorecard {
    // Generate random scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + random.nextInt(61); // Physics
            scores[i][1] = 40 + random.nextInt(61); // Chemistry
            scores[i][2] = 40 + random.nextInt(61); // Math
        }
        return scores;
    }

    // Calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round(average * 100.0) / 100.0;
            
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = percentage;
        }
        return results;
    }

    // Assign grades based on percentage
    public static String[] assignGrades(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // Display the student scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s\n",
                (i + 1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numStudents = 5;  // Change as needed
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        String[] grades = assignGrades(results);
        displayScorecard(scores, results, grades);
    }
}



