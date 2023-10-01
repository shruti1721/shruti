package AssignmentTwo;
import java.util.Scanner;
public class Person {
	String name;
	int age;
	String gender;
	Scanner sc= new Scanner(System.in);	
	void PersonIntro(String name, int age, String gender)
	{	
		System.out.println("Enter the name: ");
		this.name = sc.next();
		System.out.println("Enter the age: ");
		this.age = sc.nextInt();
		System.out.println("choose a gender: ");
		System.out.println("1. Male ");
		System.out.println("2. Female");
		System.out.println("3. LGBTQ+");
		int choice= sc.nextInt();
		switch(choice) {
		case 1:
			this.gender = "Male";
			System.out.println("male");
			break;
		case 2:
			this.gender = "Female";
			System.out.println("female");
			break;
		case 3:
			this.gender = "LQBTQ+";
			System.out.println("LGBTQ+");
			break;}	}
	
	void PersonIntro(String name)
	{	
		System.out.println("Enter the name: ");
		this.name = sc.next();
	}
	void ShowPerson(){
		System.out.println("My name is: "+name+"."+" I am "+age+" years old."+" I am a: "+gender+".");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.PersonIntro(p.name, p.age, p.gender);
		p.ShowPerson();}}
