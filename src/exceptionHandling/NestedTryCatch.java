package exceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args){
	try{
		 System.out.println("1");
		 System.out.println("2");
		 System.out.println("3");
		 try{
			 System.out.println("4");
			 System.out.println("5");
			 System.out.println("6");
			 
		 }
		 catch(ArithmeticException e){
			 System.out.println(2/0);
		 }
		 finally{
			 System.out.println("Inner Finally");
		 }
		 System.out.println("7");
	}
	catch(ArithmeticException x){
		System.out.println("Arithmetic caught");
	}
	finally{
		 System.out.println("Outer Finally");
	}
	 System.out.println("9");
	}
}
