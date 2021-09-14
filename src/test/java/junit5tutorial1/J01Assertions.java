package junit5tutorial1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class J01Assertions {

//	@Test
//	void test() {
//		//fail("Not yet implemented maybe after");
//	}

	
	// access modifiers are public and protected for junit5
	// assertEquals method
	@Test
	void testLength1() {
		int actualResult="ABCD".length();
		int expectedResult=4;
		
		assertEquals(expectedResult, actualResult);		
		
	}
	
	
	@Test
	void testLength2() {
		int actualResult="ABCD".length();
		int expectedResult=4;
		
		assertEquals(expectedResult, actualResult, "actual one and expected one different");		
		
	}
	
	//assertTrue
	
	@Test
	void testLength3() {
		int actualResult="ABCD".length();
		int expectedResult=4;
		
			assertTrue(expectedResult==actualResult);	
		
	}
	
	@Test
	void testLength4() {
		int actualResult="ABCD".length();
		int expectedResult=4;
		
			assertTrue(expectedResult==actualResult,"expected one and actual one they are not same");	
		
	}
	
	
	//assertFalse
	
	@Test
	void testLength5() {
		int actualResult="ABCD".length();
		int expectedResult=4;
		
			assertFalse(expectedResult==actualResult);	
		
	}
	
	@Test
	void testLength6() {
		int actualResult="ABCD".length();
		int expectedResult=4;
		
			assertFalse(expectedResult!=actualResult);	
		
	}
	
	@Test
	void testLength7() {
		int actualResult="ABCD".length();
		int expectedResult=4;
		
			assertFalse(expectedResult==actualResult,"actual one and expected one length are same");	
		
	}
	
	@Test
	void containsTest() {
		
		assertEquals(false,"ali can".contains("jk"));
		
		
	}
	
	
	
	
}
