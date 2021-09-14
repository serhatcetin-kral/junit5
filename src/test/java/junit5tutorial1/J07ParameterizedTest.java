package junit5tutorial1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class J07ParameterizedTest {

	@Test
	void testWithoutParameterized() {
		
		assertTrue("ABCD".length()>0);		
		assertTrue("ABC".length()>0);
		assertTrue("A".length()>0);
		assertTrue("".length()>=0);
		assertTrue("abcdefg".length()>0);
	}
	
	
	@ParameterizedTest
	@ValueSource(strings= {"ABCD","ABC","A","","abcdefg"})
	void testWithParameterized(String str) {
		
		assertTrue(str.length()>=0);
		
		
	}
	
	@Test
	void toUpperCaseTest1() {
		String str1="Ali Can";
		String str2="ali can";
		String str3="ali";
		String str4="123";
		String str5="A";
		String str6="";
		assertEquals("ALI CAN",str1.toUpperCase());
		assertEquals("ALI CAN",str2.toUpperCase());
		assertEquals("ALI",str3.toUpperCase());
		assertEquals("123",str4.toUpperCase());
		assertEquals("A",str5.toUpperCase());
		assertEquals("",str6.toUpperCase());

	
	}

	@ParameterizedTest
	@CsvSource(value= {"ALI CAN,Ali Can","ALI CAN,ali can","ALI,ali","123,123","'',''"})
	void toUpperCaseTest2(String str1,String str2) {
		
		
		assertEquals(str1,str2.toUpperCase());
		
		
	}
	
	// check if string contains a
	// "ali","joe","tom"
	
	
	@ParameterizedTest
	@CsvSource(value= {"true,ali,a","false,joe,a","false,tom,a"})
	void testContain(boolean rs,String str1,String str2) {
		
		assertEquals(rs,str1.contains(str2));
		
		
		
		
	}
	
	
	
}
