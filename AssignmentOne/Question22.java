package AssignmentOne;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		for(int i=1; i<=n;i++) {
			int c = i*i*i;
			System.out.println("The cube of "+i+" is: " +c);
		}
		
	}

}
