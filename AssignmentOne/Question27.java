package AssignmentOne;

import java.util.Scanner;

public class Question27 {

	static void CheckOrder(int n, int [] arr) {
		int flag = n;
		for(int i=0;i<arr.length-1;i++) 
		{
			if(arr[i]<arr[i+1]) {
				flag +=1;}
			else if(arr[i]>arr[i+1]) {
				flag -= 1;}
			else {
				flag =0;}
		}
		if(flag >n) {
			System.out.println("Increasing Order");
		}
		else if(flag==1) {
			System.out.println("Decreasing Order");
		}
		else {
			System.out.println("Neither increasing or decreasing order");}}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the list: ");
		int n = sc.nextInt();
	    int [] arr = new int[n];
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("Enter value : "+ i);
	    	arr[i]=sc.nextInt();
	    }
		CheckOrder(n, arr);
	}
}
