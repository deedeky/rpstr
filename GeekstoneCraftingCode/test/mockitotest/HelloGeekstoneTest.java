package mockitotest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import mockitoexample.HelloGeekstone;

import org.junit.Test;

public class HelloGeekstoneTest {
	@Test
	public void geekShouldGreet() {
		HelloGeekstone geek = mock(HelloGeekstone.class);
		when(geek.greet()).thenReturn("Hello Geek!");
		System.out.println("Geek greets: " + geek.greet());
		assertEquals(geek.greet(), "Hello Geek!");
	}

}
