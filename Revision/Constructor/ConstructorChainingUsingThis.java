package Revision.Constructor;

public class ConstructorChainingUsingThis {
	int x;
	int y;
	ConstructorChainingUsingThis(){
		this(5);
	}
	ConstructorChainingUsingThis(int x){
		this(5,7);
	}
	ConstructorChainingUsingThis(int x, int y){
		System.out.println(x*y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChainingUsingThis c = new ConstructorChainingUsingThis();
	}

}
