
public abstract class Robot {
	
	private String nom;
	private int direction;
	private Position pos;
	
	public static final int NORD = 0;
	public static final int EST = 1;
	public static final int SUD = 2;
	public static final int OUEST = 3;
	
	public Robot(String n, int d, Position p) throws IllegalArgumentException {
		if (d > 3 || d < 0) {
			throw new IllegalArgumentException("Direction invalide");
		}
		this.nom = n;
		this.direction = d;
		this.pos = p;
	}
	
	public String getNom() {
		return nom;
	}

	public int getDirection() {
		return direction;
	}

	public Position getPos() {
		return pos;
	}

	public void avancer() {
		if (this.direction == Robot.NORD) {
			this.pos.setLigne(this.pos.getLigne()-1);
		}
		if (this.direction == Robot.EST) {
			this.pos.setColonne(this.pos.getColonne()+1);
		}  
		if (this.direction == Robot.SUD ) {
			this.pos.setLigne(this.pos.getLigne()+1);
		}
		if (this.direction == Robot.OUEST) {
			this.pos.setColonne(this.pos.getColonne()-1);
		}
	}
	
	public void pivoterDroite() {
		if (this.direction == Robot.NORD) {
			this.direction = Robot.EST;
		}
		if (this.direction == Robot.EST) {
			this.direction = Robot.SUD;
		}
		if (this.direction == Robot.SUD) {
			this.direction = Robot.OUEST;
		}
		if (this.direction == Robot.OUEST) {
			this.direction = Robot.NORD;
		}
	}
	
	public void pivoterGauche() {
		if (this.direction == Robot.NORD) {
			this.direction = Robot.OUEST;
		}
		if (this.direction == Robot.EST) {
			this.direction = Robot.NORD;
		}
		if (this.direction == Robot.SUD) {
			this.direction = Robot.EST;
		}
		if (this.direction == Robot.OUEST) {
			this.direction = Robot.SUD;
		}
	}
	
	public abstract void seDeplacer();
	
}
