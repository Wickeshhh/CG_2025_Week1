import java.util.Scanner;
class CartItem {
    private HashMap<String, Integer> cart;
    private HashMap<String, Double> priceList;
    // Constructor
    public CartItem() {
        cart = new HashMap<>();
        priceList = new HashMap<>();
    }
    // Method to add an item
    public void addItem(String itemName, double price, int quantity) {
        cart.put(itemName, cart.getOrDefault(itemName, 0) + quantity);
        priceList.put(itemName, price);
        System.out.println(quantity + " " + itemName + "(s) added to the cart.");
    }
    // Method to remove an item
    public void removeItem(String itemName) {
        if (cart.containsKey(itemName)) {
            cart.remove(itemName);
            priceList.remove(itemName);
            System.out.println(itemName + " removed from the cart.");
        } else {
            System.out.println("Item not found in cart.");
        }
    }


    // Method to display total cost
    public void displayTotalCost() {
        double totalCost = 0;
        System.out.println("\nCart Summary:");
        for (String item : cart.keySet()) {
            int quantity = cart.get(item);
            double price = priceList.get(item);
            System.out.println(item + " x" + quantity + " → ₹" + (price * quantity));
            totalCost += price * quantity;
        }
        System.out.println("Total Cost: ₹" + totalCost);
    }
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CartItem cart = new CartItem();
        while (true) {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. View Total Cost\n4. Exit");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (option) {
                case 1:
                    System.out.print("Enter item name: ");
                    String item = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = scanner.nextInt();
                    cart.addItem(item, price, qty);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeItem = scanner.nextLine();
                    cart.removeItem(removeItem);
                    break;
                case 3:
                    cart.displayTotalCost();
                    break;
                case 4:
                    System.out.println("Exiting shopping cart.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
