package AssignmentOne;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the int value:");
		int i = sc.nextInt();
		char x = (char) i;
		System.out.println("Enter the decimal value:");
		double d = sc.nextDouble();
		char y = (char) d;
		System.out.println("Enter the character:");
		char ch = sc.next().charAt(0);
		int z = ch;
		

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
