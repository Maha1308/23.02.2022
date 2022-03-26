package Inheritance;

public class student extends Organization {
	
		double Student_mark;

		static String orgName;

		public student() 
		{

		}
	
		static
		{
			orgName = "PKIET";
		}
		
		public void getstudentInfo()
		{
			
			System.out.println(orgName);
			System.out.println(Student_Roll);
			System.out.println(Student_name);
			System.out.println(Student_mark);
			
		}
	
		public static void main(String[] args) 
		{
			System.out.println("Student Details:");
			System.out.println("___________________________________");
		    
			student Student = new student();
			Student.Student_Roll = 3930;
			Student.Student_name = "veena";
			Student.Student_mark = 890.45;

			Student.getstudentInfo();

			System.out.println("======================");

			student Student1 =  new student();
			Student1.Student_Roll = 5678;
			Student1.Student_name = "harish";
			Student1.Student_mark = 789.32;

			Student1.getstudentInfo();


		}


	}
