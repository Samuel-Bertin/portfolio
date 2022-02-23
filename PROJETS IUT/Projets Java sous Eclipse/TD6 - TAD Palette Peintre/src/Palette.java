
public interface Palette {
	
	
	//Consultation
	public abstract boolean estPropre();
	
	public abstract Couleur couleur();
	
	//Evaluation
	public abstract void display();
	
	//Modification
	public abstract void ajouter(Couleur c) throws IllegalArgumentException;
	public abstract void essuyer();
	
	/*
	 * Type Palette
		Op�rations
		unePalette : � Palette
		estPropre : Palette � Bool�en
		couleur : Palette � Couleur
		ajouter : Palette x Couleur � Palette
		essuyer : Palette � Palette
		Pr�conditions
		couleur (p) ssi estPropre (p) = faux
		Propri�t�s
		(P1) estPropre (unePalette) = vrai
		(P2) estPropre (essuyer (p)) = vrai
		(P3) estPropre (ajouter (p, c)) = faux
		(P4) couleur (ajouter (p, c)) =
		si estPropre (p) alors c
		sinon m�langer (couleur (p), c, 0.5)
	 */
}
