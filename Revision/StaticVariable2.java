package Revision;

public class StaticVariable2 {
	
	static int increment=10;
	public StaticVariable2() {
		increment++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Time when class loaded is: ");
		System.out.println("1. "+StaticVariable2.increment);
		StaticVariable2 v = new StaticVariable2();
		System.out.println("2. "+ v.increment);
		StaticVariable2 v1 = new StaticVariable2();
		System.out.println("3. "+ v1.increment);
		StaticVariable2 v2 = new StaticVariable2();
		System.out.println("4. "+ v2.increment);
		StaticVariable2 v3 = new StaticVariable2();
		System.out.println("5. "+ v3.increment);
	}	
}
