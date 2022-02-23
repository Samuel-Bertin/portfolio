
public class DureeEnSecondes implements Duree {

	private int secondes; //entier des secondes

	
	//Construction
	public DureeEnSecondes(int h, int m, int s) throws IllegalArgumentException {
		
		if (h < 0) {
			throw new IllegalArgumentException("Les heures négatives ne sont pas acceptées");
		}
		if ( m < 0 || m > 59 ) {
			throw new IllegalArgumentException("Les minutes doivent être comprises entre 0 et 59 inclus.");
		}
		if ( s < 0 || s > 59 ) {
			throw new IllegalArgumentException("Les secondes doivent être comprises entre 0 et 59 inclus.");
		}
		
		this.secondes = (3600*h + 60*m + s);
	}
	
	
	//retourne la valeur des heures 
	public int getHeures() {
		return this.secondes / 3600 ;
	}
	
	//retourne la valeur des minutes
	public int getMinutes() {
		return ((this.secondes - this.getHeures()*3600 ) / 60 );
	}

	//retourne la valeur des secondes
	public int getSecondes() {
		return ((this.secondes - this.getHeures()*3600) - this.getMinutes()*60);
	}
	
	//confirme l'égalité d'une durée avec la durée fournie en parametre
	public boolean egal(Duree d2) {
		if (this.getHeures() == d2.getHeures() && this.getMinutes() == d2.getMinutes() && this.secondes == d2.getSecondes()) {
			return true;
		} else {
			return false;
		}
	}
	
	//confirme l'inférioté d'une durée avec la durée fournie en paramètre
	public boolean inf(Duree d2) {
		if (this.getHeures() < d2.getHeures()) {
			return true;
		} else {
			if (this.getHeures() == d2.getHeures() && this.getMinutes() < d2.getMinutes()) {
				return true;
			} else {
				if (this.getHeures() == d2.getHeures() && this.getMinutes() == d2.getMinutes() && this.getSecondes() < d2.getSecondes()) {
					return true;
				} else {
			return false;
				}
			}
		}
	}
	
	//retourne une durée sous forme de chaine de caractères
	public String toString() {
		return "("+this.getHeures()+":"+this.getMinutes()+":"+this.getSecondes()+")";
	}
	
	
	//Modification
	public void ajouterUneSeconde() {
		this.secondes +=1 ;
	}
	
	
	/*
	 * Propriétés
	(P1) heures (uneDurée (h, m, s)) = h
	(P2) minutes (uneDurée (h, m, s)) = m
	(P3) secondes (uneDurée (h, m, s)) = s
	(P4) égal (uneDurée(h1, m1, s1), uneDurée(h2, m2, s2)) = h1 = h2 et m1 = m2 et s1 = s2
	(P5) inf (uneDurée(h1, m1, s1), uneDurée(h2, m2, s2)) = h1 < h2 ou (h1 = h2 et m1 < m2) ou (h1 = h2 et m1 = m2 et s1 < s2)
	(P6) ajouterUneSeconde (uneDurée(h, m, s)) = si s < 59 alors uneDurée (h, m, s+1)
			sinon si m < 59 alors uneDurée (h, m+1, 0)
			sinon uneDurée (h+1, 0, 0)
	 */
}
