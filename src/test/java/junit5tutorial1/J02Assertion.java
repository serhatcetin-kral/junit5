package junit5tutorial1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class J02Assertion {

	@Test
	void testFindMin() {
		
		
		
//		assertTrue(Math.min(12.3, 13.3)==12.3);
//		assertFalse(Math.min(12.3, 13.5)!=12.3);
		
		assertEquals(12.3,Math.min(12.3, 13.5));
	}

	@Test
	void testArrays() {
		
		String str="java junit5 better than junit4";
		String actualArr[]=str.split(" ");
		String expected[]= {"java","junit5","better","than","junit4"};
		assertTrue(Arrays.equals(actualArr, expected));
	}
	
	
}
