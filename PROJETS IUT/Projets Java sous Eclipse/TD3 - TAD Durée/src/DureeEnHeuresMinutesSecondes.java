
public class DureeEnHeuresMinutesSecondes implements Duree {

	private int secondes; //entier des secondes
	private int minutes; //entier des minutes
	private int heures; //entier des heures
	
	//Op�rations 
	
	//Construction
	public DureeEnHeuresMinutesSecondes(int h, int m, int s) throws IllegalArgumentException {
		
		if (h < 0) {
			throw new IllegalArgumentException("Les heures n�gatives ne sont pas accept�es");
		}
		if ( m < 0 || m > 59 ) {
			throw new IllegalArgumentException("Les minutes doivent �tre comprises entre 0 et 59 inclus.");
		}
		if ( s < 0 || s > 59 ) {
			throw new IllegalArgumentException("Les secondes doivent �tre comprises entre 0 et 59 inclus.");
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
	
	//confirme l'�galit� d'une dur�e avec la dur�e fournie en parametre
	public boolean egal(Duree d2) {
		return this.heures == d2.getHeures() && this.minutes == d2.getMinutes() && this.secondes == d2.getSecondes();
	}
	
	//confirme l'inf�riot� d'une dur�e avec la dur�e fournie en param�tre
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
	
	//retourne une dur�e sous forme de chaine de caract�res
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
	 * Propri�t�s
	(P1) heures (uneDur�e (h, m, s)) = h
	(P2) minutes (uneDur�e (h, m, s)) = m
	(P3) secondes (uneDur�e (h, m, s)) = s
	(P4) �gal (uneDur�e(h1, m1, s1), uneDur�e(h2, m2, s2)) = h1 = h2 et m1 = m2 et s1 = s2
	(P5) inf (uneDur�e(h1, m1, s1), uneDur�e(h2, m2, s2)) = h1 < h2 ou (h1 = h2 et m1 < m2) ou (h1 = h2 et m1 = m2 et s1 < s2)
	(P6) ajouterUneSeconde (uneDur�e(h, m, s)) = si s < 59 alors uneDur�e (h, m, s+1)
			sinon si m < 59 alors uneDur�e (h, m+1, 0)
			sinon uneDur�e (h+1, 0, 0)
	 */
}
