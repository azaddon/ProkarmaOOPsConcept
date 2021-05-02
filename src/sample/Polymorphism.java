package sample;

class Polymorphism {

	static int multiply(int a, int b){
		return a * b;
	}
	static double multiply(double a,double b){
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Polymorphism.multiply(6, 3));
		System.out.println(Polymorphism.multiply(5.5, 6.3)); 
	}
	
}
