package AssignmentOne;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Question12 {
	Scanner sc=new Scanner(System.in);
	void CtoF() {
		System.out.println("Enter the temp in celsius: ");
		double C = sc.nextDouble();
		double F = 1.8*C +32;
		System.out.println("The temp in Fahrenheit is: " + F);		
	}	
	void FtoC() {
		System.out.println("Enter the temp in Fahrenheit: ");
		double F = sc.nextDouble();
		double C = (5*(F-32))/9;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("The temp in Celsius is: " + df.format(C));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Question12 x = new Question12();
		System.out.println("Enter the choice: ");
		System.out.println("1. Celsius to Fahrenheit: ");
		System.out.println("2. Fahrenheit to Celsius: ");
		int choice = sc.nextInt();
		switch(choice) 
		{
		case 1:
			x.CtoF();
			break;
		case 2:
			x.FtoC();
			break;
		}
	}
}
