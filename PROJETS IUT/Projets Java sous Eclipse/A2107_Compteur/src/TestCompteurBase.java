import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCompteurBase {
	
	
	/*Test que la valeur d'un compteur est à zero lors de sa création */
	@Test
	public void testValueAfterCreate() {
		Compteur c = new Compteur();
		assertEquals(0,c.getValeur());
	}
	
	/*Test que la valeur d'un compteur est à un lors de l'appel ajouterUn sur un compteur nul*/
	@Test
	public void testAjouterUnBasique() {
		Compteur c = new Compteur();
		c.ajouterUn();
		assertEquals(1,c.getValeur());
	}
	
	/*Test que la valeur d'un compteur passe au rang suivant (quand le compteur est a 9 on passe a 0)*/
	@Test
	public void testAjouterUn() {
		Compteur c = new Compteur();
		ajouterN(9, c);
		assertEquals(9,c.getValeur());
		c.ajouterUn();
		assertEquals(0,c.getValeur());
	}
	
	/*Test la remise a zéro du compteur*/
	@Test
	public void testRemiseZero() {
		Compteur c = new Compteur();
		ajouterN(5,c);
		c.remettreZero();
		assertEquals(0, c.getValeur());
	}
	
	/*méthode permettant d'ajouter N fois un à un compteur*/
	private void ajouterN(int n, Compteur c) {
		for (int i = 0; i < n; i++) {
			c.ajouterUn();
		}
	}
	
	

}
