import java.util.Scanner;

public class RocketCountdown{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Input countdown start number
		System.out.print("Enter number for starting countdown: ");
		int counter = scanner.nextInt();
		
		while (counter >= 0){
			System.out.println(counter);
			counter--;
		}
		scanner.close();
	}
}