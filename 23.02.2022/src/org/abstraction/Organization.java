package org.abstraction;

public class Organization
{

	int customer_id; 
		String customer_name;

	public Organization()
	{
		customer_id = 3039;
		customer_name = "textile";
	}
	
	public void getInfo()
	{
		System.out.println(customer_id);
		System.out.println(customer_name);
}
}
