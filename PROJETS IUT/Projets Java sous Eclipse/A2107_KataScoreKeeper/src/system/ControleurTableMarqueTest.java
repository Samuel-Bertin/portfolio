package system;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businessModel.ScoreKeeper;

public class ControleurTableMarqueTest {
	
	ControleurTableMarque controleur;

	@Before
	public void setUp() throws Exception {
		controleur = new ControleurTableMarque(new ScoreKeeper());
	}

	@After
	public void tearDown() throws Exception {
		controleur = null;
	}

	@Test
	public void testFormatingOfTheScores() {
		assertEquals("000:000", this.controleur.getScore());
	}
	
	@Test
	public void testPressA1() {
		this.controleur.actionPerformed(Event.PRESSBUTTONA1);
		assertEquals(1, this.controleur.sk.getScoreTeamA());
	}
	
	@Test
	public void testPressA2() {
		this.controleur.actionPerformed(Event.PRESSBUTTONA2);
		assertEquals(2, this.controleur.sk.getScoreTeamA());
	}
	
	@Test
	public void testPressA3() {
		this.controleur.actionPerformed(Event.PRESSBUTTONA3);
		assertEquals(3, this.controleur.sk.getScoreTeamA());
	}
	
	@Test
	public void testPressB1() {
		this.controleur.actionPerformed(Event.PRESSBUTTONB1);
		assertEquals(1, this.controleur.sk.getScoreTeamB());
	}
	
	@Test
	public void testPressB2() {
		this.controleur.actionPerformed(Event.PRESSBUTTONB2);
		assertEquals(2, this.controleur.sk.getScoreTeamB());
	}
	
	@Test
	public void testPressB3() {
		this.controleur.actionPerformed(Event.PRESSBUTTONB3);
		assertEquals(3, this.controleur.sk.getScoreTeamB());
	}
	
	@Test
	public void testSystème() {
	 this.controleur.actionPerformed(Event.PRESSBUTTONA3);
	 this.controleur.actionPerformed(Event.PRESSBUTTONA3);
	 this.controleur.actionPerformed(Event.PRESSBUTTONA3);
	 this.controleur.actionPerformed(Event.PRESSBUTTONA3);
	 this.controleur.actionPerformed(Event.PRESSBUTTONA3);
	 this.controleur.actionPerformed(Event.PRESSBUTTONA1);
	 this.controleur.actionPerformed(Event.PRESSBUTTONB2);
	 this.controleur.actionPerformed(Event.PRESSBUTTONB2);
	 this.controleur.actionPerformed(Event.PRESSBUTTONB2);
	 this.controleur.actionPerformed(Event.PRESSBUTTONB2);
	 this.controleur.actionPerformed(Event.PRESSBUTTONB2);
	 assertEquals("016:010", this.controleur.getScore());
	}

	

}
