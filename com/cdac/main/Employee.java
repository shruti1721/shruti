package com.cdac.main;

import java.util.Scanner;

class Employee2{
	
		
	//Instance variable// TODO Auto-generated method stub
	int EmpId;
	String EmpName;
	float EmpSalary;
	float EmpData;
	//Static Variables
	static String EmpDept;
	
	public Employee2() {   				//static variable can be altered in constructor of the class.
		
		EmpDept="CSE";					
	}
	public void SetData()                //static variable can be altered in non static method
	{
		EmpData="Shruti";
	
	}
	static {                     		 //static variable can be altered in static block
		EmpDept="Shruti";
	}
	public static void Set() {
		//EmpId=1001;                    //Not okay //Non static property under static block/method is not ok.
	}
		
										//static variable can be altered in static method
}										//you cannot accessed any non static variable under some static block, static method
										// can be accessed inside public method, constructor of the class.

class EmployeeDetail{
	
	//Instance variable// TODO Auto-generated method stub
	int EmpId;
	String EmpName;
	float EmpSalary;
	
	void AcceptRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id of the Employee: ");
		EmpId=sc.nextInt();
		sc.nextLine(); //It will eliminate enter effect while getting string data
		System.out.println("Enter the Name of the Employee: ");
		EmpName=sc.nextLine();
		System.out.println("Enter the Salary of the Employee: ");
		EmpSalary=sc.nextFloat();
	}
	void PrintRecord() {
		System.out.println("Name: "+ EmpName +" EmpId: " + EmpId +" EmpSalary: "+ EmpSalary);
	}
}
public class Employee{
	public static void main(String[] args) {
	
		//EmployeeDetail e1=new EmployeeDetail(); //It will create Employee
		//e1.AcceptRecord();   //Accept Record Method will be called over Instance variable
		//e1.PrintRecord();
		
		EmployeeDetail earr[]=new EmployeeDetail[5]; //<Classname> <reference name>[]=new <class name>[size];  //Array of references of Class EmployeeDetail.
		//earr[0]= new EmployeeDetail();               //creating and then Assigning object->create array of references one by one.
	
		for(int i=0;i<2;i++) {
			earr[i]=new EmployeeDetail();				//At once we can create and assign with this loop, it will create employee object and assign them in array of reference
			earr[i].AcceptRecord();
		}
		
		for(int i=0;i<2;i++) {
			
			earr[i].PrintRecord();
		
																	//this loop will create employee object and assign them in array of reference.
																	// reference is very imp to locate the object.
		}
																	//for(int i=0;i<2;i++) {
																	//this loop will create employee object and assign them in array of reference.
																	// reference is very imp to locate the object.
			
	}
	

}
