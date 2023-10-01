import AssignmentOne.StaticBlock;

public class StaticBlock {
	int a;
	StaticBlock()
	{
		a=90;
		System.out.println("Am Cons");
	}
	//Static Block
	static
	{
		System.out.println("Am Static Block");
	}
	//Object Initializer block
	{
		a=90;
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	StaticBlock sb=new StaticBlock();
	StaticBlock sb1=new StaticBlock();
		
	System.out.println("Value of a in sb: "+sb.a);
	System.out.println("Value of a in sb: "+sb1.a);
}
}

