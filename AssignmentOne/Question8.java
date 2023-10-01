package AssignmentOne;
import java.util.Scanner;

public class Question8 {
	Scanner sc= new Scanner(System.in);
	
	void avg() {			
		System.out.println("Enter the 1st value");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd value");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd value");
		int c=sc.nextInt();
		double avg=(a+b+c)/3;
		System.out.println("The average of 3 numbers is: "+avg);		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Question8 x = new Question8();
		x.avg();
	}
}

