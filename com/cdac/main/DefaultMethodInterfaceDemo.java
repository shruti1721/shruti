package com.cdac.main;
interface i2
{
	void method1();
	default void method2() {
		System.out.println("Default definition of method2 inside the interface");
	}
}
class Class3 implements i2
{
	public void method1() {
		System.out.println("Definition of method1 inside the class");
	}
}
class Class4 implements i2{
	public void method1() {
		System.out.println("Definition of method1 inside the class");
	}
	public void method2() {
		System.out.println("Definition of method2 inside the class");
	}
}
public class DefaultMethodInterfaceDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class3 c3 =new Class3();
		c3.method1();
		c3.method2();
		
		Class4 c4 =new Class4();
		c4.method1();
		c4.method2();               //overriding the above method2 defined in i2
	}
}
