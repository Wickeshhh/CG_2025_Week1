import java.util.Scanner;
public class CelsiusToFahrenheit{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
//Gather celsius input
double celsius = scanner.nextDouble();
//Calculate the fahrenheit
double fahrenheit = (celsius*9/5) + 32;
//Displaying the output
System.out.print("The " + celsius +" celsius is " + fahrenheit+ "
fahrenheit");
scanner.close();
}
}