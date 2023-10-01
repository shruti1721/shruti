package AssignmentOne;
import java.util.Scanner;
public class Question11 {
	
	void areaRect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int l = sc.nextInt();
		System.out.println("Enter the breadth: ");
		int b = sc.nextInt();
		int area = l*b;
		System.out.println("Area of Rectangle is: "+ area);
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question11 x = new Question11();
		x.areaRect();
	}

}
