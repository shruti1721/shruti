package AssignmentOne;
import java.util.Scanner;

public class Question1 {
	void rect(int ln,int br) {
		int area = ln*br;				
		System.out.println("Area of Rectangle is:" + area);		
	}
	void tri(int bs, int ht) {		
		double areaoftri = bs * ht * 0.5;				
		System.out.println("Area of triangle is:" + areaoftri);
		}	
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		System.out.println("1. Area of rectangle: ");
		System.out.println("2. Area of triangle: ");
		int choice= a.nextInt();				
		switch (choice)
		{				
			case 1:
				System.out.println("Enter the length of rectangle: ");
				int ln = a.nextInt();
				System.out.println("Enter the breadth of rectangle: ");
				int br = a.nextInt();
				Question1 b = new Question1();
				b.rect(ln,br);
				break;												
			case 2:
				Question1 c = new Question1();
				System.out.println("Enter the base of triangle: ");		
				int bs = a.nextInt();
				System.out.println("Enter the height of triangle: ");
				int ht = a.nextInt();
				c.tri(bs,ht);							
				break;								
			default:
				System.out.println("Invalid");
		}
		
	}

}
