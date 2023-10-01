package AssignmentOne;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String wd = sc.next();
	
		for(int i = wd.length()-1; i>=0; i--) 
		{
			System.out.print(wd.charAt(i));
		}
	
	}
	
}