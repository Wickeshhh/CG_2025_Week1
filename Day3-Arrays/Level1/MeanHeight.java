
import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        System.out.println("Mean height: " + (sum / 11));
        scanner.close();
    }
}



