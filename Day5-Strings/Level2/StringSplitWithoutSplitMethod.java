
import java.util.Scanner;
import java.util.Arrays;

public class StringSplitWithoutSplitMethod {
    public static String[] customSplit(String str) {
        int wordCount = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') wordCount++;
        }
        
        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words[index++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = str.substring(start);
        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] customWords = customSplit(input);
        String[] builtInWords = input.split(" ");

        System.out.println("Custom Split: " + Arrays.toString(customWords));
        System.out.println("Built-in Split: " + Arrays.toString(builtInWords));
    }
}

