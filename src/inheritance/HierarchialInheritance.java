package inheritance;

public class HierarchialInheritance {
	public void m1(){
		
	}
}

class ch1HierarchialInheritance extends HierarchialInheritance{
	public void m2(){
		
	}
}

class ch2HierarchialInheritance extends HierarchialInheritance{
	public void m3(){
		
	}
}

class ch3HierarchialInheritance extends HierarchialInheritance{
	public void m4(){
		
	}
}

class HierarchialInheritanceTest{
	public static void main(String[] args) {
		HierarchialInheritance h1 =new HierarchialInheritance();
		h1.m1();
		
		HierarchialInheritance h2 = new ch1HierarchialInheritance();
		h2.m1();
		
		HierarchialInheritance h3 = new ch2HierarchialInheritance();
		h3.m1();
		
		HierarchialInheritance h4 = new ch3HierarchialInheritance();
		h4.m1();
		
		ch1HierarchialInheritance h5 = new ch1HierarchialInheritance();
		h5.m1();
		h5.m2();
		
		ch2HierarchialInheritance h7 = new ch2HierarchialInheritance();
		h7.m1();
		h7.m3();
		
		ch3HierarchialInheritance h8 = new ch3HierarchialInheritance();
		h8.m1();
		h8.m4();
		}
}
