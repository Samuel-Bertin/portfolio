package businessModel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import system.ControleurTableMarque;

public class ScoreKeeperTest {
	
	ScoreKeeper sk;
	ControleurTableMarque c;

	@Before
	public void setUp() throws Exception {
		this.sk = new ScoreKeeper();
		this.c = new ControleurTableMarque(this.sk);
	}

	@After
	public void tearDown() throws Exception {
		this.sk = null;
	}

	@Test
	public void testInitialisation() {
		assertEquals(this.sk.getScoreTeamA(),0);
		assertEquals(this.sk.getScoreTeamB(),0);
	}
	
	@Test
	public void testScoreTeamAOne() {
		this.sk.scoreTeamAOne();
		assertEquals(this.sk.getScoreTeamA(),1);
	}
	
	@Test
	public void testScoreTeamATwo() {
		this.sk.scoreTeamATwo();
		assertEquals(this.sk.getScoreTeamA(),2);
	}
	
	@Test
	public void testScoreTeamAThree() {
		this.sk.scoreTeamAThree();
		assertEquals(this.sk.getScoreTeamA(),3);
	}
	
	@Test
	public void testScoreTeamBOne() {
		this.sk.scoreTeamBOne();
		assertEquals(this.sk.getScoreTeamB(),1);
	}
	
	@Test
	public void testScoreTeamBTwo() {
		this.sk.scoreTeamBTwo();
		assertEquals(this.sk.getScoreTeamB(),2);
	}
	
	@Test
	public void testScoreTeamBThree() {
		this.sk.scoreTeamBThree();
		assertEquals(this.sk.getScoreTeamB(),3);
	}
	
	@Test
	public void testScoreBothTeams() {
		this.sk.scoreTeamAThree();
		this.sk.scoreTeamBOne();
		assertEquals("003:001",this.c.getScore());
	}
 
}
