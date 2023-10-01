package AssignmentOne;

import java.util.Scanner;

public class Question21 {
	int s=0;
	double avg=0;
	int sum(int n, int [] arr) 
	{
		for(int i=0;i<n;i++) {
			s += arr[i];
		}
		return s;
	}
	double average(int n, int s1){
		avg = s1/n;
		return avg;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Question21 x = new Question21();
		System.out.println("Enter the number of values: ");
		int n = sc.nextInt();
		int [] arr= new int [n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter value: " + i);
			arr[i]=sc.nextInt();
		}
		int s1=x.sum(n, arr);
		System.out.println("The sum of five values is: "+ s1);
		System.out.println("The average of five values is: "+ x.average(n, s1));
		

	}

}
