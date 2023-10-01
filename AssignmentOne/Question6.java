package AssignmentOne;
import java.util.Scanner;
public class Question6 {
	
	public static long fact(int num) 
	{	
		if(num==0||num==1){
			return 1;
		}
		else {
			return num * fact(num-1);
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Factorial of "+num+" is "+fact(num));
	}

}
