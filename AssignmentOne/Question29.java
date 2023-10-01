package AssignmentOne;

import java.util.Scanner;

public class Question29 {
	
	static int fact(int a) {
		int fact =1;
		for(int i=1; i<=a;i++) {
			fact = i*fact;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial: ");
		int a = sc.nextInt();
		System.out.println("The factorial of the given number is: "+ fact(a));
	}

}
