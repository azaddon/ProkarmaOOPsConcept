package constructor;

public class StaticControlFlow {

	static int i =10;
	
	static{
		methodone();
		System.out.println("First Static BLock");
	}
	public static void main(String[] args) {
		
		methodone();
		System.out.println("Main Metod Block");

	}
	private static void methodone() {
	
		System.out.println(j);
		
	}
	static{
		System.out.println("Second Static BLock");
	}
	static int j=15;
}
