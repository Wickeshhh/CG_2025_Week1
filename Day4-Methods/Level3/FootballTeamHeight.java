
import java.util.Random;

public class FootballTeamHeight {

    public static int[] generateRandomHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); // Generates height between 150-250 cm
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) min = height;
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) max = height;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);

        System.out.print("Player Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\nMean Height: " + findMean(heights));
        System.out.println("Shortest Player: " + findShortest(heights));
        System.out.println("Tallest Player: " + findTallest(heights));
    }
}

