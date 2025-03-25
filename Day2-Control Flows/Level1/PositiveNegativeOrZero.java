import java.util.Scanner;
public class PositiveNegativeOrZero{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter number: ");
		
		//Input the number
		if (!scanner.hasNextInt()){
			System.out.println("Invalid input");
		} else {
			int number = scanner.nextInt();
			
			//Check if number is greater than, lesser than or equal to zero
		
			if (number > 0){
				System.out.println("Positive");
			} else if (number < 0) {
				System.out.println("Negative");
			} else {
				System.out.println("Zero");
			}
		}
		scanner.close();
	}
}