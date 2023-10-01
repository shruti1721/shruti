package AssignmentTwo;
import java.util.Scanner;
public class PersonC {
	String PersonName;
	int age;
	Scanner sc=new Scanner(System.in);
	PersonC(){
		System.out.println("Enter the name: ");
		this.PersonName=sc.nextLine();
		System.out.println("Enter the age: ");
		this.age=sc.nextInt();}
	void DisplayPerson(){	
		System.out.println("Name: "+PersonName);
		System.out.println("age: "+age);}}
class CarP {
	Scanner sc=new Scanner(System.in);
	String CarName;
	String model;
	CarP(){
		System.out.println("Enter the CarName: ");
		this.CarName=sc.nextLine();
		System.out.println("Enter the model: ");
		this.model=sc.nextLine();}
	void DisplayCar(){
		System.out.println("CarName: "+CarName);
		System.out.println("model: "+model);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonC p = new PersonC();
		p.DisplayPerson();
		CarP c = new CarP();
		c.DisplayCar();
	}
}
