public interface Compteur {
	
	public abstract int getValeur();

	public abstract void ajouterUn();

	public abstract void remettreAZéro();

	/*
	 * 
	 * (P1) valeur (unCompteur) = 0 (P2) valeur (ajouterUn (c)) = (getValeur (c) +
	 * 1) % 10 (P3) remettreAZéro (c) = unCompteur
	 */

}