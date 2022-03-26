package org.abstraction;



public class customer extends Organization
{	


	String customer_address;

	static String orgName;


	public customer() 
	{

	}

	static
	{
		orgName = " Aanadham textiles";
	}
	//methods
	public void getcustomerInfo()
	{
		System.out.println(orgName);
		System.out.println(customer_id);
		System.out.println(customer_name);
		System.out.println(customer_address);

	}

	public static void main(String[] args) 
	{

		System.out.println("Textiles detilas:");
		System.out.println("***************************************");
		customer Customer1 = new customer();
		Customer1.customer_id = 3930;
		Customer1.customer_name = "Ram";
		Customer1.customer_address = "Pondicherry";
		Customer1.getcustomerInfo();

		System.out.println("======================");
		customer Customer2 = new customer();
		Customer2.customer_id = 4530;
		Customer2.customer_name = "vijai";
		Customer2.customer_address = "Karaikal";
		Customer2.getcustomerInfo();
		

	}
}