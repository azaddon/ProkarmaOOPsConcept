package constructor;

public  class ConstAndInst {
	 static int count = 0;
	
	 ConstAndInst(){System.out.println("constructor with no arg");}
	{
		count ++ ;
		System.out.println("Instatnce block::"+ count);
	}
	  ConstAndInst(int i){
		  System.out.println("constructor with int arg");}//public,private,protected are permitted for constructor
	
	public static void main(String[] args){
		ConstAndInst  ci1 = new ConstAndInst();
		ConstAndInst  ci2 = new ConstAndInst(10);
		ConstAndInst  ci3 = new ConstAndInst();
		System.out.println(count);
	}
	
}
