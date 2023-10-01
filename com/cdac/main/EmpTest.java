package com.cdac.main;
import java.util.Scanner;

class  Emp
{	
	String Name;
	int Id;
	float Salary;
	//This definition has no arguments list
	public void SetData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name, Id and Salary of Employee:  ");
		Name = sc.nextLine();
		Id=sc.nextInt();
		Salary=sc.nextFloat();
		
	}
	
	public void SetData(String Name, int Id, float Salary) {
		
		
	
	//This definition has no arguments
	public void PrintData() {
	System.out.println("Employee Name: "+ Name+" Id: "+ Id+ " Salary: "+ Salary);	
		}
	//This definition has one argument list
	public void PrintData(Emp e1) {
	System.out.println("Employee Name: "+ e1.Name+" Id: "+ e1.Id+ " Salary: "+ e1.Salary);	
	}
}

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp();
		e1.SetData();
		//Method Overloading
		e1.PrintData();
		e1.PrintData(e1);
		
		Emp e2= new Emp();
		e2.SetData("Shruti, 101, 5463.56f");
		e2.PrintData();
		
	}

}
