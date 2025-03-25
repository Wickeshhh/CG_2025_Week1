
public class IllegalArgumentDemo {
    public static void generateException() {
        String text = "Hello";
        System.out.println(text.substring(4, 2)); // Invalid range
    }

    public static void handleException() {
        try {
            String text = "Hello";
            System.out.println(text.substring(4, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to test exception
        handleException();
    }
}

