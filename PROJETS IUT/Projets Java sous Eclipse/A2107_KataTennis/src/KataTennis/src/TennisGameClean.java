package KataTennis.src;

public class TennisGameClean implements TennisGame {

	public static final String[] SCORES = { "Love", "Fifteen", "Thirty", "Forty" };
	public static final String WIN_FOR = "Win for ";
	public static final String ADVANTAGE = "Advantage ";
	public static final String DEUCE = "Deuce";
	public static final String ALL = "-All";
	private int p2;
	private int p1;
	private String p1N;
	private String p2N;

	public TennisGameClean(String p1N, String p2N) {
		this.p1N = p1N;
		this.p2N = p2N;
	}

	public String getScore() {
		
		String s;
		
		//REGLE NUMERO 2
		if (debutPartie()) {

			s = SCORES[p1];

			if (sameScores()) {
				return s += ALL;
			} else {
				return s + "-" + SCORES[p2];
			}

		} else {
			
			s = playerAhead();
			
			//REGLE NUMERO 3
			if (isDeuce()) {
				return DEUCE;
			}
			
			//REGLE NUMERO 4
			if (isAdvantage()) {
				return ADVANTAGE + playerAhead();
			} else {
				return WIN_FOR + playerAhead();
			}
		}
	}

	public String playerAhead() {
		String s;
		if (p1 > p2) {
			s = p1N;
		} else {
			s = p2N;
		}
		return s;
	}

	private boolean isDeuce() {
		return sameScores() && p1 >= 3;
	}

	private boolean isAdvantage() {
		return Math.abs(p1 - p2) == 1;
	}

	private boolean sameScores() {
		return p1 == p2;
	}

	private boolean debutPartie() {
		return p1 <= 3 && p2 <= 3 && ((p1+p2) != 6);
	}

	public void wonPoint(String playerName) {
		if (playerName == this.p1N)
			this.p1 += 1;
		else
			this.p2 += 1;

	}

}