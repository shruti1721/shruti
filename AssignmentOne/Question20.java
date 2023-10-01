package AssignmentOne;

import java.util.Scanner;

public class Question20 {
	
	int greatest(int a, int b, int c) {
		
		if(a>b) 
		{
			if(a>c) 
			{
				return a;
			}
			else {
				return c;
			}
		}
		else {
			if(b>c) 
			{
				return b;
			}
			else{
				return c;
			}
		}
		}
	public static void main(String[] args) {
		Question20 x = new Question20();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number: ");
		int c = sc.nextInt();
		System.out.println("The greatest of three variables are: "+ x.greatest(a,b,c));
	}

}
