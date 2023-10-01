package AssignmentOne;
import java.util.Scanner;

public class Question7 {
	// TODO Auto-generated method stub
	Scanner sc1= new Scanner(System.in);
	
	void FtoI() {
		System.out.println("Enter the float nummber: ");
		float a = sc1.nextFloat();
		int b = Math.round(a);
		System.out.println("the int value is "+b);
	}
	void ItoF() {
		System.out.println("Enter the int number: ");
		int a = sc1.nextInt();
		float b = (float)a;
		System.out.println("the float value is "+b);
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Question7 x = new Question7();
		System.out.println("Enter the choice: ");
		System.out.println("1. int to float");
		System.out.println("2. float to int");
		int choice = sc.nextInt();
		switch(choice) 
		{
			case 1:
				x.ItoF();
				break;
			case 2:
				x.FtoI();
				break;
		}
	}
}
