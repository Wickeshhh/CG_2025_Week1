
public class LowerCaseConversion {
    public static String convertToLowerUsingCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String lowerCharAt = convertToLowerUsingCharAt(text);
        String lowerBuiltIn = text.toLowerCase();

        System.out.println("Using charAt(): " + lowerCharAt);
        System.out.println("Using toLowerCase(): " + lowerBuiltIn);
        sc.close();
    }
}

