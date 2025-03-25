import java.util.Scanner;
public class SumOfNaturalNumbers{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter number: ");
		
		//Input the number
		int number = scanner.nextInt();
		
		//Check if its a natural number and display the output
		if (number>= 0){
			System.out.printf("The sum of %d natural numbers is %d", number, (number * (number + 1)/2));
		} else {
			System.out.printf("The number %d is not a natural number", number);
		}
		scanner.close();
	}
}

//if using ternary operator

/*import java.util.Scanner;
public class SumOfNaturalNumbers{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter number: ");
		
		//Input the number
		int number = scanner.nextInt();
		
		//Check if its a natural number
		String result = (number >= 0)
		? String.format("The sum of %d natural numbers is %d%n", number, (number * (number + 1)/2))
		: String.format("The number %d is not a natural number %n", number);
		
		//Displaying the output
		System.out.print(result);
		scanner.close();
	}
}*/
