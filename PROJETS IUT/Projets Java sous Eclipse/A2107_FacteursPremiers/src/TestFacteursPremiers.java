import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFacteursPremiers {
	private DecompositionEnFacteursPremiers d;

	@Before
	public void setUp() throws Exception {
		this.d = new DecompositionEnFacteursPremiers();
	}

	@After
	public void tearDown() throws Exception {
		this.d = null;
	}

	@Test
	public void UnNapasDeFacteursPremiers() {
		assertEquals(Arrays.asList(), d.compute(1));
	}

	@Test
	public void DeuxAUnFacteurPremierDeux() {
		assertEquals(Arrays.asList(2), d.compute(2));
	}
	
	@Test
	public void TroisAUnFacteurPremierTrois() {
		assertEquals(Arrays.asList(3), d.compute(3));
	}
	
	@Test
	public void QuatreADeuxFacteursPremierDeux() {
		assertEquals(Arrays.asList(2,2), d.compute(4));
	}
	
	@Test
	public void CinquAUnFacteurPremierCinq() {
		assertEquals(Arrays.asList(5), d.compute(5));
	}
	
	@Test
	public void HuitATroisFacteursPremiersDeux() {
		assertEquals(Arrays.asList(5), d.compute(5));
	}
	
	@Test
	public void NeufADeuxFacteursPremiersTrois() {
		assertEquals(Arrays.asList(3,3), d.compute(9));
	}
	
	@Test
	public void DixADeuxFacteursPremiersDeuxEtCinq() {
		assertEquals(Arrays.asList(2,5), d.compute(10));
	}
	
	@Test
	public void QuaranteDeuxATroisFacteursPremiersDeuxTroisEtSept() {
		assertEquals(Arrays.asList(2,3,7), d.compute(42));
	}
}
