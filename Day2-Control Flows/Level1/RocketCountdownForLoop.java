import java.util.Scanner;

public class RocketCountdownForLoop{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Input countdown start number
		System.out.print("Enter number for starting countdown: ");
		int counter = scanner.nextInt();
		
		for (int i = counter; i>0; i--){
			System.out.println(i);
		}
		scanner.close();
	}
}