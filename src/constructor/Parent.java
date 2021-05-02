package constructor;

import java.io.IOException;

public class Parent {
	
	Parent(int i)throws Exception{
		
	}	
	class child extends Parent{
		
		child(int i) throws Exception{
			super(10); //without argument it will give CE
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
