package junit5tutorial1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class J04BeforeAll_AfterAll {

	@BeforeAll
	static void beforeAll() {
		
		System.out.println("before all executed");
		
	}
	
	
	@AfterAll
	static void afterAll() {
		System.out.println("after all executed");
		
	}
	
	@Test
	void testArrays(TestInfo info) {
		System.out.println(info.getDisplayName()+" method executed");
		
		String str="java junit5 better than junit4";
		String actualArr[]=str.split(" ");
		String expected[]= {"java","junit5","better","than","junit4"};
		assertTrue(Arrays.equals(actualArr, expected));
	}
	
	
	@Test
	void testFindMin(TestInfo info) {
		
		System.out.println(info.getDisplayName()+" method executed");
		
//		assertTrue(Math.min(12.3, 13.3)==12.3);
//		assertFalse(Math.min(12.3, 13.5)!=12.3);
		
		assertEquals(12.3,Math.min(12.3, 13.5));
	}
	
	
	
	

}
