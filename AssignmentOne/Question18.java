package AssignmentOne;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Question18 
{
	static double AreaOfCircle(double r) {	
		double area = Math.PI * r * r;
		return area;
	}
	static double AreaOfSphere(double r) 
		{
		double area = 4 * Math.PI * r * r;
		return area;
		}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.println("1. Calculate area of circle");
		System.out.println("2. Calculate area of sphere");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		switch(choice) 	{
		case 1:
			System.out.println("Enter the radius of circle: ");
			r=sc.nextDouble();
			DecimalFormat df = new DecimalFormat("#.##");
			System.out.println("The area of circle is: " + df.format(AreaOfCircle(r)));
			break;		
		case 2:
			System.out.println("Enter the radius of Sphere:  ");
			r=sc.nextDouble();
			DecimalFormat df1 = new DecimalFormat("#.##");
			System.out.println("The area of sphere is: " + df1.format(AreaOfSphere(r)));
			break;			
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
		
		
}
