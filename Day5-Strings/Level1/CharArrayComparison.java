
public class CharArrayComparison {
    public static char[] getCharsUsingCharAt(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] charsCharAt = getCharsUsingCharAt(text);
        char[] charsBuiltIn = text.toCharArray();

        System.out.println("Using charAt(): " + new String(charsCharAt));
        System.out.println("Using toCharArray(): " + new String(charsBuiltIn));
        sc.close();
    }
}

