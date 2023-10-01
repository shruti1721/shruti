package AssignmentOne;
import java.util.Scanner;
public class Question13 {
	Scanner sc = new Scanner(System.in);
	void sum() {
		System.out.println("Enter the 1st value: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd value: ");
		int b = sc.nextInt();
		double c = a + b;
		System.out.println("The sum of two integers is: "+ c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question13 x = new Question13();
		x.sum();

	}

}
