
public class ArrayIndexDemo {
    public static void generateException() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); // Out of bounds
    }

    public static void handleException() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to test exception
        handleException();
    }
}

