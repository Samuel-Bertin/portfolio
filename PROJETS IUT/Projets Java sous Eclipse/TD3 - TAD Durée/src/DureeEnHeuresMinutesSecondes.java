
public class DureeEnHeuresMinutesSecondes implements Duree {

	private int secondes; //entier des secondes
	private int minutes; //entier des minutes
	private int heures; //entier des heures
	
	//Opérations 
	
	//Construction
	public DureeEnHeuresMinutesSecondes(int h, int m, int s) throws IllegalArgumentException {
		
		if (h < 0) {
			throw new IllegalArgumentException("Les heures négatives ne sont pas acceptées");
		}
		if ( m < 0 || m > 59 ) {
			throw new IllegalArgumentException("Les minutes doivent être comprises entre 0 et 59 inclus.");
		}
		if ( s < 0 || s > 59 ) {
			throw new IllegalArgumentException("Les secondes doivent être comprises entre 0 et 59 inclus.");
		}
		
		this.heures = h;
		this.minutes = m;
		this.secondes = s;
	
	}
	
	public DureeEnHeuresMinutesSecondes uneDuree(int h,int m,int s)  {
		return new DureeEnHeuresMinutesSecondes(h,m,s);
	}
	
	//Consultation
	
	//retourne la valeur des heures 
	public int getHeures() {
		return this.heures;
	}
	
	//retourne la valeur des minutes
	public int getMinutes() {
		return this.minutes;
	}
	

	//retourne la valeur des secondes
	public int getSecondes() {
		return this.secondes;
	}
	
	//confirme l'égalité d'une durée avec la durée fournie en parametre
	public boolean egal(Duree d2) {
		return this.heures == d2.getHeures() && this.minutes == d2.getMinutes() && this.secondes == d2.getSecondes();
	}
	
	//confirme l'inférioté d'une durée avec la durée fournie en paramètre
	public boolean inf(Duree d2) {
		if (this.heures < d2.getHeures()) {
			return true;
		} else {
			if (this.heures == d2.getHeures() && this.minutes < d2.getMinutes()) {
				return true;
			} else {
				if (this.heures == d2.getHeures() && this.minutes == d2.getMinutes() && this.secondes < d2.getSecondes()) {
					return true;
				} else {
						return false;
				}
			}
		}
	}
	
	//retourne une durée sous forme de chaine de caractères
	public String toString() {
		return "("+this.heures+":"+this.minutes+":"+this.secondes+")";
	}
	
	
	//Modification
	public void ajouterUneSeconde() {
		if (this.secondes < 59 ) {
			this.secondes += 1;
		} else {
			this.secondes = 0;
			if (this.minutes < 59) {
				this.minutes += 1;
			} else {
				this.heures += 1;
				this.minutes = 0;
			}
		} 
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
