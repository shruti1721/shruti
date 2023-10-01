package AssignmentOne;
import java.util.Scanner;

public class Question5 {

	void checkPrime(int num) {
		int m=num/2;
		int flag=0;
		
		if(num==0||num==1){System.out.println("its not a prime number.");}
		else {
			for(int i = 2; i <=m; i++) 
			{if (num%i==0) 
				{System.out.println("its not a prime number.");
				flag = 1;
				break;}
			}
			if(flag==0){System.out.println("its a prime number.");}
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Question5 x = new Question5();
		x.checkPrime(num);
		
			
		
	}
}
