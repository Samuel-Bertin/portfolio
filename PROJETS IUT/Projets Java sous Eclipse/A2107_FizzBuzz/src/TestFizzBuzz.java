import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzz {
	
	FizzBuzz f;

	@Before
	public void setUp() throws Exception {
		f = new FizzBuzz();
	}

	@After
	public void tearDown() throws Exception {
		f = null;
	}
	
	@Test
	public void testSize() {
		assertEquals(f.getTab().length, 100);
	}
	
	@Test
	public void testMultiple3() {
		assertEquals(f.getTab()[2],"Fizz");
	}
	
	@Test
	public void testMultiple5() {
		assertEquals(f.getTab()[4],"Buzz");
	}
	
	@Test
	public void testMultiple3Et5() {
		assertEquals(f.getTab()[14],"FizzBuzz");
	}
	
}
