package com.cdac.main;

public class ConsChain {
	
	
	ConsChain(){
		
		System.out.println("no param");
	}
	
	ConsChain(int x){
		
		this();
		System.out.println("one param");
	}
	
	ConsChain(int x, int y){
		
		
		this (20);
		System.out.println("two param");
	}
		

	
	public static void main(String[] args) 
	{
		
		ConsChain c =new ConsChain(10,20);
	
	}


}
