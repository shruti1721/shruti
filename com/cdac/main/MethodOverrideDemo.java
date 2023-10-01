package com.cdac.main;

class A{
	
}
class B extends A{
	
}
class C extends B{
	
}


public class MethodOverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 =new C();          
		c1.show();         //Static binding or early binding which is done by compiler.
		
		//if ref variable and object are not belong to same class. then compiler will not decided, it is decided by JVM (Run time polymorphism,)
		A a1 = new C();   //Object Up-casting();//not decided by compiler.//JVM decides(it looks which class the object is)//Class C object it is.
		a1.show();		  //a1 is of class C object.
		c1.show();			//static
		a1=newB();        //This is Dynamic Method Dispatchment which is perform by JVM at run time.
		a1=new B();         
		a1.show();			//a1 is of class B object
		
		B b1 =new B();
		b1.show();  //show of B will be called
		a1=new B();    // a1 is the object of class B
	}

}
