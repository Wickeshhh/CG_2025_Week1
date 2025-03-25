
public class UpperCaseConversion {
    public static String convertToUpperUsingCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String upperCharAt = convertToUpperUsingCharAt(text);
        String upperBuiltIn = text.toUpperCase();

        System.out.println("Using charAt(): " + upperCharAt);
        System.out.println("Using toUpperCase(): " + upperBuiltIn);
        sc.close();
    }
}

