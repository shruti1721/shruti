package com.cdac.main;

public class StringDemo {
	
	public static void main(String[] args)
	
	{
		StringBuffer str = new StringBuffer("Sandeep");
		StringBuffer str1 = new StringBuffer("Jaydeep");
		System.out.println(str +" "+ str1);
		}
	

	
	
	/*public static void main2(String[] args) 
	{
		String str="Shruti";
		String str1="Shruti";
		//String str1="Agrawal";					//Not Matched
		if (str.equals(str1))                   //Matched
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not Matched");
		}
		str1.concat("Agrawal");
		System.out.println(str1);               //immutable, output:Shruti
	}
    */
	
	/*public static void main1(String[] args) {
		// TODO Auto-generated method stub
		String str="Shruti";
		//String str1=new String("Shruti");          //Output:Not Matched
		String str1="Ag";                        //Output:Matched
		if (str==str1)
		{
			System.out.println("Matched");
		}
		else {
			System.out.println("Not Matched");
		}
	}*/

}
