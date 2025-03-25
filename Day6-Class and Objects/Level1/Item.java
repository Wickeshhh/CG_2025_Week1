import java.util.Scanner;

public class Item{
	private int itemCode;
	private String itemName;
	private double price;
	
	Item (int itemCode, String itemName, double price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	public void display(){
		System.out.println("Item Code: " + itemCode);
        System.out.println("Item:  " + itemName);
        System.out.println("Price: $" + price);
	}
	
	public double calcTotalCost(int quantity){
		return price * quantity;
		//System.out.print(" Total cost: " + (price * quantity));
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter item details");
		System.out.print("Item Code: ");
		int iCode = input.nextInt();
		
		System.out.print("Item Name: ");
		String iName = input.next();
		
		System.out.print("Item Price: ");
		double iPrice = input.nextDouble();
		
		Item i = new Item(iCode, iName, iPrice);
		i.display();
		
		System.out.print("Enter quantity: ");
		int iQuantity= input.nextInt();
		double totalCost = i.calcTotalCost(iQuantity);
		System.out.println("Total Cost for " + iQuantity + " items: $" + totalCost);
	}
}

