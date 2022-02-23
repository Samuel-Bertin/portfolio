
public class Compteur {
	
	private int valeur;
	
	public Compteur() {
		this.remettreZero();
	}
	
	public int getValeur() {
		return this.valeur;
	}

	public void ajouterUn() {
		this.valeur += 1;
		this.valeur %= 10;
	}

	public void remettreZero() {
		this.valeur = 0;
	}
}
