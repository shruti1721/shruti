package AssignmentOne;

import java.util.Scanner;

public class Question32 {
	
	void CheckVowelConsonent(char c) {
		if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
		{
			System.out.println("Its a vowel");
		}
		else {
			System.out.println("Its a consonent");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Question32 x=new Question32();
		System.out.println("Enter the character: ");
		char c = sc.next().charAt(0);
		x.CheckVowelConsonent(c);
		
	}

}
