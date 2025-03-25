import java.util.Random;

public class RandomNumberAnalysis {

    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // Ensures 4-digit numbers
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0], max = numbers[0];

        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        double avg = sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        double[] results = findAverageMinMax(numbers);

        System.out.print("Generated numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nAverage: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}

