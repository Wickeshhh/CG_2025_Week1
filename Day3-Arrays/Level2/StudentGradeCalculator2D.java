
import java.util.Scanner;

public class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // 2D array to store marks of students (numStudents x 3 subjects)
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];
        String[] remarks = new String[numStudents];

        // Taking input for marks
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            
            // Input validation
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                do {
                    System.out.print(subject + ": ");
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid marks! Enter a value between 0 and 100.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            // Calculate total and percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;

            // Determine grade and remarks
            if (percentages[i] >= 80) {
                grades[i] = "A";
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i] = "R";
                remarks[i] = "Remedial standards";
            }
        }

        // Display report card for all students
        System.out.println("\n------ Student Report Cards ------");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + " Report Card:");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Average Percentage: %.2f%%\n", percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println("Remarks: " + remarks[i]);
        }

        scanner.close();
    }
}

