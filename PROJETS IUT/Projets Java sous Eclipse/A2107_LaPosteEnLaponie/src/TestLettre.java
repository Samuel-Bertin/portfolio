import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestLettre {
	
	Lettre l, k, m, n, o, p;

	@Before
	public void setUp() throws Exception {
		this.l = new Lettre("A", "B", 31200 , 15 , 10, 0, false);
		this.k = new Lettre("A", "B", 31200 , 15 , 10, 0, true);
		this.m = new Lettre("A", "B", 31200 , 15 , 10, 1, false);
		this.n = new Lettre("A", "B", 31200 , 15 , 10, 1, true);
		this.o = new Lettre("A", "B", 31200 , 15 , 10, 2, false);
		this.p = new Lettre("A", "B", 31200 , 15 , 10, 2, true);
	}

	@After
	public void tearDown() throws Exception {
		l= null;
	}

	@Test
	public void testAffranchissementTauxRecoZeroNonUrgente() {
		assertEquals(0.5, l.affranchir(),0.1);
	}
	
	@Test
	public void testAffranchissementTauxRecoZeroUrgente() {
		assertEquals(0.8, k.affranchir(),0.1);
	}
	
	@Test
	public void testAffranchissementTauxRecoUnNonUrgente() {
		assertEquals(1, m.affranchir(),0.1);
	}
	
	@Test
	public void testAffranchissementTauxRecoUnUrgente() {
		assertEquals(1.3, n.affranchir(),0.1);
	}
	
	
	@Test
	public void testAffranchissementTauxRecoDeuxNonUrgente() {
		assertEquals(2, o.affranchir(),0.1);
	}
	
	@Test
	public void testAffranchissementTauxRecoDeuxUrgente() {
		assertEquals(2.3, p.affranchir(),0.1);
	}
	
	@Test
	public void restRemboursementTauxReco0() {
		assertEquals(0, l.rembourser(), 0.1);
	}
	
	@Test
	public void restRemboursementTauxReco1() {
		assertEquals(1.5, n.rembourser(), 0.1);
	}
	
	@Test
	public void restRemboursementTauxReco2() {
		assertEquals(15, o.rembourser(), 0.1);
	}
	
	@Test
	public void TestToString() {
		assertEquals("Lettre[31200/B/0/ordinaire]", l.toString());
	}
	
	@Test
	public void TestToStringUrgent() {
		assertEquals("Lettre[31200/B/0/urgent]", k.toString());
	}

}
