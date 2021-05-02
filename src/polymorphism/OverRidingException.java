package polymorphism;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OverRidingException {
	public void m1() throws Exception{
		System.out.println("parent method");
	}
}

class ChOverRidingException extends OverRidingException{
	public void m1()throws InterruptedException{
		System.out.println("Child method");
	}
}
	class OverRidingExceptionTest{
	public static void main(String[] args) throws Exception {
		OverRidingException oe1= new OverRidingException();
		OverRidingException oe2= new ChOverRidingException();
		ChOverRidingException oe3= new ChOverRidingException();
		
		
		oe1.m1();
		oe2.m1();
		oe3.m1();
		

	}

}
