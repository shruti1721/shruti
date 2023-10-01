package AssignmentOne;

import java.util.Scanner;

public class Question26 {
	
	static void CheckEqual(int [] arr){
		int count = 0;
		for(int i=0;i<2;i++) {
			if(arr[i]==arr[i+1]){
				count+= 1;}}
		if(count==2) {
			System.out.println("All numbers are equal");
		}
		else if(count==1) {
			System.out.println("Neither all are equal or different");}
		
		else {
			System.out.println("All numbers are different");}
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [3];
		for(int i=0;i<3;i++) {
			System.out.println("Enter value " + i);
			arr[i] = sc.nextInt();
		}
		CheckEqual(arr);
	}

}
