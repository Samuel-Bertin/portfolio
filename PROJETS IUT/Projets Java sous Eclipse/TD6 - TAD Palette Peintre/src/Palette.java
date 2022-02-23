
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
		Opérations
		unePalette : ® Palette
		estPropre : Palette ® Booléen
		couleur : Palette ® Couleur
		ajouter : Palette x Couleur ® Palette
		essuyer : Palette ® Palette
		Préconditions
		couleur (p) ssi estPropre (p) = faux
		Propriétés
		(P1) estPropre (unePalette) = vrai
		(P2) estPropre (essuyer (p)) = vrai
		(P3) estPropre (ajouter (p, c)) = faux
		(P4) couleur (ajouter (p, c)) =
		si estPropre (p) alors c
		sinon mélanger (couleur (p), c, 0.5)
	 */
}
