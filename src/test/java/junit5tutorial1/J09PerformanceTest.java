package junit5tutorial1;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class J09PerformanceTest {

	
	
	@Test
	void printPerformance() {
		
		assertTimeout(Duration.ofSeconds(3),()->IntStream.rangeClosed(1, 100000).forEach(System.out::println));
		
		
		
	}
	
	
	
}
