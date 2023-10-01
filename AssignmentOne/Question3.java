package AssignmentOne;
import java.text.*;
import java.util.Scanner;

public class Question3 {
	Scanner sc = new Scanner(System.in);
	
	void add() {
		System.out.println("1. Integer subtraction: ");
		System.out.println("2. Decimal subtraction: ");
		System.out.println("Enter the choice: ");
		int Choice = sc.nextInt();
		switch (Choice) {
			case 1:
				System.out.println("Enter 1st value: ");
				int i1 = sc.nextInt();
				System.out.println("Enter 2nd value: ");
				int i2 = sc.nextInt();
				int sum = i1 + i2;
				System.out.println("The sum of the two integers are: "+ sum);				 
				break;
				
			case 2:
				System.out.println("Enter 1st value: ");
				double d1 = sc.nextDouble();
				System.out.println("Enter 2nd value: ");
				double d2 = sc.nextDouble();
				double sums = d1 + d2;
				System.out.println("The sum of the two doubles are: "+ sums);								
				break;
		}
		
	}
	
	void sub() {
		System.out.println("1. Integer subtraction: ");
		System.out.println("2. Decimal subtraction: ");
		System.out.println("Enter the choice: ");
		int Choice = sc.nextInt();
		switch (Choice) {
			case 1:
				System.out.println("Enter 1st value: ");
				int i1 = sc.nextInt();
				System.out.println("Enter 2nd value: ");
				int i2 = sc.nextInt();
				int subs = i1 - i2;
				System.out.println("The sum of the two integers are: "+ subs);
				break;
				
			case 2:
				System.out.println("Enter 1st value: ");
				double d1 = sc.nextDouble();
				System.out.println("Enter 2nd value: ");
				double d2 = sc.nextDouble();
				double substract = d1 - d2;
				System.out.println("The sum of the two doubles are: "+ substract);		
				
				break;
		}
		
		
	}
	
	void mul() {
		System.out.println("1. Integer multiplication: ");
		System.out.println("2. Decimal Multiplication: ");
		System.out.println("Enter the choice: ");
		int Choice = sc.nextInt();
		switch (Choice) {
			case 1:
				System.out.println("Enter 1st value: ");
				int i1 = sc.nextInt();
				System.out.println("Enter 2nd value: ");
				int i2 = sc.nextInt();
				int muls = i1 * i2;
				System.out.println("The sum of the two integers are: "+ muls);
				break;
				
			case 2:
				System.out.println("Enter 1st value: ");
				double d1 = sc.nextDouble();
				System.out.println("Enter 2nd value: ");
				double d2 = sc.nextDouble();
				double multi = d1 * d2;
				System.out.println("The sum of the two doubles are: "+ multi);	
				break;
		}
		
	}
	void div() {
		System.out.println("Enter the choice: ");
		int Choice = sc.nextInt();
		switch (Choice) {
			case 1:
				System.out.println("Enter 1st value: ");
				int i1 = sc.nextInt();
				System.out.println("Enter 2nd value: ");
				int i2 = sc.nextInt();
				int divs = i1/i2;
				System.out.println("The sum of the two integers are: "+ divs);
				break;
				
			case 2:
				System.out.println("Enter 1st value: ");
				double d1 = sc.nextDouble();
				System.out.println("Enter 2nd value: ");
				double d2 = sc.nextDouble();
				double divi = d1/d2;
				DecimalFormat df = new DecimalFormat("#.##");
				System.out.println("The sum of the two doubles are: "+ df.format(divi));
				break;
		}
						
	}
	void concat() {
		System.out.println("Enter 1st word: ");
		String s1 = sc.next();
		System.out.println("Enter 2nd word: ");
		String s2 = sc.next();
		String sum = s1 + " " + s2;
		System.out.println("The sum of the two strings are: "+ sum); 		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		Question3 q = new Question3();		
		System.out.println("1. Addition: ");
		System.out.println("2. Subtraction: ");
		System.out.println("3. Multiplication: ");
		System.out.println("4. Division: ");
		System.out.println("5. Concatenation: ");			
		System.out.println("Enter your Choice: ");
		int choice = sc.nextInt();
		switch (choice)
		{
		case 1:
			q.add();
			break;
		case 2:
			q.sub();
			break;
		case 3:
			q.mul();
			break;
		case 4:
			q.div();
			break;
		case 5:
			q.concat();
			break;
		default:
			System.out.println("Invalid choice.");
			break;
		}
		
	}
}
