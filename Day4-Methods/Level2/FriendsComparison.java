
import java.util.Scanner;

public class FriendsComparison {

    public static int findYoungest(int[] ages) {
        int minAge = ages[0];
        for (int age : ages) {
            if (age < minAge) minAge = age;
        }
        return minAge;
    }

    public static double findTallest(double[] heights) {
        double maxHeight = heights[0];
        for (double height : heights) {
            if (height > maxHeight) maxHeight = height;
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];

        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (cm) of " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        System.out.println("Youngest Friend Age: " + findYoungest(ages));
        System.out.println("Tallest Friend Height: " + findTallest(heights) + " cm");

        scanner.close();
    }
}



