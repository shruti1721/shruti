package AssignmentTwo;
import java.util.Scanner;

public class Employee {
	String name;
	String employee_id;
	static double salary;
	
	static Scanner sc=new Scanner(System.in);
	void GetInput() {
		System.out.println("What is your name: ");
		name=sc.nextLine();
		System.out.println("What is your employee id: ");
		employee_id=sc.nextLine();
		System.out.println("What is your current salary: ");
		salary=sc.nextDouble();
	}
	void display() {
		System.out.println("Your current salary after raise is: "+ salary);
	}
	void raise(double salary) {
		System.out.println("How much percent of raise you want to make in the current salary: ");
		double perc=sc.nextDouble();
		salary=salary+((salary*perc)/100);
		System.out.println("Your salary after the raise is: "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.GetInput();
		System.out.println("Do you want to raise your salary, Y/N: ");
		char choice = sc.next().charAt(0);
		if (choice =='Y' || choice =='y') {
			e1.raise(salary);	}
		else if (choice =='N'||choice =='n'){
			e1.display();
			System.out.println("Thankyou!");
		}
	}

}
