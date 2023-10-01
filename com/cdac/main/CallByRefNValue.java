package com.cdac.main;



class Demo {
	int a;

	void GetData(int x)
	{
		a=x;
		System.out.println("Value of a: "+a);
		x=890;
		
	}
	void SetData(Demo d)
	{
		System.out.println("The accepted value of d2: "+a);
		d.a=300;	
	}
}

public class CallByRefNValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
			Demo d1=new Demo();
			//int y=30;   //Local Variable
			//d1.GetData(y);
			//System.out.println("The final value of y: "+y);
			Demo d2=new Demo();
			d2.a=90;
			d1.SetData(d2);
			System.out.println("The final value inside d2: "+d2);
				

	}
	

}
