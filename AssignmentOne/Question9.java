package AssignmentOne;
import java.util.Scanner;
public class Question9 {

	void areaofcircle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double r = sc.nextDouble();
		Double area = r*r*3.14;
		System.out.println("Area of circle is "+ area);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question9 x=new Question9();
		x.areaofcircle();
		
	}

}
