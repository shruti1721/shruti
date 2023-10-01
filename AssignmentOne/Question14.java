package AssignmentOne;
import java.util.Scanner;
public class Question14 {
	Scanner sc = new Scanner(System.in);
	void typecasting() {
		System.out.println("Enter value: ");
		double a = sc.nextDouble();
		int c = (int)a;
		System.out.println("Sum of two doubles is: "+ c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question14 x = new Question14();
		x.typecasting();
	}

}
