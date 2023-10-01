package com.cdac.main;


class P{
	public void method1() {
		System.out.println("method1");
}
}
class Q extends P{
	public void method2(){
		System.out.println("method1");
	}
}
public class InstanceOfDemo {
	
//	public static void DoDownCast(P p1) {
//		if(p instanceof P) {
//		Q q=(Q)p;
//		System.out.println("DownCasting Performed");
//	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//P p1=new Q();
		P p1=new Q();// p1 is the ref variable and has object of Q class//upcasting
		Q q1=(Q)p1;
		//InstanceOfDemo.DoDownCast(p1);
		//Q q1=(Q)new P(); error, it can be resolved through downcasting 
		
		if(p1 instanceof Q){
			System.out.println("yes");
		}
		else {
			System.out.println("not");
		}

	}

}
