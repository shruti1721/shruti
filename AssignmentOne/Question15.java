package AssignmentOne;
import java.util.Scanner;

public class Question15 {
	Scanner sc = new Scanner(System.in);
	void palindrome() {
		System.out.println("Enter the string: ");
		String a = sc.nextLine();
		int Flag = 0;
		for(int i=0;i<a.length();i++) 
		{
			if(a.charAt(i)==(a.charAt(a.length()-i-1)))
			{
				Flag = 1;
			}
			else 
			{
				Flag=0;
			}
		}
		if (Flag==0)
		{
			System.out.println("Its not a palindrome number");
		}
		else 
		{
			System.out.println("Its a palindrome number");
		}	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question15 x = new Question15();
		x.palindrome();
	}
}
