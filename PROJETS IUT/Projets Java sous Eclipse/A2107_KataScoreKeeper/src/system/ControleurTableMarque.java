package system;

import businessModel.ScoreKeeper;

public class ControleurTableMarque {
	
	public ScoreKeeper sk;

	
	public ControleurTableMarque(ScoreKeeper s) {
		this.sk = s;
	}

	public void actionPerformed(Event e) {
		
		switch (e) {
		
		case PRESSBUTTONA1:
			this.sk.scoreTeamAOne();
			break;
		case PRESSBUTTONA2 : 
			this.sk.scoreTeamATwo();
			break;
		case PRESSBUTTONA3 :
			this.sk.scoreTeamAThree();
			break;
		case PRESSBUTTONB1 :
			this.sk.scoreTeamBOne();
			break;
		case PRESSBUTTONB2 :
			this.sk.scoreTeamBTwo();
			break;
		case PRESSBUTTONB3 :
			this.sk.scoreTeamBThree();
			break;
		}

	}
	
	public String getScore() {
		String scoreA = String.format("%03d", this.sk.getScoreTeamA());
		String scoreB = String.format("%03d", this.sk.getScoreTeamB());
		String result = scoreA+":"+scoreB;
		return result;
	}
	
	

}
