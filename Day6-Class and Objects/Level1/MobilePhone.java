import java.util.Scanner;

public class MobilePhone{
	private String brand;
	private String model ;
	private double price;
	
	MobilePhone (String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void display(){
		System.out.println("Phone Brand: " + brand);
        System.out.println("Phone Model:  " + model);
        System.out.println("Price: $" + price);
	}
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Phone Details");
		System.out.print("Phone Brand: ");
		String pBrand = input.next();
		
		System.out.print("Phone Model: ");
		String pModel= input.next();
		
		System.out.print("Phone Price: ");
		double pPrice = input.nextDouble();
		
		MobilePhone mp = new MobilePhone(pBrand, pModel, pPrice);
		mp.display();
		
		
	}
}

