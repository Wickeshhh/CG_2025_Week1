
public class SubstringComparison {
    public static String getSubstringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String subCharAt = getSubstringUsingCharAt(text, start, end);
        String subBuiltIn = text.substring(start, end);

        System.out.println("Substring using charAt(): " + subCharAt);
        System.out.println("Substring using substring(): " + subBuiltIn);
        sc.close();
    }
}

