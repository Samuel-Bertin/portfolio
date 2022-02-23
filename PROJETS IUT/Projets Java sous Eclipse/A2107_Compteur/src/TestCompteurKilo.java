import static org.junit.Assert.*;

import org.junit.Test;

public class TestCompteurKilo {
	
	
	@Test
	public void testCreate() {
		CompteurKilo c = new CompteurKilo();
		assertEquals(0, c.toInteger());
	}
	
	@Test
	public void testToInteger() {
	}
	
	@Test
	public void testAjouterUnSubNine() throws CompteurException {
		CompteurKilo c = new CompteurKilo();
		ajouterN(7, c);
		assertEquals(7, c.toInteger());
	}
	
	@Test
	public void testAjouterUnToNine() throws CompteurException {
		CompteurKilo c = new CompteurKilo();
		ajouterN(9, c);
		assertEquals(9, c.toInteger());
		c.ajouterUn();
		assertEquals(10, c.toInteger());
	}
	
	@Test
	public void testAjouterUnToFortyNine() throws CompteurException {
		CompteurKilo c = new CompteurKilo();
		ajouterN(49, c);
		assertEquals(49, c.toInteger());
		c.ajouterUn();
		assertEquals(50, c.toInteger());
	}
	
	@Test
	public void testAjouterUnToNinetyNine() throws CompteurException {
		CompteurKilo c = new CompteurKilo();
		ajouterN(99, c);
		assertEquals(99, c.toInteger());
		c.ajouterUn();
		assertEquals(100, c.toInteger());
	}
	
	@Test
	public void testAjouterUnRand() throws CompteurException{
		CompteurKilo c = new CompteurKilo();
		ajouterN(432,c);
		assertEquals(432, c.toInteger());
		c.ajouterUn();
		assertEquals(433, c.toInteger());
	}
	
	@Test
	public void equalsSame() throws CompteurException {
		CompteurKilo c = new CompteurKilo();
		ajouterN(355,c);
		assertTrue(c.isEqualsTo(c));
	}
	
	@Test
	public void equalsValue() throws CompteurException {
		CompteurKilo c = new CompteurKilo();
		CompteurKilo c2 = new CompteurKilo();
		ajouterN(355,c);
		ajouterN(355,c2);
		assertTrue(c.isEqualsTo(c2));
	}
	
	@Test
	public void equalsNot() throws CompteurException {
		CompteurKilo c = new CompteurKilo();
		CompteurKilo c2 = new CompteurKilo();
		ajouterN(355,c);
		ajouterN(354,c2);
		assertFalse(c.isEqualsTo(c2));
	}
	
	@Test
	public void testToString() throws CompteurException {
		CompteurKilo c = new CompteurKilo();
		assertEquals("Compteur Journalier: 0 0 0 kms", c.toString());
		ajouterN(537,c);
		assertEquals("Compteur Journalier: 5 3 7 kms", c.toString());
	}
	
	@Test(expected = CompteurException.class)
	public void testTropDeKilomètres() throws CompteurException {
		CompteurKilo c = new CompteurKilo();
		ajouterN(999,c);
		c.ajouterUn();
	}
	
	public void ajouterN(int n, CompteurKilo c) throws CompteurException {
		for (int i = 0 ; i < n ; i++) {
			c.ajouterUn();
		}
	}

}
