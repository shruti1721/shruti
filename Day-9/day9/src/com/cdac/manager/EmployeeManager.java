package com.cdac.manager;
import java.util.Scanner;
import com.cdac.domain.Employee;

public class EmployeeManager {

	Employee[] emplist=new Employee[6];
	
	public EmployeeManager() {
		
		emplist[0]=new Employee(1001, "Malkeet", 45000f);
		emplist[1]=new Employee(1002, "Sandeep", 34000f);
		emplist[2]=new Employee(1003, "Mohit", 50000f);
		emplist[3]=new Employee(1004, "Sahiba", 56000f);
		emplist[4]=new Employee(1005, "Preeti", 67000f);
	}
	public void ShowData()
	{
		for(int i=0;i<emplist.length;i++)
		{
			if(emplist[i]==null)
			{
				continue;
			}
			else
			{
			System.out.println(emplist[i].toString());
			}
			
		}
	}
	public boolean InsertRecord()
	{
		boolean si=false;
		for(int i=0;i<emplist.length;i++)
		{
			if(emplist[i]==null)
			{
				emplist[i]=new Employee();
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Name:  ");
				emplist[i].Name=sc.nextLine();
				System.out.println("Enter Id:  ");
				emplist[i].EmpId=sc.nextInt();
				System.out.println("Enter Salary:  ");
				emplist[i].Salary=sc.nextFloat();
				si=true;
				break;
			}
		}
		return si;
	}
	public boolean UpdateRecord(int id)
	{
		boolean tempst=false;
		for(int i=0;i<emplist.length;i++)
		{
			
			if(emplist[i].EmpId==id)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Record Found");
				System.out.println("Enter Name:  ");
				String tempName=sc.nextLine();
				System.out.println("Enter Salary:  ");
				float tempSal=sc.nextFloat();
				emplist[i].Name=tempName;
				emplist[i].Salary=tempSal;
				tempst=true;
				break;
			}			
		}
		return tempst;
	}
	public boolean DeleteRecord(int id)
	{
		boolean temp=false;
		
		for(int i=0;i<emplist.length;i++)
		{
			
			if(emplist[i].EmpId==id)
			{
				emplist[i]=null;
				temp=true;
				break;
			}			
		}
		return temp;
	}
	
}
