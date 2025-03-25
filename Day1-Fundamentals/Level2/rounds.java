import java.util.Scanner;
public class rounds {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
//Gathering input for all three sides of the park
double side1 = scanner.nextDouble();
double side2 = scanner.nextDouble();
double side3 = scanner.nextDouble();
//Calculating perimeter and maximum rounds the athlete can run
double parkPerimeter = side1 + side2 + side3;
double rounds = 5000 / parkPerimeter;
//Displaying the result
System.out.println("The total number of rounds the athlete will

run is " + (int) rounds + " to complete 5 km");
}
}