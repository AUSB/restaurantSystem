package restaurant;

import java.util.Scanner;

public class tester {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price =0;
		int numOfCustomers=0;
		
		restaurant rest =new restaurant();
		scanner = new Scanner(System.in);
		System.out.println("Enter 0 to stop reading input");
		System.out.println("Enter amount of Purchase");
		price=scanner.nextDouble();
		
		while (price!=0)
		{
			System.out.println("Enter customer name");	
			String customerName= scanner.next();
			numOfCustomers++;
			rest.addSale(customerName, price);
			System.out.println("Enter amount of purchase");
			price=scanner.nextDouble();
			
			
		}
		
		
		if(numOfCustomers>0)
		{
			System.out.println("Best Customer");
			System.out.println(rest.nameBestCustomer());
			}
		
	}

}
