import java.util.Scanner;

public class Circle{
	private double radius;
	
	Circle (double radius){
		this.radius = radius;
	}
	
	public void display(){
		double area = 3.14 * radius * radius;
		double circumference = 2 * 3.14 * radius;
		
		System.out.printf("Area of circle: %.2f", area);
		System.out.printf("\Circumference of circle: %.2f", circumference);
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double r = input.nextDouble();
		Circle c = new Circle(r);
		
		c.display();
	}	
}

