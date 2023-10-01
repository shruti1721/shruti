package com.cdac.main;


interface I1
{
	void Method1();
	void Method2();
}
interface I2
{	
	void Method1();
	void Method2();
}
class Class5 implements I1,I2       //Multiple Inheritance
{
	public void Method1() {
		System.out.println("Method1");
	}
	public void Method2() {
		System.out.println("Method2");
	}
}

public class MultipleInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class5 c5=new Class5();
		c5.Method1();
		c5.Method2();
	}

}
