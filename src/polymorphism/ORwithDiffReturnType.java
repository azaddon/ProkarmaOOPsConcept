package polymorphism;

public class ORwithDiffReturnType {

	public  Object m1(){
		System.out.println("Object Type return ");
		return null;
	}
}
	class ChORwithDiffReturnType extends ORwithDiffReturnType{
		public  String m1(){
			System.out.println("String type return");
			return null;
		}
	}
	class Test1{
	public static void main(String[] args) {
		ORwithDiffReturnType odt =new ORwithDiffReturnType();
		ORwithDiffReturnType  odt1= new ChORwithDiffReturnType();
		ChORwithDiffReturnType odt2 =new ChORwithDiffReturnType();
		odt.m1();
		odt1.m1();
		odt2.m1();

	}

}
