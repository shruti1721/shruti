package Revision;

public class StaticVariable1 {
	
	String StudentName;
	int StudentId;
	static String CC="Vineeta";   
	//static String course;       //you can create a static variable without initializing.
	//static int marks;
	public StaticVariable1(String Sname, int id) 
	{
		this.StudentId=id;
		this.StudentName=Sname;
	}
	
	void display(){
		System.out.println("Welcome "+StudentName+ " with StudentId "+StudentId+
				" of DBDA Sep 2023 Batch, I am your course Coordinator "+ CC +".");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable1 v1 = new StaticVariable1("Darshan", 34);
		StaticVariable1 v2 = new StaticVariable1("Aniket", 14);
		v1.display();
		v2.display();
	}

}
