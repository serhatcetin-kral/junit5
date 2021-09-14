package junit5tutorial1;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class J06DisplayName {

	
	@Test
	@DisplayName(" this test for the learn displayName annotation ")
	void testException() {
		
		String str="ALI CAN";
		
		assertThrows(NumberFormatException.class,
				
				()->{
					Integer.parseInt(str);
				}
				
				
				);

		}

	
	
	
	
	
	
	
	
}
