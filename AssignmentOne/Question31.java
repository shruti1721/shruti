package AssignmentOne;

import java.util.Scanner;

public class Question31 {

	void fib(int n) {
		int [] arr = new int[n];
		int i = 0;
		for(i=0; i<n; i++) {
			if(i==0||i==1) {
				arr[i]=i;}
			else if(i>=2) {
				arr[i] = arr[i-2] + arr[i-1] ;
			}
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args) {
		Question31 x = new Question31();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for fibonacci series: ");
		int n = sc.nextInt();
		System.out.print("The fibonacci series are: ");
		x.fib(n);
	}

}
