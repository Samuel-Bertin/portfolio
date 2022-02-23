import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PileBorneeTest {
	
	PileBornee<Integer> p;

	@Before
	public void setUp() throws Exception {
		this.p = new PileBornee(2);
	}

	@After
	public void tearDown() throws Exception {
		this.p = null;
	}

	@Test
	public void testPileBorneeCreeVide() {
		assertTrue(this.p.isEmpty() );
	}
	
	@Test
	public void testPileBorneeCreeValeur() throws EmptyStackException, FullStackException {
		this.p.push(11);
		assertEquals((Integer)11, this.p.top());
	}
	
	@Test
	public void testPileBorneeCreeTailleMax(){
		assertEquals(2, this.p.getMaxSize() );
	}
	
	@Test
	public void testPileBorneeCreeTailleInchangee() throws FullStackException{
		this.p.push(11);
		assertEquals(2, this.p.getMaxSize() );
	}
	
	@Test
	public void testPileBorneeCreeNbElements() {
		assertEquals(0, this.p.getSize() );
	}
	
	@Test
	public void testPileBornee2ElementsTaille() throws FullStackException {
		this.p.push(11);
		assertEquals(1, this.p.getSize());
		this.p.push(22);
		assertEquals(2, this.p.getSize());
	}
	
	@Test
	public void testPileBorneeCreePasPleine() {
		assertFalse(this.p.isFull());
	}
	
	@Test
	public void testPileBornee2ElementsCreePasPleine() throws FullStackException {
		this.p.push(11);
		assertFalse(this.p.isFull());
		this.p.push(22);
		assertTrue(this.p.isFull());
	}

	@Test
	public void testPileBornee2ElementsVal() throws EmptyStackException, FullStackException {
		this.p.push(11);
		assertEquals((Integer)11, this.p.top());
		this.p.push(22);
		assertEquals((Integer)22, this.p.top());
	}
	
	@Test
	public void testPileBorneePop() throws EmptyStackException, FullStackException {
		this.p.push(11);
		this.p.pop();
		assertEquals(2, this.p.getMaxSize());
		assertEquals(0, this.p.getSize());
	}
	
	@Test
	public void testPileBorneePopVide() throws EmptyStackException, FullStackException {
		this.p.push(11);
		assertEquals((Integer)11, this.p.top());
		this.p.pop();
		assertTrue(this.p.isEmpty());
		this.p.push(11);
		this.p.push(22);
		this.p.pop();
		assertEquals((Integer)11, this.p.top());
	}
	
	@Test
	public void testPileBorneeToString() throws FullStackException {
		assertEquals("PileBornee [maxSize = 2, size = 0, elements = ]", this.p.toString());
		this.p.push(11);
		assertEquals("PileBornee [maxSize = 2, size = 1, elements = 11 ]", this.p.toString());
	}
	
	@Test(expected = EmptyStackException.class)
	public void testPileBorneeTopException() throws EmptyStackException {
		this.p.top();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPileBorneeConstructeurException() throws IllegalArgumentException {
		PileBornee<Integer> p2 = new PileBornee(0);
		PileBornee<Integer> p3 = new PileBornee(-4);
	}
	
	@Test(expected = EmptyStackException.class)
	public void testPileBorneePopException() throws EmptyStackException {
		this.p.pop();
	}
	
	@Test(expected = FullStackException.class)
	public void testPilePushException() throws FullStackException {
		this.p.push(11);
		this.p.push(22);
		this.p.push(33);
	}
	
	
	
}
