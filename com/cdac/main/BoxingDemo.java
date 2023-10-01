package com.cdac.main;

public class BoxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;  //primitive value.
		
		Integer a1;  //Object of Integer Wrapper class.
		
		//Auto-Boxing
		a1=a;  //Assigning primitive data value to wrapper.
		
		Integer a2=new Integer(30);  //a2 is wrapper class object which hold value 30 as object.
		
		int b;  //primitive variable which can hold primitive.
		
		
		//Auto-Unboxing
		b=a2; //a2 object is being assigned to primitive variable b.
		
		
		Byte num1=123;  //num1 is object of Byte class, which holding value 123 as an object. 
		
		//Integer a3=num1; //class=Integer and Object=num1;
		
		Integer a3;
		
		a3=num1.intValue();   //intValue() method convert Byte object to 
		
		
		//Process of conversion:
		//1. byte object to int primitive type
		//2. int primitive type to integer object
		//3. assignment of that object to integer variable
		
		//num1=a3; //It is not accepting because value of a3 is type integer wrapper class object and num1 is byte class object. you have convert integer value to byte object.
		num1=a3.byteValue(); //Integer object is un-boxed and auto boxed to byte object
		//Process:
		//1. integer type -> 2. primitive byte-> 3. wrapper
	}

}
