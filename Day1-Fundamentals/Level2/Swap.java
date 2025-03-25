import java.util.Scanner;
public class Swap {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
//Gettings user input for the two numbers
int number1 = scanner.nextInt();
int number2 = scanner.nextInt();
//Initializing a temporary variable for it to store the number1
int tempVariable= number1;
number1 = number2;
number2 = tempVariable;
//Displaying the result
System.out.println("The swapped numbers are " + number1 + " and " +number2);
}
}