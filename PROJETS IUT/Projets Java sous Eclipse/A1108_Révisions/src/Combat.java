import java.util.*;
public class Combat {

	private List<Robot> list;
	private Position cible;

	public static final int NB_ESSAIS = 100;

	public Combat() {
		this.list = new ArrayList<Robot>();
	}

	public void addRobot(Robot r) {
		this.list.add(r);
	}

	public void setCible(Position p) {
		this.cible = p;
	}

	public boolean checkCible() throws IllegalArgumentException {
		boolean touché = false;
		if (this.list.size() == 0) {
			throw new IllegalArgumentException("Pas de Robots");
		}
		for (Robot r : list) {
			if (r.getPos().equals(this.cible)) {
				touché = true;
			}
		} 
		return touché;
	}

	public void simulerCombat() {
		int compteur = 0;
		while (this.checkCible() == false && compteur < NB_ESSAIS) {
			for (Robot r : this.list) {
				r.seDeplacer();
			}
			compteur++;
		}

		if (this.checkCible()) {
			System.out.println("Nb Essais = "+(compteur+1));
			for (Robot r : this.list) {
				if (r.getPos().equals(this.cible)) {
					System.out.println("Robot(s) touchant la cible = "+r.getNom());
				}
			}
		} else {
			System.out.println("Cible non atteinte");
		}
	}
}
