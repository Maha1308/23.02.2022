package Inheritance;

public class Organization {

	int Student_Roll; 
	String Student_name;
	
	public Organization()
	{
		Student_Roll = 3039;
		Student_name = "PKIT";
	}
	
	public void getInfo()
	{
		System.out.println(Student_Roll);
		System.out.println(Student_name);
}
}
