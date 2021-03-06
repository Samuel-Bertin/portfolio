public class CompteurEntier implements Compteur {

	private int valeur;

	public CompteurEntier() {
		this.valeur = 0;
	}

	public int getValeur() {
		return this.valeur;
	}

	public void ajouterUn() {
		this.valeur = (this.valeur + 1) % 10;
	}

	public void remettreAZéro() {
		this.valeur = 0;
	}

	public String toString() {
		return "compteur : " + this.valeur + "\n" + new JoliAfficheur(this.valeur);
	}
}