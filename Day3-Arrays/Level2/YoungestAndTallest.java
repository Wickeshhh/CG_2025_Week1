
import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Finding the youngest friend
        int minAge = ages[0];
        String youngest = names[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }

        // Finding the tallest friend
        double maxHeight = heights[0];
        String tallest = names[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }

        // Displaying results
        System.out.println("\nYoungest friend: " + youngest + " (Age: " + minAge + ")");
        System.out.println("Tallest friend: " + tallest + " (Height: " + maxHeight + " cm)");

        scanner.close();
    }
}



