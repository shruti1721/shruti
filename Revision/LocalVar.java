package Revision;

public class LocalVar {
	
	void display() {
		//static int id=100;  //can't make a local variable static
		//private int id=100; //can't assign access specifier to local variable
		//int id; //you need to initialize the variable
		int id=100;
		System.out.println("Value for id is: "+id);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVar v = new LocalVar();
		v.display();
		//System.out.println(id); //can't give local variable directly in main
	}
}
