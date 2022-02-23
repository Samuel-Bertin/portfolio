import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PointColoréTest extends PointTest {
	
	private PointColoré pc;

	@Before
	public void setUp() throws Exception {
		this.pc = new PointColoré(1,2,1,2,3);
		super.setUp();/*
		pc.setNuanceRouge(1);
		pc.setNuanceVert(2);
		pc.setNuanceBleu(3);*/
	}

	@After
	public void tearDown() throws Exception {
		this.pc = null;
	}
	
	@Test
	public void testPointOrigine() {
		assertEquals(0,PointColoré.POINT_ORIGINE.getAbscisse(),0);
		assertEquals(0,PointColoré.POINT_ORIGINE.getOrdonnée(),0);
		assertEquals(0,PointColoré.POINT_ORIGINE.getNuanceRouge());
		assertEquals(0,PointColoré.POINT_ORIGINE.getNuanceVert());
		assertEquals(0,PointColoré.POINT_ORIGINE.getNuanceBleu());
	}


	@Test
	public void testPointColoré() {
		assertEquals(1,this.pc.getAbscisse(),0);
		assertEquals(2,this.pc.getOrdonnée(),0);
		assertEquals(1,this.pc.getNuanceRouge());
		assertEquals(2,this.pc.getNuanceVert());
		assertEquals(3,this.pc.getNuanceBleu());
	}

	@Test
	public void testGetNuanceRouge() {
		assertEquals(1, this.pc.getNuanceRouge());
	}

	@Test
	public void testGetNuanceVert() {
		assertEquals(2, this.pc.getNuanceVert());
	}

	@Test
	public void testGetNuanceBleu() {
		assertEquals(3, this.pc.getNuanceBleu());
	}

	@Test
	public void testSetNuanceRouge() {
		pc.setNuanceRouge(5);
		assertEquals(5,pc.getNuanceRouge());
	}

	@Test
	public void testSetNuanceVert() {
		pc.setNuanceVert(5);
		assertEquals(5,pc.getNuanceVert());
	}

	@Test
	public void testSetNuanceBleu() {
		pc.setNuanceBleu(5);
		assertEquals(5,pc.getNuanceBleu());
	}

}
