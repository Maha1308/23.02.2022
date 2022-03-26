package com.encapulation;

public class employee {
	
int employee_id;
String employee_name;
String employee_address;
double employee_salary;

 static String orgName;
  
 
 public employee()
 {
	 employee_id= 2356;
	 employee_name="Mahalakshmi";
	 employee_address="Pondicherry";
	 employee_salary=25000.65;
 }
 
 static
 {
	 orgName="Tcs";
	 
 }
 public void getemployeeInfo()
 {
	 System.out.println("employee_details");
	 System.out.println("*******************************");
	 System.out.println(employee_id);
	 System.out.println(employee_name);
	 System.out.println(employee_address);
	 System.out.println(employee_salary);
 }
 
 

	public static void main(String[] args) {
	
 employee employee1= new employee();
 employee1.getemployeeInfo();
		 
	}

}
