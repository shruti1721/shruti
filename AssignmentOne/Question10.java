package AssignmentOne;
import java.util.Scanner;
public class Question10 {
	Scanner sc=new Scanner(System.in);	
	void add(int a, int b) {
		int addition = a + b;
		System.out.println("the sum of two numbers is "+ addition);		
	}
	void sub(int a, int b) {
		int subtraction = a - b;
		System.out.println("the sum of two numbers is "+ subtraction);
	}
	void mul(int a, int b) {
		double multiply = a * b;
		System.out.println("the sum of two numbers is "+ multiply );		
	}
	void div(int a, int b) {
		double division = a / b;
		System.out.println("the sum of two numbers is "+ division);		
	}
	void cal() 
	{
		System.out.println("Enter 1st value: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd value: ");
		int b = sc.nextInt();
		System.out.println("Enter the choice: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int choice = sc.nextInt();	
		switch (choice) 
		{
			case 1:
				add(a,b);
				break;
			case 2:
				sub(a,b);
				break;
			case 3:
				mul(a,b);
				break;
			case 4:
				div(a,b);
				break;
			default:
				System.out.println("Invalid input");
				break;		
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question10 x=new Question10();
		x.cal();
		
	}

}
