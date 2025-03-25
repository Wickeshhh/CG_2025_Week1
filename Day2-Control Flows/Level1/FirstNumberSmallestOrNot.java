import java.util.Scanner;

public class FirstNumberSmallestOrNot{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Input the 3 numbers
		System.out.print("Number 1: ");
		int number1 = input.nextInt();
		System.out.print("Number 2: ");
		int number2 = input.nextInt();
		System.out.print("Number 3: ");
		int number3 = input.nextInt();
		//Check if first number is the smallest and display the output
		System.out.printf("Is the first number the smallest? %b", ((number1 < number2) && (number1 < number3)));
		input.close();
	}
}