package businessModel;

public class Score implements Scoreable {
	
	protected int score;
	
	public Score() {
		this.score = 0;
	}

	@Override
	public void one() {
		this.score += 1;
	}

	@Override
	public void two() {
		this.score += 2;
	}

	@Override
	public void three() {
		this.score += 3;
	}

	@Override
	public int getScore() {
		return this.score;
	}

}
