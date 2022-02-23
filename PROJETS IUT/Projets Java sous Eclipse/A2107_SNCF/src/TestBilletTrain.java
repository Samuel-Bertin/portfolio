import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBilletTrain {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDistanceParcourueAuMoins2km() {
		BilletTrain sncf = new BilletTrain(BilletTrain.DISTANCE[0]-.5F);
	}

	@Test
	public void testTarifBar�meBordPlusde2kms() {
		BilletTrain sncf = new BilletTrain(BilletTrain.DISTANCE[0]+5F);
		assertEquals(BilletTrain.BAREMEBORD[0], sncf.getTarif(true));
	}

	@Test
	public void testTarifBar�meContr�lePlusde2kms() {
		BilletTrain sncf = new BilletTrain(BilletTrain.DISTANCE[0]+.5F);
		assertEquals(BilletTrain.BAREMECONTROLE[0], sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBaremeBordPlusde25kms() {
		BilletTrain sncf = new BilletTrain(BilletTrain.DISTANCE[1]+5F);
		assertEquals(BilletTrain.BAREMEBORD[1], sncf.getTarif(true));
	}
	
	@Test
	public void testTarifBar�meContr�lePlusde25kms() {
		BilletTrain sncf = new BilletTrain(BilletTrain.DISTANCE[1]+5F);
		assertEquals(BilletTrain.BAREMECONTROLE[1], sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBaremeBordPlusde50kms() {
		BilletTrain sncf = new BilletTrain(BilletTrain.DISTANCE[2]+5F);
		assertEquals(BilletTrain.BAREMEBORD[2], sncf.getTarif(true));
	}
	
	@Test
	public void testTarifBar�meContr�lePlusde50kms() {
		BilletTrain sncf = new BilletTrain(BilletTrain.DISTANCE[2]+5F);
		assertEquals(BilletTrain.BAREMECONTROLE[2], sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBaremeBordPlusde100kms() {
		BilletTrain sncf = new BilletTrain(BilletTrain.DISTANCE[3]+5F);
		assertEquals(BilletTrain.BAREMEBORD[3], sncf.getTarif(true));
	}
	
	@Test
	public void testTarifBar�meContr�lePlusde100kms() {
		BilletTrain sncf = new BilletTrain(BilletTrain.DISTANCE[3]+5F);
		assertEquals(BilletTrain.BAREMECONTROLE[3], sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBaremeBordPlusde150kms() {
		BilletTrain sncf = new BilletTrain(BilletTrain.DISTANCE[4]+5F);
		assertEquals(BilletTrain.BAREMEBORD[4], sncf.getTarif(true));
	}
	
	@Test
	public void testTarifBar�meContr�lePlusde150kms() {
		BilletTrain sncf = new BilletTrain(BilletTrain.DISTANCE[4]+5F);
		assertEquals(BilletTrain.BAREMECONTROLE[4], sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBaremeBordPlusde300kms() {
		BilletTrain sncf = new BilletTrain(BilletTrain.DISTANCE[5]+5F);
		assertEquals(BilletTrain.BAREMEBORD[5], sncf.getTarif(true));
	}
	
	@Test
	public void testTarifBar�meContr�lePlusde300kms() {
		BilletTrain sncf = new BilletTrain(BilletTrain.DISTANCE[5]+5F);
		assertEquals(BilletTrain.BAREMECONTROLE[5], sncf.getTarif(false));
	}
	
}
