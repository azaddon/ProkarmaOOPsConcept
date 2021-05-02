package polymorphism;

public class DeclarePrivate {
	private void m1(){
		System.out.println("Parent private method");
	}
}
	 class ChDeclarePrivate extends DeclarePrivate{
		private void m1(){
			System.out.println("child private method");
		}
	}
	class DeclarePrivateTest{
	public static void main(String[] args) {
		DeclarePrivate dp =new DeclarePrivate();
		DeclarePrivate dp1 = new ChDeclarePrivate();
		ChDeclarePrivate dp2 = new ChDeclarePrivate();
		
		

	}

}
