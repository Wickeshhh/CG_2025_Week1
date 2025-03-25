import java.util.Scanner;

public class DivisibleBy5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Input number to check divisibility
		int number = input.nextInt();
		//Displaying the output, checking for divisibility
		System.out.printf("Is the number %d divisible by 5? %b%n", number, (number % 5 == 0));
		input.close();
	}
}