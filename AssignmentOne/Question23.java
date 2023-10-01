package AssignmentOne;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values: ");
		int n = sc.nextInt();
		for(int i=1; i<n+1;i++) {
			for(int j=0;j<=n;j++) {
				if(i!=j) {
					System.out.print(i-1);
				}
				else {
					System.out.print(i);
				}
				
			}
			System.out.println("");
		}
	}

}
