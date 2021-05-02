package abstraction;

abstract class AbstractClass {

	 abstract void  m1();
	 public abstract void m2();
	public  void m3(){
		System.out.println("Non Abstract Method");
	}
}

abstract class chClass extends AbstractClass{

	 public void m1(){
		 System.out.println("Implemented m1 Abstract Method");
	}
	 
}
class ch2Class extends AbstractClass{
	public void m2(){
		System.out.println("Implemented m2 Abstract Method");
	}

	@Override
	void m1() {
		
		System.out.println("Implemented m1 abstract method of subclass");
	}
}
class Abstracttest{
	public static void main(String[] args) {
		ch2Class chcl = new ch2Class();
		chcl.m1();
		chcl.m2();
		chcl.m3();
	
	}

}
