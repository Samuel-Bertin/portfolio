import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PointTest {
	
	private Point pc;

	@Before
	public void setUp() throws Exception {
		this.pc = new Point(1,2);
		assertEquals(1,this.pc.getAbscisse(),0.0001);
		assertEquals(2,this.pc.getOrdonnée(),0.0001);
	}

	@After
	public void tearDown() throws Exception {
		this.pc = null;
	}

	@Test
	public void testPointOrigine() {
		assertEquals(0, Point.POINT_ORIGINE.getAbscisse(),0.0001);
		assertEquals(0, Point.POINT_ORIGINE.getOrdonnée(),0.0001);
	}

	@Test
	public void testGetAbscisse() {
		assertEquals(1,this.pc.getAbscisse(),0.0001);
	}

	@Test
	public void testGetOrdonnée() {
		assertEquals(2,this.pc.getOrdonnée(),0.0001);
	}

	@Test
	public void testTranslater() {
		this.pc.translater(1, 1);
		assertEquals(2, pc.getAbscisse(),0.0001);
		assertEquals(3, pc.getOrdonnée(), 0.0001);
	}

	@Test
	public void testMettreAEchelle() {
		this.pc.mettreAEchelle(2);
		assertEquals(2, pc.getAbscisse(), 0.0001);
		assertEquals(4, pc.getOrdonnée(), 0.0001);
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testEchelleNegative() {
		this.pc.mettreAEchelle(-1);
		assertEquals(-1, pc.getAbscisse(), 0.0001);
		assertEquals(-2, pc.getOrdonnée(), 0.0001);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testEchelleNulle() {
		this.pc.mettreAEchelle(0);
		assertEquals(0, pc.getAbscisse(), 0.0001);
		assertEquals(0, pc.getOrdonnée(), 0.0001);
	}
	
	
}
