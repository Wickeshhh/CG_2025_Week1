import java.util.Scanner;
public class LargestOf3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		//Input the 3 numbers
		System.out.print("enter number 1: ");
		int num1 = scanner.nextInt();
		System.out.print("enter number 2: ");
		int num2 = scanner.nextInt();
		System.out.print("enter number 3: ");
		int num3 = scanner.nextInt();
		//Find the largest number among the 3 numbers
		int smallest = (num1>=num2 && num1>=num3) ? num1 : (num2>=num3 && num2>=num1) ? num2 : num3;
		//Display the largest number
		System.out.printf("Is the first number the largest? %b%nIs the second number the largest? %b%nIs the third number the largest? %b%n", (num1==smallest), (num2==smallest), (num3==smallest));
		scanner.close();
	}
		
}