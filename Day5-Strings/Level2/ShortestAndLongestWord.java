
import java.util.Arrays;

public class ShortestAndLongestWord {
    public static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0], longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        String text = "Java is an amazing language";
        String[] words = text.split(" ");
        String[] result = findShortestAndLongest(words);

        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
    }
}



