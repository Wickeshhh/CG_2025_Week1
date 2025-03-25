import java.util.Scanner;
public class EligibleToVote{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter age: ");
		
		//Input the age
		int age = scanner.nextInt();
		
		//Check if eligible to vote and display the output
		if (age >= 18){
			System.out.printf("The person's age is %d and can vote", age);
		} else {
			System.out.printf("The person's age is %d and cannot vote", age);
		}
		scanner.close();
	}
}