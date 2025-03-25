
public class TrimSpaces {
    public static String customTrim(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return str.substring(start, end + 1);
    }

    public static void main(String[] args) {
        String input = "   Hello World   ";
        String trimmed = customTrim(input);
        System.out.println("Custom Trim: '" + trimmed + "'");
        System.out.println("Built-in Trim: '" + input.trim() + "'");
    }
}



