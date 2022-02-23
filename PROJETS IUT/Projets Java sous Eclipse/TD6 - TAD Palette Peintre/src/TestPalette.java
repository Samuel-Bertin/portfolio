import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPalette {
	
	private Palette palette;

	
	@Before
	public void setUp() throws Exception {
		this.palette = new PaletteAvecListeDeCouleurs();
	}

	@After
	public void tearDown() throws Exception {
		this.palette = null;
	}

	@Test
	public void P1() {
		assertTrue(this.palette.estPropre());
	}
	
	@Test
	public void P2() {
		this.palette.essuyer();
		assertTrue(this.palette.estPropre());
	}
	
	@Test
	public void P3() {
		this.palette.ajouter(new CouleurRVB(255, 255, 0));
		assertFalse(this.palette.estPropre());
	}
	
	@Test (expected = RuntimeException.class)
	public void Précondition_couleur() {
		this.palette.couleur();
	}
	
	@Test
	public void P4_Si() {
		this.palette.ajouter(new CouleurRVB(255, 255, 0));
		assertEquals(this.palette.couleur().getRouge(), 255);
		assertEquals(this.palette.couleur().getVert(), 255);
		assertEquals(this.palette.couleur().getBleu(), 0);
	}
	
	@Test
	public void P4_Sinon() {
		Couleur jaune = new CouleurRVB(255, 255, 0);
        Couleur rouge = new CouleurRVB(255, 0, 0);
		Couleur bleu = new CouleurRVB(0, 0, 255);
        this.palette.ajouter(jaune);
		this.palette.ajouter(rouge);
		this.palette.ajouter(bleu);
		assertEquals(this.palette.couleur().getRouge(), 127);
		assertEquals(this.palette.couleur().getVert(), 63);
		assertEquals(this.palette.couleur().getBleu(), 127);
	}

}
