package com.cdac.main;

public class StudentDemo {
	
	//instance variable
	int Rollno;
	String Name;
	float fees;
		
		
	StudentDemo(){
		Name="Shruti";
		Rollno=1001;
		fees=200.50f;			
	}
			
	StudentDemo(int rn, String nm, float f)
	{
		Rollno =rn;
		Name=nm;
		fees=f;
	}
	void Display() 
	{
		System.out.println("Rollno:    " + Rollno);
		System.out.println("Name:    " + Name);
		System.out.println("fees:    " + fees);
			
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDemo d1 = new StudentDemo(102, "Sandeep", 300.50f); //d1 is the reference variable of the class Student Demo)
		//new StudentDemo(); //unknownaddress
		StudentDemo d2 = new StudentDemo(63, "Radha", 436.00f);
		StudentDemo d3 = new StudentDemo();
		
		d1.Display();
		d2.Display();
		d3.Display();
	}
	

}
