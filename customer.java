package restaurant;

public class customer {
	
	//Attributes
	private String customerName;
	private double purchase;
	
	//Constructor
	public customer(String customerName, double purchase)
	{
		
		this.customerName=customerName;
		this.purchase=purchase;
	
	}
	
	/**
	 * @return customerName
	 */
	public String getName()
	{
		return customerName;
		
	}
	
	/**
	 * @return purchase
	 */
	public double getPurchase()
	{
		return purchase;
		
		
	}
	
	/**
	 * @return String print customer name and its purchase
	 */
	public String toString()
	{
		return getName()+"\t"+getPurchase();
	}
	
	

}
