
public class NumberFormatDemo {
    public static void generateException() {
        String text = "abc123";
        int num = Integer.parseInt(text); // Not a valid number
    }

    public static void handleException() {
        try {
            String text = "abc123";
            int num = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to test exception
        handleException();
    }
}

