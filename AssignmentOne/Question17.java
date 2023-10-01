package AssignmentOne;
import java.util.Scanner;
public class Question17 {
	Scanner sc = new Scanner(System.in);
	void vowel() {
		System.out.println("Enter any string: ");
		String s = sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
			{
				count+=1;
			}
		}
		System.out.println(count);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question17 x = new Question17();
		x.vowel();
	
	}
}


