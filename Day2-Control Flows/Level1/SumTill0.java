import java.util.Scanner;

public class SumTill0{
	public static void main(String[] args){
		double total = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		//take input
		while(true){
			System.out.print("Enter number (0 to stop): ");
			double num = scanner.nextDouble();
			if (num == 0){
				break;
			} else{
				total += num;
			}
		}
		System.out.println(total);
		scanner.close();
	}
}