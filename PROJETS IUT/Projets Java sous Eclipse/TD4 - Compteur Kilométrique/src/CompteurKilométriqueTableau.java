import java.util.Arrays;

public class CompteurKilométriqueTableau implements CompteurKilométrique {

	private Compteur [] compteurs;
	// Opérations
	
	//Construction
	public CompteurKilométrique unCompteur(int v) throws IllegalArgumentException {
		if (v<0 || v >= 999) {
			throw new IllegalArgumentException(" La valeur doit etre initialisée entre 0 et 999 exclus.");
		}
		return new CompteurKilométriqueTableau(v);
	}
	
	public CompteurKilométriqueTableau(int v) {
		compteurs = new Compteur[3];
		compteurs[0]  = new CompteurEntier();
		while (compteurs[0].getValeur() != v/100) {
			compteurs[0].ajouterUn();
		}
		compteurs[1] = new CompteurEntier();
		while (compteurs[1].getValeur() != ((v%100)/10)) {
			compteurs[1].ajouterUn();
		}
		compteurs[2] = new CompteurEntier();
		while (compteurs[2].getValeur() != ((v%100)%10)) {
			compteurs[2].ajouterUn();
		}
	}
	
	
	//Constantes
	public static final CompteurKilométrique COMPTEUR_NUL = new CompteurKilométriqueTableau(0);
	
	// Consultation
	
	/*//retourne la valeur d'un entier
	public int getEntier() {
		return this.valeur;
	}*/
	
	// Modification 
	public int versEntier() {
		int centaines = compteurs[0].getValeur()*100;
		int dizaines = compteurs[1].getValeur()*10;
		int unites = compteurs[2].getValeur();
		return centaines+dizaines+unites;
	}
	
	
	//ajoute 1 a la valeur d'un compteur
	public void ajouterUn() throws IllegalArgumentException {
		int v = this.versEntier();
		if (v > 998) {
			throw new IllegalArgumentException("Valeur maximale du compteur atteinte");
		} 
		if (compteurs[2].getValeur() == 9) {
			compteurs[2].remettreAZéro();
			compteurs[1].ajouterUn();
			if (compteurs[1].getValeur() >= 9) {
				compteurs[1].remettreAZéro();
				compteurs[0].ajouterUn();
				if (compteurs[0].getValeur() > 9) {
					throw new IllegalArgumentException("Valeur maximale du compteur atteinte");
				}
			}
		}
	}
	

	// Evaluation
	
	//retourne vrai si v1 == v2
	public boolean egal(CompteurKilométrique c) {
		return this.versEntier() == c.versEntier();
	}
	
	//retourne vrai si v1 < v2
	public boolean inf(CompteurKilométrique c) {
		return this.versEntier() < c.versEntier();
	}
	
	//toString
	public String toString() {
		return Arrays.toString(compteurs);
	}


	
/*Propriétés
(P1) compteurNul = unCompteur (0)
(P2) ajouterUn (c) = unCompteur (versEntier(c) + 1)
(P3) égal (unCompteur (v1), unCompteur (v2)) =
si v1 = v2 alors vrai sinon faux
(P4) inf (unCompteur (v1), unCompteur (v2)) =
si v1 < v2 alors vrai sinon faux
(P5) versEntier (unCompteur (v)) = v*/
	
	
}
