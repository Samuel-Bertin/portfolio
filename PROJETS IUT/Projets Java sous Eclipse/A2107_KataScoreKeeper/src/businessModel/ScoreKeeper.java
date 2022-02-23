package businessModel;

public class ScoreKeeper {
	
	private Score teamA;
	private Score teamB;
	
	public ScoreKeeper() {
		this.teamA = new Score();
		this.teamB = new Score();
	}
	
	public void scoreTeamAOne() {
		this.teamA.one();
	}
	
	public void scoreTeamATwo() {
		this.teamA.two();
	}
	
	public void scoreTeamAThree() {
		this.teamA.three();
	}
	
	public void scoreTeamBOne() {
		this.teamB.one();
	}
	
	public void scoreTeamBTwo() {
		this.teamB.two();
	}
	
	public void scoreTeamBThree() {
		this.teamB.three();
	}
	
	public int getScoreTeamA() {
		return this.teamA.getScore();
	}
	
	public int getScoreTeamB() {
		return this.teamB.getScore();
	}
	

}
