package inheritance;

 class SingleInheritance {
	protected void m1(){
		System.out.println("Parent method");
	}
}
	
	class chSingleInheritance extends SingleInheritance{
		public void m2(int i){
			System.out.println("Child method");	
		}
	}
	
	class Test{
	public static void main(String[] args) {
		SingleInheritance sh =new SingleInheritance();
		sh.m1();
		//sh.m2();
		
		chSingleInheritance sh1 = new chSingleInheritance();
		sh.m1();
		sh1.m2(10);
		
		SingleInheritance sh2 =new chSingleInheritance();
		sh2.m1();
		//sh2.m2();
		
		//chSingleInheritance sh3 =new SingleInheritance();
		//sh3.m1();
		//sh3.m2();
		
//		chSingleInheritance sh3 = (chSingleInheritance) new SingleInheritance();
//		sh3.m1();
//		sh3.m2();
	}

}
