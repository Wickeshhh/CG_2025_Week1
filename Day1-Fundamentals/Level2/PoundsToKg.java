import java.util.Scanner;
public class PoundsToKg {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

//Inputting weight in pounds

System.out.println("Enter the weight in pounds");
double WeightInLbs = scanner.nextDouble();

//Calculating weight in kilograms

double WeightInKgs = WeightInLbs / 2.2;

//Displaying the output

System.out.println("The weight of the person in pound is

"+WeightInLbs+"lbs and in kg is "+WeightInKgs+"kg");
}
}