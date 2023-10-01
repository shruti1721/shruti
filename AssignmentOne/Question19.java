package AssignmentOne;

import java.util.Scanner;

public class Question19 {

	static int SumArray(int []arr, int n) 
	{	
		int sum=0;
		for(int i=0;i<n;i++) 
		{
			if (arr[i]%2==0) 
			{
				sum+=arr[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enther the size of the array");
		int n = sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter value " +i+ ": ");
			arr[i]=sc.nextInt();
		}
		System.out.println("The sum of all the even number inside the array is: "+ SumArray(arr, n));
	}

}
