package com.cdac.main;


class Class1 
{
	public static void Method1() {			//while defining method inside the class we have to use public keyword. i.e. interface only work with public methods. 
		System.out.println("I am class1 Method1");
	}
}
class Class2 extends Class1
{
	public void Method1() {			//while defining method inside the class we have to use public keyword. i.e. interface only work with public methods. 
		System.out.println("I am class2 Method1");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
     	Class1 c2=new Class2();
		c2.Method1();
		Class2 c2=new Class2();
		c2.Method1();
	}

}

