package junit5tutorial1;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.Assert.assertEquals;
public class J10GroupingTest {

	// use MultiblyEact method by use none-zero use by zero
	
	@ParameterizedTest
	@CsvSource(value= {"-12,-4,3","-12,4,-3","12,4,3","12,-4,-3"})
	void multiblyWithNoneZero(int rs,int x,int y) {
		
		assertEquals(rs,Math.multiplyExact(x, y));
		
		
	}
	
	
	
	
	@Nested
	class operationWithZero{
		
		@ParameterizedTest
		@CsvSource(value= {"0,4,0","0,8,0","0,0,4"})
		void multiblyWithZero(int rs,int x,int y) {
			
			assertEquals(rs,Math.multiplyExact(x, y));
			
		}
		
		
		@ParameterizedTest
		@CsvSource(value= {"0,-4,0","0,-8,0","0,0,-4"})
		void multiblyWithZero2() {
			
			
		}
		
		
	}
	
	
	
	
}
