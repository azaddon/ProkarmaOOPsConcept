package polymorphism;

public class OverRidingWithStatic {
	public static void methodOne(){}
	//here static methodOne() method is a class level
	}
	class ChOverRidingWithStatic extends OverRidingWithStatic{
	public static void methodOne(){}
	}
	//here methodOne() method is a object level hence
	// we can't override methodOne() method
	class OverRidingWithStaticTest{
	public static void main(String[] args) {
		

	}

}
