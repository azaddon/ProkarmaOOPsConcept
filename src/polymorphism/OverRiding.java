package polymorphism;

public class OverRiding {
 
	public void property(){
		 System.out.println("cash+land+gold");
		 }
		 public void marry() {
		 System.out.println("subbalakshmi"); //overridden method
		
		 }
		 }
		 class Child extends OverRiding{ //overriding
		 public void marry() {
		 System.out.println("3sha/4me/9tara/anushka");
		//overriding method
		 }
		 }
		 class Test {
		 public static void main(String[] args){
			 OverRiding p=new OverRiding();
		 p.marry();//subbalakshmi(parent method)
		 Child c=new Child();
		 c.marry();//Trisha/nayanatara/anushka(child method)
		 OverRiding p1=new Child();
		 p1.marry();//Trisha/nayanatara/anushka(child method)
		 
		 }

}
