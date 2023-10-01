package AssignmentTwo;

import java.util.Scanner;

public class student {
	static String name;
	static int age;
	static double grade;
	
	student(String name,int age, double grade){
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	void studentDetails(){
		System.out.println("Name: "+name+ ", Age: "+age+", Grade: "+grade);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		student s = new student(name, age, grade);
		System.out.println("Enter the name: ");
		s.name=sc.nextLine();
		System.out.println("Enter the age: ");
		s.age=sc.nextInt();
		System.out.println("Enter the grade: ");
		s.grade=sc.nextDouble();
		s.studentDetails();
		
	}

}
