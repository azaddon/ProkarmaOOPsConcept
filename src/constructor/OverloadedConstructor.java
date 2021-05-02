package constructor;

public class OverloadedConstructor {
	
	OverloadedConstructor(){
		System.out.println("no arg constructor");
	}
	
	OverloadedConstructor(int i){
		
		System.out.println("int arg constructor");
	}
	
	OverloadedConstructor(double d){
		
		System.out.println("double arg constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadedConstructor t1=new OverloadedConstructor(); //no-argument constructor/int-argument
		//constructor/double-argument constructor
		OverloadedConstructor t2=new OverloadedConstructor(10);
		//int-argument constructor/double-argument constructor
		OverloadedConstructor t3=new OverloadedConstructor(10.5);//double-argument constructor
	}

}
