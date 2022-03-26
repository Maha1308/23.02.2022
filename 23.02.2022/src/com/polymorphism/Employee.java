package com.polymorphism;



public class Employee extends Organization
{	

	
	double salary;

	static String orgName;

	
	public Employee() 
	{
		salary = 49383.45;
	}

	
	static
	{
		orgName = "Wipro";
	}
	

	public void getInfo2()
	{
		System.out.println(salary);
		System.out.println(orgName);
	}
	
	public void getInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(orgName);
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("employee details:");
		Employee employee = new Employee();
		employee.id = 9087;
		employee.name = "Devi";
		employee.salary=87000.89;
		
		employee.getInfo();
		
		System.out.println("====================");
		
		Organization organization = new Organization();
		
		organization.getInfo();

	}


}


