
import java.util.Scanner;

public class CountVowelsConsonants {
    public static int[] countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) vowels++;
            else if (Character.isLetter(ch)) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] result = countVowelsConsonants(input);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}



