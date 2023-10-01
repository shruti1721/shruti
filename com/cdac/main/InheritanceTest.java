package com.cdac.main;
class Vehicle
{	
	
	int a; //initialize by base class constructor
	int d;
	static int b;
	private int pri;
	protected int pro;
	public  Vehicle() {
		System.out.println("I am fond of Vehicle");
	}
	void Run() {
		System.out.println("Vehicle is running.");
	}	
}
class Car extends Vehicle{ 	
	int c;      //initialize by car class/sub class constructor
	public Car() {
		super(); //it is used to call base class constructor into definition of child class constructor.
		System.out.println("I am fond of car");
	}
	void CarRun() {
		System.out.println("Car is running");
	}

}

class BMW extends Car {
	int p;
	public BMW()
	{
	System.out.println("BMW is running");
	}
}
public class InheritanceTest {
	public static void main(String[] args) {
		BMW x = new BMW();
		//x.pri=10;										//not okay, all private data member(dm) or member(mf) function does not get inherited.
		x.pro=10;										//all protected and public, dm, mf gets inherited.
		System.out.println(x.pro);                      //output: 10 
	}
	public static void main3(String[] args) {
		BMW x = new BMW();								//Multilevel Inheritance.
	}
	
	public static void main2(String[] args) {
		Car c =new Car();
		//who initialize instance variable of the class is the constructor. therefore in output 1st it called vehicle and then car.
		//1st the constructor of parent class is called to fetch the instance variable and create object of it. then child class will call the constructor of the object of its variable.
	}
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle v1 = new Vehicle();
		//v1.Run();
		Car c1 = new Car();
		c1.CarRun();							//here C1 is calling the property of its own class.	
		c1.Run();								//Inherited Method(c1 is calling property of parent class)
		//c1.b();                                  //will give error as b is static
		
		}

}
