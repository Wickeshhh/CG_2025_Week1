
public class StringIndexDemo {
    public static void generateException() {
        String text = "Hello";
        System.out.println(text.charAt(10)); // Out of bounds
    }

    public static void handleException() {
        try {
            String text = "Hello";
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to test exception
        handleException();
    }
}

