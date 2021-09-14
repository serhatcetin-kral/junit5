package junit5tutorial1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class J05TestingException {

	@Test
	void testException() {
		String str=null;
		//str.length();   // NullPointerException
		
		
		assertThrows(NumberFormatException.class,()->{System.out.println("test exception execute");
		                                 str.length();    });
		
		
	}
	
	
	
	/*
	 * Integer.parseInt("ali can")
	 * NumberFormatException 
	 */
	
	
	@Test
	void testException2() {
		String str="ali can";
		
		assertThrows(NumberFormatException.class,()->{Integer.parseInt(str);});
		
		
		
	}
	
	
	
	// create test divide by 0 ArithmeticException
	
	@Test
	void testException3() {
		int num1=123;
		int num2=0;
		
		
		assertThrows(ArithmeticException.class,()->divide(num1,num2));
		
		
	}
	
	
	private int divide(int num1,int num2) {
		
		return num1/num2;
		
		
	}
	
	
	
	
	// negative number for age IllgalArgumentException
	//create method
	
	
	@Test
	void testException4() {
		int age=-10;
		assertThrows(IllegalArgumentException.class,()->checkAge(age));
		
	}
	
	
	
	private void checkAge(int num) {
		if(num<0) {
			throw new IllegalArgumentException();
		}
		else {
			System.out.println(num);
		}
		
	}
	
	
	
	

}
