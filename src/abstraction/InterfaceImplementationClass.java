package abstraction;

public final class InterfaceImplementationClass implements InterfaceClass {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	public void m1(){
		System.out.println("implementing m1 interface method");
	}
	public void m2(){
		System.out.println("implementing m2 interface method");
	}
}
final class InterfaceImplementationClassTest{
public static void main(String[] args) {
// TODO Auto-generated method stub
	InterfaceImplementationClass IIC = new InterfaceImplementationClass();
	IIC.m1();
	IIC.m2();
}

}
