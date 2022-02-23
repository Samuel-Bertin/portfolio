
public class Robot3G extends Robot2G{
	
	private boolean turbo;

	public Robot3G(String n, Position p) {
		super(n,p);
		this.turbo = false;
	}

	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	
	public void seDeplacer() {
		if (this.turbo) {
			super.seDeplacer();
		}
		super.seDeplacer();
	}
	
	
}
