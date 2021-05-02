package inheritance;

public class MultilevelInheritance {
	public void m1(){
		System.out.println("MultilevelInheritance method");
	}
}

class ch1MultilevelInheritance extends MultilevelInheritance{
	public void m2(){
		System.out.println("ch1MultilevelInheritance method");
	}
}

class ch2MultilevelInheritance extends ch1MultilevelInheritance{
	public void m3(){
		System.out.println("ch2MultilevelInheritance method");
		System.out.println();
	}
}

class MultilevelInheritanceTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritance m1 =new MultilevelInheritance();
		m1.m1();
		//m1.m2();
		//m1.m3();
		
		MultilevelInheritance m2 =new ch1MultilevelInheritance();
		m2.m1();
		//m2.m2();
		//m2.m3();
		
		MultilevelInheritance m3 =new ch2MultilevelInheritance();
		m3.m1();
		//m3.m2();
		//m3.m3();
		
		ch1MultilevelInheritance m4 =new ch1MultilevelInheritance();
		m4.m1();
		m4.m2();
		//m4.m3();
		
		ch1MultilevelInheritance m5 =new ch2MultilevelInheritance();
		m5.m1();
		m5.m2();
		//m5.m3();
		
		ch2MultilevelInheritance m6 =new ch2MultilevelInheritance();
		m6.m1();
		m6.m2();
		m6.m3();
		
	}

}
