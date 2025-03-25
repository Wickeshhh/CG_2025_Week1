import java.util.Scanner;
public class FahrenheitToCelsius{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
//Gather fahrenheit input
double fahrenheit = scanner.nextDouble();
//Calculate for celsius
double celsius = (fahrenheit-32.0)*5.0/9.0;
//Displaying the output
System.out.print("The fahrenheit " + fahrenheit +" is "+ celsius + "
celsius");
scanner.close();
}
}