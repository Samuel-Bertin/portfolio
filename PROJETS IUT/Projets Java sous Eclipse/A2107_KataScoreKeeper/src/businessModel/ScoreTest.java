package businessModel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ScoreTest {
	
	Score s;

	@Before
	public void setUp() throws Exception {
		this.s = new Score();
	}

	@After
	public void tearDown() throws Exception {
		this.s = null;
	}

	@Test
	public void testConstructeur() {
		assertEquals(this.s.getScore(),0);
	}
	
	@Test
	public void testOne() {
		this.s.one();
		assertEquals(this.s.getScore(),1);
	}
	
	@Test
	public void testTwo() {
		this.s.two();
		assertEquals(this.s.getScore(),2);
	}
	
	@Test
	public void testThree() {
		this.s.three();
		assertEquals(this.s.getScore(),3);
	}
	

}
