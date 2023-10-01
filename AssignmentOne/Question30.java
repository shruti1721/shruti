package AssignmentOne;

import java.util.Scanner;

public class Question30 {

	static void LeapYear(int year) {
		if(year%4==0 && year%100!=0) {
			System.out.println("Its a leap year");}
		else if(year%400==0){
			System.out.println("Its a leap year");}
		else {
			System.out.println("Its not a leap year");}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		LeapYear(year);
	}

}
