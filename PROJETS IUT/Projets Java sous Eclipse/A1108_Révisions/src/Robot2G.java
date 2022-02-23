
public class Robot2G extends Robot {
	
	public Robot2G(String n, Position p) {
		super(n,Robot.EST, p);
	}

	public void avancerNpas(int n) {
		for (int i = 0; i<n; i++) {
			if (this.getDirection() == Robot.NORD) {
				this.getPos().setLigne(this.getPos().getLigne()-1);
			}
			if (this.getDirection() == Robot.EST) {
				this.getPos().setColonne(this.getPos().getColonne()+1);
			}  
			if (this.getDirection() == Robot.SUD ) {
				this.getPos().setLigne(this.getPos().getLigne()+1);
			}
			if (this.getDirection() == Robot.OUEST) {
				this.getPos().setColonne(this.getPos().getColonne()-1);
			}
		}
	}
	
	public void faireDemiTour() {
		this.pivoterDroite();
		this.pivoterDroite();
	}
	
	public void seDeplacer() {
		this.pivoterGauche();
		this.avancerNpas(10);
		this.faireDemiTour();
		this.avancerNpas(3);
		this.pivoterDroite();
		this.avancerNpas(11);
	}
	
}
