import java.util.Scanner;


class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;
    // Constructor
    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.isBooked = false;
    }
    // Method to book a ticket
    public void bookTicket(String seatNumber) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName + " at Seat " + seatNumber);
        } else {
            System.out.println("Seat already booked!");
        }
    }
    // Method to display ticket details
    public void displayTicket() {
        if (isBooked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a movie ticket
        MovieTicket ticket = new MovieTicket("Inception", 250.00);
        System.out.print("Enter seat number to book: ");
        String seatNumber = scanner.nextLine();
        // Book ticket
        ticket.bookTicket(seatNumber);
        // Display ticket details
        ticket.displayTicket();
        scanner.close();
    }
}
