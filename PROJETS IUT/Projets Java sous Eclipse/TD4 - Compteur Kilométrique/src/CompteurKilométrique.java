
public interface CompteurKilométrique {

	// Opérations
	
		// Consultation
		public abstract int versEntier();
		// Modification 
		public abstract void ajouterUn();
		
		// Evaluation
		public abstract boolean egal(CompteurKilométrique c);
		public abstract boolean inf(CompteurKilométrique c);
		
		/*//toString
		public abstract String toString();*/

	
	/*Propriétés
	(P1) compteurNul = unCompteur (0)
	(P2) ajouterUn (c) = unCompteur (versEntier(c) + 1)
	(P3) égal (unCompteur (v1), unCompteur (v2)) =
	si v1 = v2 alors vrai sinon faux
	(P4) inf (unCompteur (v1), unCompteur (v2)) =
	si v1 < v2 alors vrai sinon faux
	(P5) versEntier (unCompteur (v)) = v*/
		
}
