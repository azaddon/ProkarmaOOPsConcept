package constructor;

 abstract class AbstractClassConstructor {
	
	AbstractClassConstructor(){
		
		System.out.println("parent constructor");
	}
 }
	class ChAbstractClassConstructor extends AbstractClassConstructor{

		ChAbstractClassConstructor(double d){
	
			System.out.println("child constructor");
		}
	}
	
	class AbstractClassConstructorTest{
		
		public static void main(String[] args) {
			ChAbstractClassConstructor ACC = new ChAbstractClassConstructor(10.4);
			System.out.println(ACC);
		}
	}

