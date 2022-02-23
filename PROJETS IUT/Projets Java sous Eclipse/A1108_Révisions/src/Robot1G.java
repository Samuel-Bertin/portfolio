public class Robot1G extends Robot {
	
	public Robot1G(String n) {
		super(n, Robot.NORD, new Position(0,0));
	}
	
	public void seDeplacer() {
		this.pivoterDroite();
		for (int i = 0; i<10; i++) {
			this.avancer();
		}
		this.pivoterDroite();
		for (int i = 0; i<15; i++) {
			this.avancer();
		}
	}
	
}
