package com.cdac.main;

abstract class Person{
	String Name;
	int Age;
	String Gender;
	String Address;
	String City;	
	public void display() {
		System.out.println("Name:" +Name+", Age: "+Age+", Gender: "+Gender+", Address: "+Address+", City: "+City);
	}
	
}

class Student extends Person {
	int Rollno;
	String CourseName;
	String InstituteName;
	char Grade;
	public void display() {
		super.display();
		System.out.println("Rollno:" +Rollno+", CourseName: "+CourseName+", InstituteName: "+InstituteName+", Grade: "+Grade);
	} 
}
class Employee1 extends Person{
	int EmployeeId;
	float Salary;
	String OrgName;
	String IndustryType;
}


public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s1=new Student();  //compile time 
			Person p1 =new Student();  //run time
			s1.Name ="Shalu";
			s1.Age=14;
			s1.Rollno=1001;
			s1.CourseName="DBDA";
			p1.display();
			s1.display();
			
			
			
	}

}
