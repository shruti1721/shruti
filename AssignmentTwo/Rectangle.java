package AssignmentTwo;

import java.util.Scanner;

public class Rectangle {
	
	static double length;
	static double breadth;
	
	Rectangle(double length, double breadth) 
	{
		this.length=length;
		this.breadth=breadth;
	}
	double area() {
		double areaofRect = length*breadth;
		return areaofRect;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Rectangle r =new Rectangle(length, breadth);
		System.out.println("Enter the length: ");
		r.length=sc.nextDouble();
		System.out.println("Enter the breadth: ");
		r.breadth=sc.nextDouble();
		System.out.println("Area of rectangle is: "+ r.area());
	}

}
