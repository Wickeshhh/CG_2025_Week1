import java.util.Scanner;


public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;


    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    // Method to deposit amount
    public void depositAmount(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
       
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    // Method to withdraw amount
    public void withdrawAmount(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
       
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn ₹" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }


    // Method to display balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }


    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bank = new BankAccount("Akhilesh", "ABC01", 10000.00);


        while (true) {
            System.out.println("\nWelcome! What would you like to do?");
            System.out.println("1. Deposit Amount\n2. Withdraw Amount\n3. Check Balance\n4. Exit");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();


            switch (option) {
                case 1: bank.depositAmount(scanner);
                    break;
                case 2: bank.withdrawAmount(scanner);
                    break;
                case 3: bank.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Input. Please try again.");
            }
        }
    }
}
