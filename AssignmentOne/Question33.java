package AssignmentOne;

import java.util.Scanner;

public class Question33 {
			
	void PrimeNum(int a, int z){
		for(int i=a;i<=z;i++) {
			int flag=1;
			if(i==1) {
				flag=0;
			}
			else if(i>2) {
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						flag=0;}
				}
			}	
			if(flag==1) {
				System.out.print(i+ " ");}
			}
	}

	public static void main(String[] args) {
		Question33 x = new Question33();
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the range to find the prime numbers inside it.");
		System.out.println("Enter the inner bound number: ");
		int a = sc.nextInt();
		System.out.println("Enter the outer bound number: ");
		int z = sc.nextInt();
		System.out.print("The prime numbers are: ");
		x.PrimeNum(a,z);

	}

}
