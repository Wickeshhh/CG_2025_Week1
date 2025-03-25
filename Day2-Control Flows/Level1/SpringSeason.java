import java.util.Scanner;

public class SpringSeason{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Input the month and date
		System.out.print("Enter the month: ");
		int month = scanner.nextInt();
		
		System.out.print("Enter the date: ");
		int date = scanner.nextInt();
		
		//compute the range of Spring Season
		boolean isSpring = (month ==3 && date >=20) || 
						   (month ==6 && date <=20) ||
						   (month > 3 && month < 6);
		
		//Check for Spring Season
		if (isSpring){
			System.out.println("Its a Spring Season");
		} else {
			System.out.println("Its not a Spring Season");
		}
		scanner.close();
	}
}