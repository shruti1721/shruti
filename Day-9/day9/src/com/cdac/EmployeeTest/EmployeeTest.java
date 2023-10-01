package com.cdac.EmployeeTest;

import java.util.Scanner;

import com.cdac.manager.EmployeeManager;

public class EmployeeTest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	EmployeeManager mng=new EmployeeManager();
	int choice=0;
	
	do {
        System.out.println("1. Show Employee Details");
        System.out.println("2. Insert New Employee Record");
        System.out.println("3. Update Employee Details");
        System.out.println("4. Delete Employee");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
            	mng.ShowData();
                break;
             
            case 2:
            	boolean si=mng.InsertRecord();
            	if(si==true)
            	{
            		System.out.println("Record Inserted Successfully");
            	}
            	else
            	{
            		System.out.println("Record Can't be Inserted");
            	}
            	break;
            case 3:
            	mng.ShowData();
            	System.out.println("Enter the Employee Id:");
            	int id=sc.nextInt();
            	boolean st=mng.UpdateRecord(id);
            	if(st==true)
            	{
            		System.out.println("Record Updated Successfully");
            	}
            	else
            	{
            		System.out.println("Employee not found , No Record Updated");
            	}
                break;
            case 4:
            	mng.ShowData();
            	System.out.println("Enter the Employee Id:");
            	int delid=sc.nextInt();           
            	boolean status=mng.DeleteRecord(delid);
            	if(status==true)
            	{
            		System.out.println("Record Deleted Successfully");
            	}
            	else
            	{
            		System.out.println("Employee not found , No Record Deleted");
            	}
            	break;
            case 5:
                System.out.println("Exiting program... Thank you for using our services.");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 4);
	
	
	}

}
