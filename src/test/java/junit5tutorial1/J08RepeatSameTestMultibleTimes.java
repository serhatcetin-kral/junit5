package junit5tutorial1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class J08RepeatSameTestMultibleTimes {
     //@Test
	@RepeatedTest(5)
	void subString() {
		
		System.out.println("sub string method executed");
		assertEquals("java","java is the best language".substring(0,4));
	}
	
		
}
