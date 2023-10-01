package com.cdac.main;

class Class1
{
	public int a;
	public Class1()
	{
		
	}
	
	public Class1(int a)
	{
		this.a=a;
	}
	public void ShowData()
	{
		System.out.println("Value Of a:   "+a);
	}
}
class Class2
{
	int b;
	Class1 c=new Class1();  //Object of Class1 as Parameter of Class2
	public Class2(int b, Class1 c)
	{
		this.b=b;
		//c=new Class1(c.a); //Creating Object of Class1 inside the constructor of Class2
		this.c.a=c.a;
	}
	public void ShowData()	{
		c.ShowData();
		System.out.println("Value of b: "+b);
	}
}
public class AssociationTest {

	public static void main1(String[] args) {
		
		//Class1 c1=new Class1(20);  //Creating object of Class1 inside the Main
		
		//Class2 c2=new Class2(10,c1); //Passing Ref of c1 object to the Constructor of Class2
		
		Class2 c2=new Class2(10,new Class1(40));
		
		c2.ShowData(); //Calling ShowData Function Over the object of Class2
		
		c2=null;  //Nullifying the ref variable
		
		

	}

}
