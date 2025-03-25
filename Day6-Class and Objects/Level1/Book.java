
import java.util.Scanner;

public class Book{
	private String title;
	private String author;
	private double price;
	
	Book (String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void display(){
		System.out.println("Book Name: " + title);
        System.out.println("Author:  " + author);
        System.out.println("Price: $" + price);
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Book Name: ");
		String t = input.nextLine();
		
		System.out.print("Author Name: ");
		String auth = input.nextLine();
		
		System.out.print("Book Price: ");
		double p = input.nextDouble();
		
		Book b = new Book(t, auth, p);
		
		b.display();
	}	
}

