package com.cdac.main;
import java.util.Scanner;
public class ArrayDemo {

	
	public static void main2(String[] args) {
		
		//Multi-Dimensional  Array
		Scanner sc= new Scanner(System.in);
		int [][] arr =new int[3][3];
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.println("Enter a element: ");
				arr[i][j]= sc.nextInt();
			}
			
		}
		
		System.out.println("Array is: ");
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}	
			System.out.println();
		}
		
	}		
	public static void main1(String[] args) {	
		
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[5];
		int arr1 []=new int [5];
		arr1[1]=56;
		arr[0]=10; //Array Initialization	
		arr[1]=20; //Array Initialization 
		arr[2]=30; 
		//value of arr[3] and arr[4] will be Initialized with 0 by JVM
		
		int[] arr3= {10,20,30,405,600};  //Declaration + Initialization
		
		for int i=0;i<4;i++ {
			System.out.println("Enter the value: ");
			arr[i]= sc.nextInt();
		}
		
		System.out.println("your values are: ");
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr3[i]);
			
		}
		System.out.println("length of array is: " +arr.length);
		
		
		
	}


	public static void main(String[] args) {
		
	
		int[][] arr=new int[3][];
		// Jagged Array
		arr[0]=new int[5];
		arr[1]=new int[3];
		arr[2]=new int[1];
		
		int[] arr2=new int[3];
		for(int i=0;i<3;i++) {
			System.out.println(arr[i]);
		}
	}
}