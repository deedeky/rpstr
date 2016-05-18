import static org.junit.Assert.*;

import org.junit.Test;


public class GeekstoneSecondTest {

	@Test
	public void substractShouldBeZero() {
	
		GeekstoneSecond tester = new GeekstoneSecond();
		
		// assert statements`
		assertEquals("10 - 10 must be 0", 0, tester.substract(10, 10));
		assertEquals("0 - 0 must be 0", 0, tester.substract(0, 0));
	}

}
