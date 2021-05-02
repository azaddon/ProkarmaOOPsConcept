package polymorphism;

public class OverLoading {

	public void m1(int i){
		System.out.println("Integer typr method");
	}
	public void m2(double d){
		System.out.println("Double type method");
	}
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.m1(12);
		ol.m2('3');
	}

}
