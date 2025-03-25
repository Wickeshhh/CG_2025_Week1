import java.util.Scanner;
public class DivideChocolates {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
//Inputting no. of chocolates and children
System.out.println("No.of Chocolates");
double numberOfChocolates = scanner.nextDouble();
System.out.println("No.of Children");
double numberOfChildren = scanner.nextDouble();
//Calculating no. of chocolates each child gets

int ChocolatePerChild = (int) numberOfChocolates / (int)

numberOfChildren;

double remainingChocolates = numberOfChocolates %

numberOfChildren;

System.out.println("The number of chocolates each child gets is

"+ChocolatePerChild+" and the number of remaining chocolates are
"+remainingChocolates);
}
}