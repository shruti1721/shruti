package AssignmentOne;

import java.util.Scanner;

public class Question25 {
	static String val;
	static String CheckNum(int a) {
		if(a<0) {
			val = "Negative";
		}
		else if(a>0) {
			val = "Positive";
		}
		else {
			val = "zero";
		}
		return val;
	}

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number: ");
			int a = sc.nextInt();
			System.out.println("The given number is: "+CheckNum(a));

	}

}
