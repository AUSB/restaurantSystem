package restaurant;

import java.util.ArrayList;



public class restaurant {

	
	private ArrayList customerList= new ArrayList();
	private customer c;
	
	
	/**
	 * This method adds each customer  (name and purchase) into an ArrayList
	 * @param customerName the name of customer
	 * @param amount the amount of purchase
	 */
	public void addSale(String customerName, double amount)
	{
		
	   c=new customer(customerName, amount);
		customerList.add(c);
		
	}
	

	/**
	 * This method returns the name of the best customer  (in terms of purchase amount
	 * @return String  name of the best customer
	 * 
	 */
	public String nameBestCustomer()
	{
		 customer cst= (customer) customerList.get(0);
		String bestCustomer=cst.getName();
		double bestPurchase=cst.getPurchase();
		
		for(int index=1; index<customerList.size(); index++)
		{
			customer cst1= (customer) customerList.get(index);
			if (bestPurchase< cst1.getPurchase())
				bestPurchase=cst1.getPurchase();
			    bestCustomer=cst1.getName();
		}
		
		return bestCustomer;
		
	}
}
