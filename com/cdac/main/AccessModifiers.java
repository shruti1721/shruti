package com.cdac.main;

import java.util.Scanner;

public class AccessModifiers {
	
	int a;
	int b;
	
	public void GetData()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number: ");
		a=sc.nextInt();
		System.out.println("Enter b number: ");
		b=sc.nextInt();
	}
	
	public void ShowData() {
		System.out.println("The value of a" + a + "The value of b: "+ b);
	}
}
class AccesModifiersTest {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		AccessModifiers a1 = new AccessModifiers();
		System.out.println("GetData called: ");
		a1.GetData();
		System.out.println("ShowData called: ");
		a1.ShowData();
		AccessModifiers a2 = new AccessModifiers();
		System.out.println("GetData called: ");
		a2.a=30;
		a2.b=40;
		//a2.ShowData();		
	}

}
