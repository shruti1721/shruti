package com.cdac.main;


abstract class A1{
	int a;
	abstract public void Show();
	public void Get() {
		System.out.println("AM Show of A");
	}
}
class B1 extends A1{
	public void show() {
		System.out.println("AM Show of B");
	}
}

public class AbstractMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A1 a;
		A1 a1= new B1();  //abstract class is that class who's objects cannot be created
		//B1 b1=new B1();
		//b1.show();
		a1.Get();
//		a=new B1();
//		a.Show();
	}

}
