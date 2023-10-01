package com.cdac.main;

public class ArrayClassDemo {

	static void Display(int[] a1) {
		
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]+" ");
		}
	}
	public static void main(String[] args) {
		int [] a= {384,58,48,23,7};
		a[0]=300;
		ArrayClassDemo.Display(a);
	}
	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
	}

}
